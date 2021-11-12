


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Windows//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //Invoke the browser
		
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		
		String act_title=driver.getTitle();
		
		System.out.println(act_title);
		String exp_Title="Login: Mercury Tours";
		
		if(act_title.equals(exp_Title)==true)
		{
			System.out.println("Test Is Passed");
		}
		else
		{
			System.out.println("Test Is Failed");
		}
		driver.close();
	}

}
