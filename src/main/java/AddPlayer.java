import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddPlayer 

{
	public static void main(String[] args) throws InterruptedException
	{
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://promoter.applination.in");
	

	WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/div[1]/input"));
	email.sendKeys("ashishgargvdoit@gmail.com");

	WebElement password = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/div[2]/input"));
	password.sendKeys("123456");

	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/div[3]")).click();

	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[2]/div/div[3]/div[1]/img")).click();

	//FirstName
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[1]/div/div[1]/input")).sendKeys("Harshit");
	//LastName
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Pandey");

	// Thread.sleep(1000);


	//Contact

	//Zip
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/div[2]/input")).sendKeys("90202");
	//Mobile
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[3]/div[3]/div[2]/div[2]/input")).sendKeys("9999999999");
	//Email
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[3]/div[3]/div[3]/div[2]/input")).sendKeys("harshit@applination.in");
	//ID
	//driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[3]/div[3]/div[4]/div[2]/input"));

	// Details

	//point
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[4]/div[2]/div[1]/div[2]/input")).sendKeys("1240");
	//level
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[4]/div[2]/div[2]/div[2]/input")).sendKeys("AVP Pro");

	//newestresults

	//points
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[5]/div[2]/div[1]/div[2]/input")).sendKeys("300");
	// placement
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/input")).sendKeys("2nd");
	// savebutton
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div")).click();



	Thread.sleep(8000);
	driver.quit();

	}
}


