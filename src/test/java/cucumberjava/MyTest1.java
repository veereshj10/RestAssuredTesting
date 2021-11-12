package cucumberjava; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class MyTest1 { 
   WebDriver driver = null; 
	
   @Given("^I have open the browser$") 
   public void openBrowser() { 
      driver = new ChromeDriver();
   } 
	
   @When("^I open Facebook website$") 
   public void goToFacebook() 
   { 
      driver.get("https://www.facebook.com/"); 
   } 
	
   @Then("^Login button should exits$") 
   public void loginButton()
{ 
     driver.findElement(By.name("email")).sendKeys("veereshjavali@gmail.com");
     driver.findElement(By.name("pass")).sendKeys("974074686");
     driver.findElement(By.name("login")).click();
}
}