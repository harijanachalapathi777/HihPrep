package Tobacco;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHiddenElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		driver.get("https://www.amazon.in/");
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

//		driver.get("https://westfloridaahec.org/");
//		Actions action = new Actions(driver);
//
//		 WebElement ele = driver.findElement(By.xpath("(//span[text()='PROGRAMS'])[1]"));
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//
//		action.moveToElement(ele).perform(); 
//		WebElement tobacco = driver.findElement(By.xpath("(//span[text()= 'Tobacco'])[1]"));
//		//action.moveToElement(ele).perform();	
//		tobacco.click();
//		System.out.println("clicked on tobacco");
		 
		//WebElement ele = driver.findElement(By.xpath("//span[text()='Starting ₹199 | Bring joy home with every toy']"));
			WebElement ele1 = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/41cyufVtIAL._AC_SY400_.jpg']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");  // scroll by pixels
		
		js.executeScript("arguments[0].click();", ele1);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		Thread.sleep(2000);

		//WebElement ele1 = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/41cyufVtIAL._AC_SY400_.jpg']"));
		
		Thread.sleep(3000);
		ele1.click();
		
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

		
		driver.quit();

	}

}
