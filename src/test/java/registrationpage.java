import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registrationpage {

	WebDriver driver;
	 
	By RegLink=By.linkText("REGISTER");
	By Firstname=By.name("firstName");
	By Lastname=By.name("lastName");
	By Phonenum=By.name("phone");
	By Emailid=By.name("userName");
	By adress1=By.name("address1");
	By cityname=By.name("city");
	By Statename=By.name("state");
	By Pincode=By.name("postalCode");
	By Countryname=By.name("country");
	By email=By.name("email");
	By passwordcof1=By.name("password");
	By passwordcof2=By.name("confirmPassword");
	
	//@FindBy(name="firstName")
	//WebElement FirstName;
	
	registrationpage(WebDriver d)
	{
		driver=d;
	}
	public void clickRegLink()
	{
		driver.findElement(RegLink).click();
	}
	public void setFirstName(String fname)
	{
		driver.findElement(Firstname).sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		driver.findElement(Lastname).sendKeys(lname);
	}
	public void phonenum(String ph)
	{
		driver.findElement(Phonenum).sendKeys(ph);
	}
	public void email(String email)
	{
		driver.findElement(Emailid).sendKeys(email);
	}
	public void adress1(String ad1)
	{
		driver.findElement(adress1).sendKeys(ad1);
	}
	public void city(String cityna)
	{
		driver.findElement(cityname).sendKeys(cityna);
	}/
	
	
}


