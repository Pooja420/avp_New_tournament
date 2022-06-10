import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class HamburgerAddTeam extends CreateEvent
{
	public HamburgerAddTeam() throws InterruptedException {
		
		super();
		
	}
	 //Hamburger icon//
	public void AddTeam() throws InterruptedException 
	{
		
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/div[1]/img[1]")).click();
	    Thread.sleep(20000);
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
	    this.js.executeScript("window.scrollBy(0,300)", "");
	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[7]/div/div[1]/span/img")).click();
	    
	    int num_teams = 9;
	    int num_players = 2;
	   // Thread.sleep(1000000);
	    boolean exception = false;
	    for (int i = 2; i <= num_teams; i++){
	    	
	    	if(i> num_teams) {
	    		break;
	    	}
	    	
	    	String xPathTeam = "/html/body/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[7]/div/div[2]/div/div/div["+Integer.toString(i);
	    	for(int j = 1; j<=num_players; j++) {
	    		String xPathPlayer = xPathTeam + "]/div[2]/div["+Integer.toString(j)+"]/div/div[4]/div/div/img";
	    		Thread.sleep(300);
	    		try {    		
	    			driver.findElement(By.xpath(xPathPlayer)).click();
	    		}catch(NoSuchElementException ex) {
	    			exception = true;
	    			break;
	    		}
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
	    		this.js.executeScript("window.scrollBy(0,50)", "");
	    	}
	    	if(exception == true) break;
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
	}
}
