import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertwithtext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Windows//geckodriver.exe");
		
		   WebDriver driver = new FirefoxDriver();
		   
		   driver.get("http://demo.automationtesting.in/Alerts.html");
		   
		   driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		   
		   driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		   
		   driver.switchTo().alert().sendKeys("veeresh");
		   
		   driver.switchTo().alert().accept();
		   
		   String actstring="Hello veeresh How are you today";
		   
		   driver.findElement(By.xpath("//*[@id=\'demo1\']"));
	}

}
