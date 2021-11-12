				
				import org.testng.annotations.Test;
				
				import io.restassured.RestAssured;
				import io.restassured.http.Method;
					import io.restassured.path.json.JsonPath;
					import io.restassured.response.Response;
				import io.restassured.specification.RequestSpecification;
				import junit.framework.Assert;
				
				public class Validating_JSON_ResponseBody{
				
				 
				 @Test
				 void Validating_JSON_ResponseBody()
				 {
				  //Specify base URI
				  RestAssured.baseURI="https://reqres.in/";
				  
				  //Request object
				  RequestSpecification httpRequest=RestAssured.given();
				  
				  //Response object
				  Response response=httpRequest.request(Method.GET,"https://reqres.in/api/users/2");
				  
				  //print response in console window
				  
				  String responseBody=response.getBody().asString();
				  System.out.println("Response Body is:" +responseBody);
				  
				  
			
				  
				  int statuscode=response.getStatusCode();
				  System.out.println("Status Code Is " +statuscode);
				  Assert.assertEquals(statuscode, 200);
				  
				  
				 // Assert.assertEquals(responseBody.contains("janet.weaver@reqres.in"), true);
				  
				  JsonPath jsonpath=response.jsonPath();
				  
				  System.out.println(jsonpath.get("data"));
				  System.out.println(jsonpath.get("first_name"));
				  System.out.println(jsonpath.get("last_name"));
				  System.out.println(jsonpath.get("avatar"));
				  System.out.println(jsonpath.get("support"));
				  System.out.println(jsonpath.get("text"));
				  
				  
				  
		
				  
				  
				  
						  
					}
				}
