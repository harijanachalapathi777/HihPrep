package Tobacco;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IplTablwAutomation {

	// print team name which has highest match points
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.iplt20.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement cookies = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Accept cookies']")));
		cookies.click();

		WebElement pointsTable = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='site-navbar-wrap']//following::li[2]//child::a[text()='POINTS TABLE']")));
		pointsTable.click();

		WebElement table = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@ng-if,'pointsTableData')]")));

		By tbodyLocator = By.id("pointsdata");
		WebElement tableData = table.findElement(tbodyLocator);

		By rows = By.tagName("tr");
		List<WebElement> tableRows = driver.findElements(rows);
		System.out.println(tableRows.size());

		List<TeamPojo> teamList = new ArrayList<>();
		for (WebElement row : tableRows) {
			By tableDataRowLocator = By.tagName("td");
			List<WebElement> rowDataList = row.findElements(tableDataRowLocator);
			if (rowDataList.size() < 15) {
		        continue; // skip header or incomplete rows
		    }
//			for (WebElement rowData : rowDataList) {
//				 System.out.println(rowData.getText());
				double nrr = Double.parseDouble(rowDataList.get(7).getText());
				int points = Integer.parseInt(rowDataList.get(10).getText());
				TeamPojo team = new TeamPojo(rowDataList.get(0).getText(), rowDataList.get(2).getText(), nrr, points);
				teamList.add(team);

		//}
	}

		for (TeamPojo data : teamList) {
             System.out.println(data);
		}
		
		driver.quit();
	}

}
