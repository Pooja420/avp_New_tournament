import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.github.javafaker.Faker;

public class loginPromoter {

	public ChromeDriver driver;
	public JavascriptExecutor js;
	public Faker faker;
	
	String baseUrl = "https://promoter.applination.in/";

	public loginPromoter() {
//		this.js = (JavascriptExecutor) driver;
	}
	

	
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.js = (JavascriptExecutor) this.driver;
		this.faker = new Faker();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(3));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.get(baseUrl);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashishgargvdoit@gmail.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.TAB);

		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='password'")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.cssSelector(".LoginButton")).click();
	}
}
