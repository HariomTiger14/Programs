package basicprograms.programs;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsergetlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/hariombhatia/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://thebuffalogroup.com/home");
		driver.manage().window().setSize(new Dimension(1920, 1080));
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		List<WebElement> allElements = driver.findElements(By.xpath("//footer/div/div/div[3]/ul/li/a"));
		String secondlinktext = allElements.get(1).getText();
		
		if (secondlinktext.contentEquals("Contracts"))
		{
			System.out.println("True, The second link text is Contracts");
		}
		
		else
		{
			System.out.println("Fail, The link text is " + secondlinktext);
		}
		
		driver.quit();

	}

}
