import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;



public class CreateEvent extends loginPromoter
{
	public CreateEvent() throws InterruptedException {
		
		super();
//		loginPromoter LP = new loginPromoter();
//		LP.Login();
		
	}
	
	public void generateEvent() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[contains(text(),'+ New Tournament')]")).click();
	   // driver.findElement(By.xpath=//div[contains(text(),'+ New Tournament')])).click();
	    
	    //Random String Generator

	    String name = this.faker.team().sport().toString()+" "+this.faker.lorem().word().toString();
	    String description = this.faker.lorem().sentence(ThreadLocalRandom.current().nextInt(8, 16)).toString();
	    
	    //event name//
	    driver.findElement(By.cssSelector(".event-input")).sendKeys(name);
	    driver.findElement(By.id("exampleFormControlTextarea1")).click();
	    //description//
	    driver.findElement(By.id("exampleFormControlTextarea1")).sendKeys(description);
		    Thread.sleep(1000);
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,200)", "");
	//		js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/a[1]/div[1]/img[1]")));
	       driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/a[1]/div[1]/img[1]")).click();
	 Thread.sleep(1000);
	 //Address //
	 int dropdownIdentifier = ThreadLocalRandom.current().nextInt(2, 8);
	          driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/a[1]/div[1]/span[1]/div["+Integer.toString(dropdownIdentifier)+"]/div[2]")).click();
	          Thread.sleep(1000);
