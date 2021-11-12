/******************************************************
Test Name:Get all employees data
URI: http://dummy.restapiexample.com/api/v1/employees
Request Type: GET
Request Payload(Body): NA

********* Validations **********
Status Code : 200
Status Line : HTTP/1.1 200 OK
Content Type : text/html; charset=UTF-8
Server Type :  nginx/1.14.1
Content Encoding : gzip
Content Length <800
 *********************************************************/

package DataDrivenPackage;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import DataDrivenPackage.base;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



				public class employedaitais extends base  {
					
					
					@Test 
					void checkstatus()
					{
						logger.info("*********Started TC001_Get_All_Employees **********");
						RestAssured.baseURI="https://reqres.in";
						RequestSpecification httprequest=RestAssured.given();
						Response response=httprequest.request(Method.GET,"/api/users/2");
						
						
					
						String responsebody=response.getBody().asString();
						System.out.println("responsebody"+responsebody);
						
						
						int statuscode=response.getStatusCode();
						System.out.println("statuscode"+statuscode);
						AssertJUnit.assertEquals(statuscode, 200);
						
						
						String statusline=response.getStatusLine();
						System.out.println("statusline"+statusline);
						AssertJUnit.assertEquals(statusline, "HTTP/1.1 200 OK");
						
						Headers ALLheader=response.headers();
						
						for(Header header:ALLheader)
						{
							System.out.println(header.getName()+""+header.getName());
							
						}
					}
						@Test 
						void Checkpost()
						{
							
							RestAssured.baseURI="https://reqres.in";
							RequestSpecification httprequest=RestAssured.given();
							
							JSONObject requestparam=new JSONObject();
							requestparam.put("Name", "VEERESHAJaaa");
							requestparam.put("job", "leadear");
							
							httprequest.header("Content-type","application/json");
							httprequest.body(requestparam.toString());
							
							Response response=httprequest.request(Method.POST,"/api/users");
							
							
						
							String responsebody=response.getBody().asString();
							System.out.println("responsebody"+responsebody);
						
						
						
						
						
						
						
						
						
						
						
						
						
					}
					
					
				}