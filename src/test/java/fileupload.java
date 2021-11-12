import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) throws IOException {
		   System.setProperty("webdriver.chrome.driver","C://Windows//chromedriver.exe");
		   WebDriver driver = new ChromeDriver(); 

		   driver.get("http://demo.guru99.com/test/upload/");
		   
		   driver.findElement(By.id("uploadfile_0")).click();
		   
		   Runtime.getRuntime().exec("F://sample.exe");//execute AutoIT EXE FIle
		   
		   driver.findElement(By.xpath("//*[@id=\'terms\']")).click();
		   
		   driver.findElement(By.xpath("//*[@id=\'submitbutton\']")).click();
		   
		   

}
}