import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcommand {

	public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver","C://Windows//chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver(); //Invoke the browser
		 
		 driver.get("http://demo.guru99.com/test/newtours/");
		 
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 
		 
		String text=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText();
		System.out.println(text);
		
		driver.close();//close current window
		//driver.quit();//close multiple window
		
	}

}
