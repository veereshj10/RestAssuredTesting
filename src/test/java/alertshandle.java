import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.log4testng.Logger;

public class alertshandle {

	public static void main(String[] args) {
		
		//Logger logger = Logger.getLogger(GFG.class.getName());
		//Logger logger=Logger.getLogger(alertshandle.class.getName());.
		final Logger logger = Logger.getLogger(alertshandle.class);
		//DOMConfigurator.configure("Log4j.xml");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		
		   System.setProperty("webdriver.chrome.driver","C://Windows//geckodriver.exe");
		
		   WebDriver driver = new FirefoxDriver();
		   
		   
		   logger.info("opening URl");
		   
		   driver.get("http://demo.automationtesting.in/Alerts.html");
		   
		   
		   //alert with okb
		   driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		   
		   //alert with ok button
		   driver.findElement(By.xpath("//*[@id='OKTab\']/button")).click();
		   
		   System.out.println(driver.switchTo().alert().getText());
		   
		   
		   
		   //swith to alert box
		   driver.switchTo().alert().accept(); //ok button cliked and closed
		   
		   driver.close();
		   
		   

	}

}
