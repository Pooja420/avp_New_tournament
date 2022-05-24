import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import java.util.concurrent.ThreadLocalRandom;

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

public class New_Tournament  {

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
    		driver.get("https://promoter.applination.in/");
    		Thread.sleep(2000);
    		driver.manage().window().maximize();
    		
    		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashishgargvdoit@gmail.com");
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
    		    //event name//
    		    driver.findElement(By.cssSelector(".event-input")).sendKeys("Gamer Sky_Event");
    		    driver.findElement(By.id("exampleFormControlTextarea1")).click();
    		    //description//
  		    driver.findElement(By.id("exampleFormControlTextarea1")).sendKeys("Sky_event");
  		    Thread.sleep(2000);
//    		    JavascriptExecutor js = (JavascriptExecutor) driver;
//    			js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/a[1]/div[1]/img[1]")));
               driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/a[1]/div[1]/img[1]")).click();
         Thread.sleep(1000);
                  driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/a[1]/div[1]/span[1]/div[1]/div[2]")).click();
               driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/a[1]/div[1]/span[1]/div[2]/div[2]")).click();
              // Thread.sleep(2000);
         
               //Date code----
              
              driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("05/25/2022");
              //end date//
              driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("05/27/2022");
            
            //Time----
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("11:00 A");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/button[1]")).click();
        
           //Registration---
           driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]/img[1]")).click();
           Thread.sleep(100);
           driver.findElement(By.xpath("//li[contains(text(),'Yes')]")).click();
           driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[3]/div[1]/div[1]/div[4]/a[1]/div[1]/img[1]")).click();
          Thread.sleep(1000);
           driver.findElement(By.xpath("//li[contains(text(),'silver')]")).click();
           Thread.sleep(1000);
           //close on date//
           driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[4]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("05/24/2022");
           driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[6]/div[5]/div/div[3]/div/div/input")).sendKeys("05/19/2022");
           //End At//
   driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[6]/div[6]/div/div[3]/div/div/input")).sendKeys("08:00 P");
   Thread.sleep(1000);
          driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/ul/li[2]/button")).click();
    
           //template-----
           driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[7]/div[1]/img")).click();
             driver.findElement(By.xpath("//div[contains(text(),'Template')]")).click();
             Thread.sleep(1000);
           driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/a/div/img")).click();
           //  driver.findElement(By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/a[1]")).click();
             driver.findElement(By.xpath("//li[contains(text(),'Pooja Rathore')]")).click();
             Thread.sleep(1000);
             driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/div/div/button")).click();
       //Details field---
         driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[8]/div[2]/div[1]/div[1]/div[4]/a[1]/div[1]/img[1]")).click();
	  Thread.sleep(1000);
         driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/div[8]/div[2]/div/div/div[4]/a/div/span/ul/li[199]")).click();
         //season--
         driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[8]/div[3]/div[1]/div[1]/div[4]/a[1]/div[1]/img[1]")).click();
	Thread.sleep(1000);
         driver.findElement(By.xpath("//li[contains(text(),'Tournament Season')]")).click();
         //Placement Point//
     	Thread.sleep(300);
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
    //Hamburger icon//
    Thread.sleep(3000);
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/div[1]/img[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//li[contains(text(),'Go Live')]")).click();
    Thread.sleep(2000);
    //event field click//
    driver.findElement(By.xpath("//span[@id='events-span']")).click();
    //Recent created///
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/div[1]/span[1]/img[1]")).click();
    //div/
    Thread.sleep(2000);
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]")).click();
    //Player Added dropdown//
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]/img[1]")).click();
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/img[1]")).click();
    Thread.sleep(2000);
    
    //scroll//
    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[5]")).click();
    js.executeScript("window.scrollBy(0,300)", "");
    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[7]/div/div[1]/span/img")).click();
    
    int num_teams = 9;
    int num_players = 2;
    
    for (int i = 2; i <= num_teams; i++){
    	
    	String xPathTeam = "/html/body/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[7]/div/div[2]/div/div/div["+Integer.toString(i);
    	for(int j = 1; j<=num_players; j++) {
    		String xPathPlayer = xPathTeam + "]/div[2]/div["+Integer.toString(j)+"]/div/div[4]/div/div/img";
    		//Thread.sleep(300);
    		driver.findElement(By.xpath(xPathPlayer)).click();
    		Thread.sleep(200);
    		String xPathSearchBox = "/html/body/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[7]/div/div[2]/div/div/div["+Integer.toString(i)+"]/div[2]/div["+Integer.toString(j)+"]/div/div[4]/div/div/span/div[1]/div[2]/input";
    		driver.findElement(By.xpath(xPathSearchBox)).sendKeys("p");
    		String xPathPlayerList = "/html/body/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[7]/div/div[2]/div/div/div["+Integer.toString(i)+"]/div[2]/div["+Integer.toString(j)+"]/div/div[4]/div/div/span/div[3]/div[2]";
    		driver.findElement(By.xpath(xPathPlayerList)).click();
    		
    		if(j == 1) {
	    		String xPathPlayerDonationAmount = "/html/body/div[2]/div/div[2]/div/div[3]/div[2]/label/input";
	    		driver.findElement(By.xpath(xPathPlayerDonationAmount)).click();
	    		String xPathPlayerDonationNext = "/html/body/div[2]/div/div[2]/div/div[5]/div/button[2]/span";
	    		driver.findElement(By.xpath(xPathPlayerDonationNext)).click();
	    		String xPathPlayerInvoiceSelect = "/html/body/div[2]/div/div[2]/div/div[2]/div/div[3]/label/input";
	    		driver.findElement(By.xpath(xPathPlayerInvoiceSelect)).click();
	    		String xPathPlayerInvoiceOk = "/html/body/div[2]/div/div[2]/div/div[3]/div/button[2]/span";
	    		driver.findElement(By.xpath(xPathPlayerInvoiceOk)).click();
	    		
    		}
    		Thread.sleep(5000);
    		
    		
    	}
    	Thread.sleep(3000);
    	if(i%2!=0) {    		
    		js.executeScript("window.scrollBy(0,50)", "");
    	}
    }
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[2]/div[2]/div")).click();
    Thread.sleep(100);
    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div/div/div/div[3]/div/div[1]/span/img")).click();
