package AVP_tournament;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alerts {
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick=\'jsAlert()']")).click();
//		Alert.alert1 = driver.switchTo().alert();
//		alert1.accept();
		//file src= new file("C:\x");
//	
	}
	
		
	}
		


