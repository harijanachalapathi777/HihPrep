package Tobacco;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for(WebElement link : allLinks) {
			String attribute = link.getAttribute("href");
			if(attribute == null || attribute.isEmpty()) {
				System.out.println("href attribute is empty so not posible to check");
				continue;
			}
			
			try {
				URL urlLink = new URL(attribute);
				HttpURLConnection conn = (HttpURLConnection) urlLink.openConnection();
				conn.connect();
				
				if(conn.getResponseCode()>400){
					System.out.println("it's a broken link....  ");
				}
				else {
					System.out.println("link is working.....");
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			
			System.out.println(attribute);
		}
			driver.quit();	
	}

}