//    js.executeScript("window.scrollBy(0,200)", "");
//     //Team Dropdown//
//     driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[7]/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[4]/div/div/img")).click();
////Search container//
//     driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]/div[1]")).click();
//     Thread.sleep(1000);   
//     
//     //Team1 Player1//
//	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]/div[8]")).click();
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div[2]/label/input")).click();
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[5]/div/button[2]")).click();
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[3]/label/input")).click();
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div/button[2]")).click();
//nav icon click//
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[2]")).click();
    //nav toggle//
    Thread.sleep(3000);
   // driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[2]")).click();
    //Hamburger icon click//
    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/div[1]/img[1]")).click();
    //view division//
    Thread.sleep(100);
    driver.findElement(By.xpath("//li[contains(text(),'View Divisions')]")).click();
    //dropdown//
//    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]/div[1]/img[1]")).click();
//    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/img[1]")).click();
//   driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/img[1]")).click();
//  Thread.sleep(2000);
  //Dropdown
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/div[3]/img")).click();
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/div/img")).click();
	Thread.sleep(1500);
   //generate schedule//
  // driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/div/img")).click();
  // Thread.sleep(1000);

//Generate Schedule
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/div/span/ul/li[2]")).click();
	//Left Arrow
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/nav/div/div/ul[1]/li")).click();
	Thread.sleep(1500);
	//Hamburger
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/a/div/img")).click();
	Thread.sleep(1500);
	//Close Registration
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/a/div/span/ul/li[6]")).click();
	driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/button[6]/span")).click();
	js.executeScript("window.scrollBy(0,1000)", "");
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[3]/div/div[1]/div[1]/span/img")).click();
Thread.sleep(1500);
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div/div[1]/div[2]")).click();	
    //scores tab//
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[3]/div/div[1]/div[2]/div/div/div[1]")).click();
//hamburger icon//
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/img")).click();
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,200)", "");
//edit//
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/span/ul/li")).click();
Thread.sleep(500);
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div/div/span/img")).click();

//scores print//
int num_games= 12;
int num_teams1=2;
for(int i=1;i<=num_games;i++){
	for(int j=1;j<=num_teams1;j++){
		for(int k=1; k<=3;k++){
	 		//Set 1
	 		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div/div["+Integer.toString(i)+"]/div/div[4]/div["+Integer.toString(j)+"]/div[2]/div[3]/div[2]/div["+Integer.toString(k*2)+"]/div[2]/input")).sendKeys(Integer.toString(ThreadLocalRandom.current().nextInt(0, 25 + 1)));
		}
	}
}
//save button//
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/div[2]/div")).click();
Thread.sleep(1000);
//Pool code//
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/div[2]/p")).click();
Thread.sleep(600);

//dropdown click//
//driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/div[1]/span/img")).click();
//initiate bracket//
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div/div/div")).click();
////dropdown//
//driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/div[1]/span/img")).click();
//driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div/span")).click();
////yes//
Thread.sleep(1000);

driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/button[2]")).click();


Thread.sleep(80000);
       driver.quit();

	}
}

	






