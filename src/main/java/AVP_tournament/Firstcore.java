package AVP_tournament;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstcore
{
	public static void main(String[] args) {
		try {
			
			System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(3));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
			//driver.get("https://www.google.com/");
			//driver.navigate().to("https://avp-league-management.herokuapp.com/");
			driver.manage().window().fullscreen();
			Thread.sleep(3000);
			driver.findElement(By.id("emailId")).sendKeys("yourEmailid");
			driver.findElement(By.id("password")).sendKeys("yourPassword");
			//driver.findElement(By.id("e-btn--lg u-align__button--center\")).click()
			
			//open new window//
			//driver.switchTo().newWindow(WindowType.WINDOW);
			//driver.switchTo().newWindow(WindowType.TAB);
			
			driver.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
			
		}
	}
	/**
	 * raghav pal
	 * navin automation lab
	 * mukesh 
	 * 
	 */
	 //date:=
//  JavascriptExecutor js= (JavascriptExecutor)driver;
//  WebElement flag=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]"));
//js.executeScript("argrument[0].scrollIntoView();",flag);
}
