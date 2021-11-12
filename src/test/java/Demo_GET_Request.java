
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Demo_GET_Request{

 
 @Test
 void getweatherDetails()
 {
  //Specify base URI
  RestAssured.baseURI="https://reqres.in/";
  
  //Request object
  RequestSpecification httpRequest=RestAssured.given();
  
  //Response object
  Response response=httpRequest.request(Method.GET,"/api/users?page=2");
  
  //print response in console window
  
  String responseBody=response.getBody().asString();
  System.out.println("Response Body is:"    +responseBody);
  
  int statuscode=response.getStatusCode();
  System.out.println("Status Code Is "    +statuscode);
  Assert.assertEquals(statuscode, 200);
  
  String statusline=response.getStatusLine();
  System.out.println("Status line Is "     +statusline);
  Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
  
  
  
  
		  
	}
}
