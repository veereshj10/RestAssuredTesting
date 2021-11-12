package Datacheckk;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

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

				public class demo{
					
					void checkstatus()
					{
						
						RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
						RequestSpecification httprequest=RestAssured.given();
						Response response=httprequest.request(Method.GET,"/employees");
						
						
					
						String responsebody=response.getBody().asString();
						System.out.println("responsebody"+responsebody);
						
						
						int statuscode=response.getStatusCode();
						System.out.println("statuscode"+statuscode);
						Assert.assertEquals(statuscode, 200);
						
						
						String statusline=response.getStatusLine();
						System.out.println("statusline"+statusline);
						Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
						
						
						
						
						
						
						
						
						
						
						
					}
					
					
				}