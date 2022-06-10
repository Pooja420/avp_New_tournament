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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Element {

	public static void main(String[] args) throws InterruptedException  
	{

//       
        	System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
    		ChromeDriver driver = new ChromeDriver();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(3));
    		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
    		//driver.get("https://www.google.com/");
    		//driver.get("https://avp-league-management.herokuapp.com/");
    		driver.get("http://34.130.141.211/");
    		Thread.sleep(2000);
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
    		 Thread.sleep(2000);
    		    driver.findElement(By.xpath("//div[contains(text(),'+ New Tournament')]")).click();
    		   // driver.findElement(By.xpath=//div[contains(text(),'+ New Tournament')])).click();
    		    
    		    driver.findElement(By.cssSelector(".event-input")).sendKeys("Applin Cricket123");
    		    driver.findElement(By.id("exampleFormControlTextarea1")).click();
  		    driver.findElement(By.id("exampleFormControlTextarea1")).sendKeys("Cricket1 event");
  		    Thread.sleep(2000);
//    		    JavascriptExecutor js = (JavascriptExecutor) driver;
//    			js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/a[1]/div[1]/img[1]")));
  		   driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/a[1]/div[1]/img[1]")).click();
           Thread.sleep(1000);
                    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/a[1]/div[1]/span[1]/div[1]/div[2]")).click();
                 driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/a[1]/div[1]/span[1]/div[2]/div[2]")).click();
                // Thread.sleep(2000);
           
                 //Date code----
                
                driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("06/04/2022");
                //end date//
               // driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("05/28/2022");
                Thread.sleep(2000);
              //closes on date//
              //close on date//
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div[4]/div[4]/div/div[3]/div/div/input")).sendKeys("06/02/2022");
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div[4]/div[5]/div/div[3]/div/div/input")).sendKeys("05/01/2022");
                
              //Time----
          driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("11:00 A");
          Thread.sleep(1000);
          driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div[2]/ul/li[2]/button")).click();
          //division template//
          Thread.sleep(1000);
          //template-----
          driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div[6]/div[1]/img")).click();
          Thread.sleep(1000);
          driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/div/form/div[1]/div/a/div/img")).click();
            driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/div/form/div[1]/div/a/div/span/ul/li[652]")).click();
//  done//
            driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/div/form/div[2]/div/div/button")).click();
            //new button//
//          driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
//          //age bracket//
//          driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/img")).click();
//          //click dropdown//
//          Thread.sleep(1000);
//          driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/span/ul/li[2]]")).click();
//          //next//
//          driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
//          Thread.sleep(1000);
//          //Girls//
//          driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/div/form/div[1]/div/div[2]/label/span[1]")).click();
//            //next button//
//          driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
//            
            Thread.sleep(1000);
             //Registration---
             driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div[7]/div[2]/div/div/div[3]/div[2]/a/div/img")).click();
             Thread.sleep(100);
             driver.findElement(By.xpath("//li[contains(text(),'Yes')]")).click();
//             driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[3]/div[1]/div[1]/div[4]/a[1]/div[1]/img[1]")).click();
//            Thread.sleep(1000);
//             driver.findElement(By.xpath("//li[contains(text(),'silver')]")).click();
       Thread.sleep(1000);
             
             //End At//
       driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div[7]/div[3]/div/div[3]/div/div/input")).sendKeys("08:00 P");
     Thread.sleep(1000);
     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div[7]/div[3]/div/div[3]/div/div/input")).click();
            driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/ul/li[2]/button")).click();
      
           //template-----
//           driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[7]/div[1]/img")).click();
//             driver.findElement(By.xpath("//div[contains(text(),'Template')]")).click();
//             Thread.sleep(1000);
//             driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/a/div/img")).click();
//             driver.findElement(By.xpath("//li[contains(text(),'Pooja Rathore')]")).click();
//             Thread.sleep(1000);
//             driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/div/div/button")).click();
       //Details field---
         driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[8]/div[2]/div[1]/div[1]/div[4]/a[1]/div[1]/img[1]")).click();
	  Thread.sleep(1000);
         driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/div[8]/div[2]/div/div/div[4]/a/div/span/ul/li[199]")).click();
         //season--
         driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[8]/div[3]/div[1]/div[1]/div[4]/a[1]/div[1]/img[1]")).click();
	Thread.sleep(1000);
         driver.findElement(By.xpath("//li[contains(text(),'Tournament Season')]")).click();
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[8]/div[4]/div[1]/div[1]/div[4]/a[1]/div[1]/img[1]")).click();
	driver.findElement(By.xpath("//li[contains(text(),'AVP Pro')]")).click();
	
	//Seeding Method--\
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[8]/div[5]/div[1]/div[1]/div[4]/a[1]/div[1]/img[1]")).click();
	Thread.sleep(100);
	driver.findElement(By.xpath("//li[contains(text(),'Tournament Seeding')]")).click();
	Thread.sleep(300);
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[8]/div[6]/div[1]/div[1]/div[4]/a[1]/div[1]/img[1]")).click();
	Thread.sleep(100);
	driver.findElement(By.xpath("//li[contains(text(),'Grass')]")).click();
	 Thread.sleep(100);
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[8]/div[7]/div[1]/div[4]/a[1]/div[1]/img[1]")).click();
	 Thread.sleep(100);
	driver.findElement(By.xpath("//li[contains(text(),'Yes')]")).click();
	 Thread.sleep(100);
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[8]/div[8]/div[1]/div[4]/a[1]/div[1]/img[1]")).click();
	driver.findElement(By.xpath("//li[contains(text(),'Yes')]")).click();
	

	//Team Listen//
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[8]/div[12]/div[1]/div[3]/input[1]")).sendKeys("By Registration Date");
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[8]/div[12]/div[1]/div[3]/input[1]")).sendKeys("10");
         driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[8]/div[13]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]/img[1]")).click();
        driver.findElement(By.xpath("//li[contains(text(),'1')]")).click();
        Thread.sleep(1000);
        //contact//
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[9]/div[2]/div[1]/div[4]/a[1]/div[1]/img[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[9]/div[2]/div[1]/div[4]/a[1]/div[1]/span[1]/div[4]/div[2]")).click();
         //Main method//
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[9]/div[3]/div[1]/div[4]/a[1]/div[1]/img[1]")).click(); 
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/div[9]/div[3]/div/div[4]/a/div/span/div[4]/div[2]")).click();
       //Finance//
        //Online Pay
      	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[10]/div[2]/div[1]/div[3]/div[2]/a[1]/div[1]/img[1]")).click();				
//        Thread.sleep(1000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[10]/div[2]/div[1]/div[3]/div[2]/a[1]/div[1]/span[1]/ul[1]/li[1]")).click();
        //Purse Amount
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)", "");
//       JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[10]/div[3]/div/div[3]/div[2]/a/div/img")));
    Thread.sleep(1000);
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[10]/div[3]/div/div[3]/div[2]/a/div/img")).click();
    Thread.sleep(100);
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[10]/div[3]/div/div[3]/div[2]/a/div/span/ul/li[2]")).click();
  
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[10]/div[4]/div/div[3]/input")).sendKeys("385");
    //Donation Text
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[10]/div[5]/div/div[3]/input")).sendKeys("Donation Text");
    
    //Donation Amounts
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[10]/div[6]/div/div[3]/input")).sendKeys("21");
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[10]/div[7]/div/div[3]/input")).sendKeys("32");
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[10]/div[8]/div/div[3]/input")).sendKeys("43");
    
    //Documents
    //Signature Agreement
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[11]/div[2]/div[1]/div[4]/a[1]/div[1]/img[1]")).click();
    Thread.sleep(200);
    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[11]/div[2]/div[1]/div[4]/a[1]/div[1]/span[1]/ul[1]/li[1]")).click();
   //Description//
    js.executeScript("window.scrollBy(0,400)", "");
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[12]/div[3]/div/div/div")).sendKeys("Description is filled");
    
    //Save button//
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/button")).click();
    Thread.sleep(2000);
    //Hamburger icon//
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/div[1]/img[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//li[contains(text(),'Go Live')]")).click();

    Thread.sleep(80000);
   driver.quit();

	}
}

	

