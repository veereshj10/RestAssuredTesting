import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingwindow {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C://Windows//geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
		   
		   
		   
		   driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard"); //Open URL
		   
		   driver.findElement(By.id("txtUsername")).sendKeys("admin");      //admin is username
		   driver.findElement(By.id("txtPassword")).sendKeys("admin123");  //admin is password
		   driver.findElement(By.id("btnLogin")).click();                 //click button submit
		   
		   driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		   driver.findElement(By.id("menu_admin_UserManagement")).click();
		   driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		   
		   int r= driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr")).size();
		   int Statuscount=0;
		   
		   for(int i=1;i<=r;i++)
		   {
			   
			   String status=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr["+i+"]/td[5]")).getText();
			   if(status.equals("Enabled"))
			   {
				   Statuscount=Statuscount+1;
			   }
			   
		   }
		   System.out.println("NO of Employess Enabled:"+Statuscount);
		   driver.close();
		   
	}
}
