package AVP_tournament;
import java.awt.RenderingHints.Key;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element {

	public static void main(String[] args) throws InterruptedException  
	{

//        
//        try   
//        {  
//	        //parsing a CSV file into BufferedReader class constructor  
//	        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\pooja\\eclipse-workspace\\DataFiles\\1.csv"));  
//        while ((line = br.readLine()) != null)   //returns a Boolean value  
//        {  
//        	String[] employee = line.split(splitBy);    // use comma as separator  
//        	for(int i=0; i<employee.length; i++) {
//        		System.out.print(employee[i]);
//        	}
        	System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
    		ChromeDriver driver = new ChromeDriver();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(3));
    		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
    		//driver.get("https://www.google.com/");
    		//driver.get("https://avp-league-management.herokuapp.com/");
    		driver.get("http://34.130.141.211/");
    		driver.manage().window().maximize();
    		
    		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jamesbond101@gmail.com");
    		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.TAB);

    		Thread.sleep(1000);
    		//driver.findElement(By.xpath("//input[@name='password'")).click();
    		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
    		driver.findElement(By.cssSelector(".LoginButton")).click();
    		//driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div[2]/div/div[2]/div[2]")).click();
    		//driver.findElement(By.xpath("input[@value='']")).click();
    		//driver.findElement(By.tagName("css=.event-input")).sendKeys("Avp Volleyball");
    		////driver.findElement(By.xpath("//*[@id=\"app-content\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("Pooja Rathore");
    		 Thread.sleep(5000);
    		    driver.findElement(By.xpath("//div[contains(text(),'+ New Tournament')]")).click();
    		   // driver.findElement(By.xpath=//div[contains(text(),'+ New Tournament')])).click();
    		    
    		    driver.findElement(By.cssSelector(".event-input")).sendKeys("Avp Volleyball");
    		    driver.findElement(By.id("exampleFormControlTextarea1")).click();
    		    driver.findElement(By.id("exampleFormControlTextarea1")).sendKeys("Volleyball");
    		    JavascriptExecutor js = (JavascriptExecutor) driver;
    			js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("// a [@id='score-hamburger']/div/img[@src='/static/media/icon-sidemenu-list.a3d91da3.svg']")));
    		    driver.findElement(By.xpath("// a [@id=\"score-hamburger\"]/div/img[@src='/static/media/icon-sidemenu-list.a3d91da3.svg']")).click();
    		    		
	}  
          
         
        
		

}
	


