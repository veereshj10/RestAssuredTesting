import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertokcancel {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C://Windows//geckodriver.exe");
			
		   WebDriver driver = new FirefoxDriver();
		   
		   driver.get("http://demo.automationtesting.in/Alerts.html");
		   
		   driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		   
		   driver.findElement(By.xpath("//*[@id=\'CancelTab\']/button")).click();
		   
		   String ExpText="You pressed Ok";
		   
		   
		   driver.switchTo().alert().accept();
		   
		   String act_Text=driver.findElement(By.xpath("//*[@id=\'demo\']")).getText();
		   
		   if(ExpText.equals(act_Text)==true)
				{
					System.out.println("Test is paseed");
					
				}
		   driver.findElement(By.xpath("//*[@id=\'CancelTab\']/button")).click();
		   String ExpCancel="You Pressed Cancel";
		   
		   driver.switchTo().alert().dismiss();
		   String act_Text1=driver.findElement(By.xpath("//*[@id=\'demo\']")).getText();
		   
		   
		   if(ExpCancel.equals(act_Text1)==true)
				{
					System.out.println("Test is paseed");
				}
   
		   
	}

}
