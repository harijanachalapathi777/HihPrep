package Tobacco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedbusAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);

        WebElement from_loc = driver.findElement(By.xpath("//input[@placeholder='Leaving From']"));
        from_loc.click();

        
	}

}