//	       driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/a[1]/div[1]/span[1]/div[2]/div[2]")).click();
	       Thread.sleep(2000);
	       js.executeScript("window.scrollBy(0,200)", "");
	 
	       //Date code----
	//       SimpleDateFormat formatter= new SimpleDateFormat("MM/dd/yyyy");
	//       Date date = new Date(System.currentTimeMillis());
	       LocalDate date1 =  LocalDate.now().plusDays(5);
	       LocalDate date2 =  LocalDate.now().plusDays(7);
	       
	//       System.out.println(date1.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
	//       System.out.println(formatter.format(date));
	      driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys(date1.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
	      //end date//
	      driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[3]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys(date2.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
	    
	    //Time----
	      String randomTime = this.faker.date().toString();
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
	   LocalDate date3 =  LocalDate.now().plusDays(4);
	   LocalDate date4 =  LocalDate.now().plusDays(2);
	   driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[4]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys(date3.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
	   driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[6]/div[5]/div/div[3]/div/div/input")).sendKeys(date4.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
	   //End At//
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[6]/div[6]/div/div[3]/div/div/input")).sendKeys("08:00 P");
	Thread.sleep(1000);
	  driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/ul/li[2]/button")).click();
	
	  //Template click //
     driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[7]/div[1]/img")).click();
	  //Add New Template Code//
     Thread.sleep(2000);
     
	//New button//
	  driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	  Thread.sleep(2000);
	  //Age bracket dropdown//
	  driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/img")).click();
	//adult//
	  
	  int AgeBracketDropdown = ThreadLocalRandom.current().nextInt(1, 7);
//	  int AgeBracketDropdown = 4;
	  
	  Thread.sleep(1000);
//	  driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/span/ul/li[1]")).click();
	  driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/span/ul/li["+Integer.toString(AgeBracketDropdown)+"]")).click();
//	  driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/span/ul/li["+Integer.toString(2)+"]")).click();
	  Thread.sleep(1000);
	//Next//
	 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click(); 
	 if(AgeBracketDropdown ==1 )
	 {
		 Thread.sleep(2000);
		 int var = 2;
		 int GenderGroup =ThreadLocalRandom.current().nextInt(1, var);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/label["+Integer.toString(GenderGroup)+"]/input")).click();
//		  Next button
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
		 //Next Screen
		 int i= ThreadLocalRandom.current().nextInt(1,3);
		 int x = 3;
		 if(i==1) {
			 x = 4;
		 }else {
			 x = 3;
		 }
		 int j = ThreadLocalRandom.current().nextInt(1,x);
		 // Skills level for division
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div["+Integer.toString(i)+"]/label["+Integer.toString(j)+"]/input")).click();
		 Thread.sleep(1000);
		 //Next Button
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]/span")).click();
		 Thread.sleep(500);
		 i= ThreadLocalRandom.current().nextInt(1,3);
		 j = ThreadLocalRandom.current().nextInt(1,3);
		 //Skill Level for Division
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div["+Integer.toString(i)+"]/label["+Integer.toString(j)+"]/input")).click();
		 Thread.sleep(1000);
		 //next//
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();

		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/img")).click();
		 //driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
		 //Total number of team size image 8//
		 //size//
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/span/ul/li[5]")).click();
		 //next button//
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
		 
		 
		 //player per team//
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/img")).click();
		 i = ThreadLocalRandom.current().nextInt(1,4);
        Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/span/ul/li["+Integer.toString(i)+"]")).click();
		 //next button//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	 //discount section//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/h1/div[1]/label/input")).click();
	   //Next button//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[3]/button[2]")).click();
	    //Again next//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	    
	     // Enter Early bird date//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div[1]/div/div/input")).sendKeys("06/09/2022");
	     //Next button//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	     //Early bird price//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div[1]/div/input")).sendKeys(Integer.toString(ThreadLocalRandom.current().nextInt(0, 11 )));
      // Next //
        driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	     
        //Normal entry//
        driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div[1]/input")).sendKeys(Integer.toString(ThreadLocalRandom.current().nextInt(0, 11 )));
	//Next//
        driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	
	 //Late entry//
        driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div[1]/input")).sendKeys(Integer.toString(ThreadLocalRandom.current().nextInt(0, 11 )));
	 //Next//
        driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
        
        String templateName = this.faker.lorem().word().toString();
        //Template name//
        
        driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/label[1]/input")).sendKeys(templateName);
	  Thread.sleep(3000);
        //next//
        driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/button")).click();
	 
	 }
	
	 
	 
	 
	 else if(AgeBracketDropdown == 2)
	 {		 
		 // Junior Section
		 Thread.sleep(2000);
		 //Boys
		 int GenderGroup =ThreadLocalRandom.current().nextInt(1, 3);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div["+Integer.toString(GenderGroup)+"]/label/input")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
		 int i= ThreadLocalRandom.current().nextInt(1,3);
		 int j= ThreadLocalRandom.current().nextInt(1,2);
		 //Age Range for Division for Junior
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div["+Integer.toString(i)+"]/label["+Integer.toString(j)+"]/input")).click();
		 Thread.sleep(1000);
		 // Next
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]/span")).click();
		
		 
		 //skill level devision//
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div[1]/label["+Integer.toString(i)+"]/input")).click();
		// /html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div[2]/label[1]/input
		 Thread.sleep(500);
//		 //Next//
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
		 Thread.sleep(50);
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();

		 Thread.sleep(2000);
//     	 //total img icon//
        driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/img")).click();
		Thread.sleep(2000);
		// Total_Number of team//
		 //Only 8 teams//
	    js.executeScript("window.scrollBy(0,300)", "");

		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/span/ul/li[5]")).click();
   //		  Next button//
       driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	
     //player per team//
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/img")).click();
		 i = ThreadLocalRandom.current().nextInt(1,4);
      Thread.sleep(1000);
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/span/ul/li["+Integer.toString(i)+"]")).click();
		 //next button//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	 //discount section//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/h1/div[1]/label/input")).click();
	   //Next button//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[3]/button[2]")).click();
	    //Again next//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	    Thread.sleep(1000);
	     // Enter Early bird date//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div[1]/div/div/input")).sendKeys("06/09/2022");
	     //Next button//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	     //Early bird price//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div[1]/div/input")).sendKeys(Integer.toString(ThreadLocalRandom.current().nextInt(0, 11 )));
    // Next //
      driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	     
      //Normal entry//
      driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div[1]/input")).sendKeys(Integer.toString(ThreadLocalRandom.current().nextInt(0, 11 )));
	//Next//
      driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	
	 //Late entry//
      driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div[1]/input")).sendKeys(Integer.toString(ThreadLocalRandom.current().nextInt(0, 11 )));
	 //Next//
      driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	 
      String templateName = this.faker.lorem().word().toString();
      //Template name//
      driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/label[1]/input")).sendKeys(templateName);
	  Thread.sleep(3000);
      //next//
      driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/button")).click();
		 
	 }
	 //3 step dinosour//
	 else if(AgeBracketDropdown == 3)
	 {		 
 ////Boys//
		 Thread.sleep(2000);
		 int var = 3;
		 int GenderGroup =ThreadLocalRandom.current().nextInt(1, var);
		 var = 2;
		 GenderGroup =ThreadLocalRandom.current().nextInt(1, var);

		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/label["+Integer.toString(GenderGroup)+"]/input")).click();
	 //Next button//
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
		 
		 //Next Screen
		 int i= ThreadLocalRandom.current().nextInt(1,2);
		 int x = 2;
		 if(i==1) {
			 x = 4;
		 }else {
			 x = 2;
		 }
		 int j = ThreadLocalRandom.current().nextInt(1,x);
		 
		 //Age range//
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div["+Integer.toString(i)+"]/label["+Integer.toString(j)+"]/input")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
		 Thread.sleep(2000);
//     	 //total img icon//
        driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/img")).click();
		Thread.sleep(2000);
		// Total_Number of team//
		 //Only 8 teams//
	    js.executeScript("window.scrollBy(0,300)", "");

		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/span/ul/li[5]")).click();
   //		  Next button//
       driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	

	 //discount section//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/h1/div[1]/label/input")).click();
	                                 
	     Thread.sleep(1000);

	     //Next button//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[3]/button[2]")).click();
	     Thread.sleep(1000);

	     //Again next//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
//	    Thread.sleep(100);
//	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();

	     Thread.sleep(1000);

	     // Enter Early bird date//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div[1]/div/div/input")).sendKeys("06/09/2022");
	     //Next button//
	     Thread.sleep(1000);

	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();

	     //Early bird price//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div[1]/div/input")).sendKeys(Integer.toString(ThreadLocalRandom.current().nextInt(0, 11 )));
    // Next //
      driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	     Thread.sleep(1000);

      //Normal entry//
      driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div[1]/input")).sendKeys(Integer.toString(ThreadLocalRandom.current().nextInt(0, 11 )));
	//Next//
      driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	     Thread.sleep(1000);

	 //Late entry//
      driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div[1]/input")).sendKeys(Integer.toString(ThreadLocalRandom.current().nextInt(0, 11 )));
	 //Next//
	     Thread.sleep(1000);
      driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
	 
      String templateName = this.faker.lorem().word().toString();
      //Template name//
      driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/label[1]/input")).sendKeys(templateName);
	  Thread.sleep(3000);
      //next//
      driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/button")).click();
	 
	 }
	 
	 //4 step relation father//
	 
	 else if(AgeBracketDropdown >= 4 || AgeBracketDropdown <= 7)
	 {		 
		 //Father-Daughter//
//		 Thread.sleep(2000);
//		int GenderGroup =ThreadLocalRandom.current().nextInt(4, 7);
//		 Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div[1]/label[1]/input["+Integer.toString(GenderGroup)+"]")).click();
		 Thread.sleep(2000);
		 int i= ThreadLocalRandom.current().nextInt(1,3);
		 int j = ThreadLocalRandom.current().nextInt(1,3);
		 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div["+Integer.toString(i)+"]/label["+Integer.toString(j)+"]/input")).click();
	 }
	 //next button//
	 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
// 	 //total img icon//
    driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/img")).click();
	Thread.sleep(2000);
	// Total_Number of team//
	 //Only 8 teams//
    js.executeScript("window.scrollBy(0,300)", "");

	 driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div/a/div/span/ul/li[5]")).click();
//		  Next button//
   driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();


 //discount section//
     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/h1/div[1]/label/input")).click();
                                 
     Thread.sleep(1000);

     //Next button//
     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[3]/button[2]")).click();
     Thread.sleep(1000);

     //Again next//
     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
//    Thread.sleep(100);
//     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();

     Thread.sleep(1000);

     // Enter Early bird date//
     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div[1]/div/div/input")).sendKeys("06/09/2022");
     //Next button//
     Thread.sleep(1000);

     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();

     //Early bird price//
     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div[1]/div/input")).sendKeys(Integer.toString(ThreadLocalRandom.current().nextInt(0, 11 )));
// Next //
  driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
     Thread.sleep(1000);

  //Normal entry//
  driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div[1]/input")).sendKeys(Integer.toString(ThreadLocalRandom.current().nextInt(0, 11 )));
//Next//
  driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
     Thread.sleep(1000);

 //Late entry//
  driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/div[1]/input")).sendKeys(Integer.toString(ThreadLocalRandom.current().nextInt(0, 11 )));
 //Next//
     Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/button[2]")).click();
 
  String templateName = this.faker.lorem().word().toString();
  //Template name//
  driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/label[1]/input")).sendKeys(templateName);
  Thread.sleep(3000);
  //next//
  driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/button")).click();
 
     
     //template-----
//	   driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[7]/div[1]/img")).click();
//	     driver.findElement(By.xpath("//div[contains(text(),'Template')]")).click();
//	     Thread.sleep(1000);
//	   driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[1]/div/a/div/img")).click();
	   //  driver.findElement(By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/a[1]")).click();
	     driver.findElement(By.xpath("//li[contains(text(),'Test_applination')]")).click();
	     Thread.sleep(1000);
	     //git test//
	     driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div/div/div/form/div[2]/div/div/button")).click();
	//Details field---
	     //Pool field//
	 driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[8]/div[2]/div[1]/div[1]/div[4]/a[1]/div[1]/img[1]")).click();
	Thread.sleep(1000);
	//name of the pool code//
	 driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/div[8]/div[2]/div/div/div[4]/a/div/span/ul/li[211]")).click();
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
	//Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[10]/div[2]/div[1]/div[3]/div[2]/a[1]/div[1]/span[1]/ul[1]/li[1]")).click();
	//Purse Amount
//	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,100)", "");
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[10]/div[3]/div/div[3]/div[2]/a/div/img")));
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
	}
}
