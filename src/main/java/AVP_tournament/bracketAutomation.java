package AVP_tournament;

import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bracketAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(3));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		//driver.get("https://www.google.com/");
		//driver.get("https://avp-league-management.herokuapp.com/");
		driver.get("https://promoter.applination.in/");
		//driver.get("http://34.130.141.211/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashishgargvdoit@gmail.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.TAB);

		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='password'")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.cssSelector(".LoginButton")).click();
		Thread.sleep(2000);
		
		driver.get("https://promoter.applination.in/scores/7861");
		

		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[3]/p")).click();
		Thread.sleep(1000);
		//bracket logic//
		int num_matches= 4;
		int num_teams_of_brackets=2;
		for(int i=1;i<=num_matches;i++){
			if(i>2 && i%2!=0) {
				Thread.sleep(8000);
			}
			for(int j=1;j<=num_teams_of_brackets;j++){
				for(int k=1; k<=3;k++){
				    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div["+Integer.toString(i)+"]/div[2]/div["+Integer.toString(j)+"]/div[4]/div/input["+Integer.toString(k)+"]")).clear();
				    int randomNumber = ThreadLocalRandom.current().nextInt(1, 25 + 1 );
				    if(randomNumber<10) {		    	
				    	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div["+Integer.toString(i)+"]/div[2]/div["+Integer.toString(j)+"]/div[4]/div/input["+Integer.toString(k)+"]")).sendKeys("0"+Integer.toString(randomNumber));
				    }
				    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div["+Integer.toString(i)+"]/div[2]/div["+Integer.toString(j)+"]/div[4]/div/input["+Integer.toString(k)+"]")).sendKeys(Integer.toString(randomNumber));
				}
			}
		}
			
	// Locate the Source by By.xpath. 
	      WebElement titleC = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[2]/div[2]/div[2]")); 

	// Create an object of actions class  
	     Actions actions = new Actions(driver); 


	 //Drag and Drop Action  
	     actions.clickAndHold(titleC).moveByOffset(15, 90).pause(2).moveByOffset(-10,-35).pause(3).release().perform(); 
	      
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]")).click();


     	//Thread.sleep(90000);
		       //driver.quit();
	}
}


