package Tobacco;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		driver.get("https://www.selenium.dev/ecosystem/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		WebElement ele = driver.findElement(By.xpath("//h2[@id='frameworks']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(8000);
		
		int rows = driver.findElements(By.xpath("(//table[@class='table'])[2]//tbody//tr")).size();
		System.out.println(rows);
		
		int columns = driver.findElements(By.xpath("(//table[@class='table'])[2]//thead//tr//th")).size();
		System.out.println(columns);
		
		//get specific row data
		WebElement secRow = driver.findElement(By.xpath("(//table[@class='table'])[2]//tbody//tr[2]//a[text()='BELLATRIX']"));
		System.out.println(secRow.getText());
		
		//get all table data
		
		System.out.println("printing data from table.....");
		for(int r=1;r<rows;r++) {
			
			for(int c=1;c<columns;c++) {
				
				String data = driver.findElement(By.xpath("(//table[@class='table'])[2]//tbody//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(data + " ");
			}
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.quit();
	}

}
