import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naviagationcommands {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C://Windows//chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver(); //Invoke the browser
		 
		 driver.get("http://demo.guru99.com/test/newtours/");
		 System.out.println(driver.getTitle());
		 
		 driver.navigate().to("https://www.facebook.com/");
		 System.out.println(driver.getTitle());
		 
		 driver.navigate().back();
		 System.out.println(driver.getTitle());
		 
		 driver.navigate().forward();
		 System.out.println(driver.getTitle());
		 
		 driver.navigate().refresh();
		 
		 driver.close();

	}

}
