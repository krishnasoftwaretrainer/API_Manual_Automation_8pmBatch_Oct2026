package bddAPIMethods;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUserBDD 
{
	/*BDD Style:TestNG 
	 * given:header auth  
	 * when: get post put patch delete 
	 * then:Actuval Validations  
	 * gerkin 
	 *   
	 */
	
	//@Test
	public void getuserdata()
	{
		RestAssured.baseURI="https://qualitythoughtnew-employee-api.onrender.com";
		
		given().
		when().get("/employees/16")		
		.then().statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.body("employee.id", equalTo(16)) //Excepted ID:16
		.body("employee.name", is("Mr.Jhons"))
		.body("employee.name", containsString("Mr.Jh"))
		.body("employee.salary", anything())
		.body("employee.salary", notNullValue())
		.log().all();
		
		//Body Validations by using hamcrest.Matchers[RestAssured Validations]
	}
	
	@Test
	public void getuserdata1() //TestNG Assertions
	{
		RestAssured.baseURI="https://qualitythoughtnew-employee-api.onrender.com";
		
		Response response=
		given().
		when().get("/employees/16");
		
		int statuscode=response.statusCode();
		Assert.assertEquals(statuscode, 200);
		
		String statusline=response.statusLine();
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
		
		int empid=response.jsonPath().getInt("employee.id");
		Assert.assertEquals(empid, 16);
		
		String empname=response.jsonPath().getString("employee.name");
		Assert.assertEquals(empname, "Mr.Jhonson");
	}

}
