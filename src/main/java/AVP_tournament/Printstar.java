package AVP_tournament;

//public class Printstar {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for(int i=6; i<=1; i--) {
//			for(int j=6; j<=1; j--) {
//				if(j==1)System.out.println('*');
//				else System.out.println('*');
//			}
//		}
//	}
//
//}

import java.awt.RenderingHints.Key;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printstar {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{
//		Scanner myscanner = new Scanner(new File("C:\\Users\\pooja\\eclipse-workspace\\DataFiles\\1.csv"));
//		//Creates a new File
//        myscanner.useDelimiter(", ");   //Sets the delimiter
//        while (myscanner.hasNext())  //Returns a boolean(true) if this scanner has another token in its input
//        {
//            System.out.println(myscanner.next());//next complete scanner is returned here
//        }
        
        String line = "";  
        String splitBy = ", ";  
        try   
        {  
	        //parsing a CSV file into BufferedReader class constructor  
	        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\pooja\\eclipse-workspace\\DataFiles\\1.csv"));  
        while ((line = br.readLine()) != null)   //returns a Boolean value  
        {  
        	String[] employee = line.split(splitBy);    // use comma as separator  
        	for(int i=0; i<employee.length; i++) {
        		System.out.print(employee[i]);
        	}
//        	System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] +"]");  
        }  
        }   
        catch (IOException e)   
        {  
        	e.printStackTrace();  
        }  
		
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
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div[2]/div/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("Pooja Rathore");
driver.findElement(By.cssSelector("#exampleFormControlTextarea1")).click();

}
	

}
