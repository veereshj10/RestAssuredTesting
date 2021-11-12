import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class completeformdemo {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C://Windows//geckodriver.exe");
			
		   WebDriver driver = new FirefoxDriver();
		   
		   driver.get("https://www.jotform.com/build/213062521886455#preview");
		   
		   driver.findElement(By.name("q36_name[first]")).sendKeys("Veeresh");
		   driver.findElement(By.name("q36_name[last]")).sendKeys("javaliiii");
		   driver.findElement(By.name("q7_email")).sendKeys("javaliiii@gmail.com");
		   driver.findElement(By.name("q6_phoneNumber[full]")).sendKeys("947164646464");
		   
		   driver.findElement(By.xpath("//*[@id=\'cid_21\']/div/span[2]")).click();
		   
		   
		  WebElement dragdropu=driver.findElement(By.xpath("//*[@id=\'input_20\']"));
		   
		   

	}

}
