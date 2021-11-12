import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class fileuploadprogram {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C://Windows//geckodriver.exe");
			
		    WebDriver driver = new ChromeDriver();
		   
		   driver.get("http://demo.guru99.com/test/newtours/");
		   
		   FileInputStream file=new FileInputStream("");
		   
		   XSSFWorkbook workbook=new XSSFWorkbook();
		   

	}

}
