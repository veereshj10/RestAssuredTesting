package cookiestesting;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookie {

	public static void main(String[] args) {


		System.setProperty("Webdriver.chrome.driver", "C://Windows//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Set <Cookie> cookies=driver.manage().getCookies();
		
		System.out.println("Cookies Size"+cookies.size());
		
		/*for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+""+cookie.getValue());//prints all cookies
		}*/
		
		//System.out.println(driver.manage().getCookieNamed("session-id-time"));//prints specific cookie acc name
		
		//add new cookie to the browser
		Cookie cobj=new Cookie("myccokie123","1234567890");
		driver.manage().addCookie(cobj);
		

		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+""+cookie.getValue());//prints all cookies
		}
		System.out.println("Cookies Size"+cookies.size());
		driver.close();
				
		
		
		
		
		

	}

}
