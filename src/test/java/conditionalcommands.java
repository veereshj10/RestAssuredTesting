import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalcommands {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C://Windows//chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver(); //Invoke the browser
		 
		 driver.get("https://www.facebook.com/");
		 
		 WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		 WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		 
		 if(email.isDisplayed() && email.isEnabled())
		 {
			 email.sendKeys("xyz");
		 }
		 if(pass.isDisplayed() && pass.isEnabled())
		 {
			 pass.sendKeys("1235465");
		 }
		 
	} 

}
