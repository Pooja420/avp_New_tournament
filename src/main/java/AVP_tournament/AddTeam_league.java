package AVP_tournament;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTeam_league 
 {
	 public static void main(String[] args) {
		
	
		 System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
 		ChromeDriver driver = new ChromeDriver();

//driver.get("https://avp-lg.applination.in/");
driver.get("https://avp-lg.applination.in/");
//driver.get("http://34.130.141.211/");
Thread.sleep(2000);
driver.manage().window().maximize();

//Login user and Password 
driver.find_element_by_xpath("/html/body/div/div/div/section/div/div/form/input[1]").send_keys("neetu.gupta@vdoit.in");
driver.find_element_by_xpath("//html/body/div/div/div/section/div/div/form/input[2]").send_keys("123456");
driver.find_element_by_xpath("/html/body/div/div/div/section/div/div/form/button").click();
Thread.sleep(4000);
//Add items click
driver.find_element_by_xpath("/html/body/div/div/div/div/section[2]/div[1]/div[2]/a/img").click();
Thread.sleep(4000);
//Work day(for click)
driver.find_element_by_xpath("/html/body/div/div/div/div/div/div/div/div/span").click();
Thread.sleep(4000);
//work day (Program Name)
driver.execute_script("window.scrollTo(0, 200)");
Thread.sleep(4000);
driver.find_element_by_xpath("/html/body/div/div/div/div/div/div/div/div[2]/ul/li[28]").click();
driver.execute_script("window.scrollTo(0, 100)")
driver.find_element_by_xpath("/html/body/div/div/div/div/div/section/form/div[1]/div[2]/input").send_keys("Kunal.kumar");
//save button/
driver.find_element_by_xpath("/html/body/div/div/div/div/div/section/form/div[2]/span/button[2]").click();
Thread.sleep(4000);
//Division
driver.find_element_by_xpath("/html/body/div/div/div/div/section[2]/div[1]/div/div/div/div[1]").click();
//Players Harshit
Thread.sleep(4000);
driver.find_element_by_xpath("/html/body/div/div/div/div/section[2]/div[1]/div/div/div[2]/div[2]/div[5]/button").click();
//Add Players
driver.find_element_by_xpath("/html/body/div/div/div/div/section[2]/div[1]/div[1]/div[2]/span").click();
//Players Kunal
Thread.sleep(4000);
driver.find_element_by_xpath("/html/body/div/div/div/div/section[2]/div[1]/div/div/div[2]/div[3]/div[5]/button").click();
//Players Pooja
Thread.sleep(4000);
driver.find_element_by_xpath("/html/body/div/div/div/div/section[2]/div[1]/div/div/div[2]/div[4]/div[5]/button").click();
//Players Sneha
Thread.sleep(4000);
driver.find_element_by_xpath("/html/body/div/div/div/div/section[2]/div[1]/div/div/div[2]/div[5]/div[5]/button").click();
//Add Players in Players 
driver.find_element_by_xpath("/html/body/div/div/div/div/section[2]/div[1]/div[1]/div[2]/span/span").click();
Thread.sleep(4000);
driver.find_element_by_xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[5]/button").click();
//New Team
//driver.find_element_by_xpath("/html/body/div/div/div/div/section[2]/span/a/button").click();

	 }
}
