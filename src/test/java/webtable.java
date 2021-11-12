import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtable {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C://Windows//geckodriver.exe");
		
		   WebDriver driver = new FirefoxDriver();
		   
		   driver.get("http://demo.guru99.com/test/table.html");
		   
		   int r=driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		   
		   System.out.println(r);
		   
		   int c=driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/td")).size();
		   
		   System.out.println(c);
		   
		   for(int i=1;i<=r;i++)
		   {
			   for(int j=1;j<=c;j++)
			   {
				   System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"   ");
			   }
			   System.out.println();
		   }
		   
		   driver.close();

	}

}
