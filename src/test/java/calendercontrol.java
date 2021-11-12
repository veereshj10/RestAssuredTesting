import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class calendercontrol {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C://Windows//chromedriver.exe");
		   WebDriver driver = new ChromeDriver(); 
		   
		   driver.get("https://www.jotform.com/build/213062521886455#preview"); //Open URL
		   
		   driver.findElement(By.id("input_11_pick")).click();
		   for(int i=1;i<=3;i++)
		   {
			   driver.findElement(By.xpath("//*[@id=\'calendar_11\']/table/thead/div/div[2]/td[1]")).click();
		   }
		   
		 
	}

}
