package Tobacco;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListOfCheckBoxes {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		driver.get("https://www.amazon.in/s?k=mobiles&crid=25O6K6YZO3X44&sprefix=mobile%2Caps%2C301&ref=nb_sb_noss_2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		WebElement ele = driver.findElement(By.xpath("//a[@href='/fresh?ref_=nav_cs_grocery']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		
	 driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/21hOOiPs0KL._SY135_FMpng_.png']")).click();
		 driver.quit();
		
	}

}
