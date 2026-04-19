package Tobacco;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Cookie {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://westfloridaahec.org/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		Actions action = new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//li[@id='menu-item-467']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		action.moveToElement(ele).perform();
		
		WebElement ele1 = driver.findElement(By.xpath("(//span[text()='Cards'])[1]"));
		ele1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		//Select select = new Select(ele);
		
		WebElement ele2 = driver.findElement(By.xpath("(//span[@class='current-li'])[2]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		action.moveToElement(ele2).perform();
		
		driver.findElement(By.partialLinkText("36")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		System.out.println("clicked");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.findElement(By.xpath("//a[text()='Agree']")).click();
		
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		
		driver.quit();
	
		
		//select.selectByVisibleText("");
		//select.selectByValue("");
		//select.selectByIndex(0);

	}

}
