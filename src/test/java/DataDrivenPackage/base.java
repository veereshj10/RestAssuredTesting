package DataDrivenPackage;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;

public class base {
	
	public Logger logger;
	
	@BeforeClass
	public void setup(){
		
		logger=Logger.getLogger("EmployeesRestAPI");//added Logger
		PropertyConfigurator.configure("Log4j.properties"); //added logger
		logger.setLevel(Level.DEBUG);
		
	}
	


}