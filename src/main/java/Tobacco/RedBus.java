package Tobacco;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
        //from
        By source_Locator = By.xpath("(//div[contains(@class,'srcDestWrapper')])[1]");
        
        WebElement srcButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(source_Locator));
       
        srcButton.click();
        
        //Select s = driver.findElement(By.xpath("//label[text()='From']")).
        
        Thread.sleep(4000);
                
        
        WebElement suggetion = driver.switchTo().activeElement();
        
        suggetion.sendKeys("Hyderabad");
        Thread.sleep(2000);
        
        //suggetion.click();
        
        WebElement hyd_city = driver.findElement(By.xpath("(//div[contains(@class,'listHeader') and  text()='Hyderabad'])[1]"));
        
        hyd_city.click();
        
        Thread.sleep(2000);
        
        WebElement dest_loc = driver.findElement(By.xpath("//div[contains(@class,'srcDestWrapper')]/descendant::input[contains(@class,inputContainer) and @id='destinput']"));
        
        dest_loc.sendKeys("Bengaluru");
        
        Thread.sleep(4000);
        
        WebElement destination = driver.findElement(By.xpath("//div[@aria-label='Kempegowda International Airport Bengaluru, Bangalore']"));
        
        destination.click();
        
        
        
        
        
        
        
	}

}
