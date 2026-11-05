package apimethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	
	@Test
	public void getusers()
	{
		RestAssured.baseURI="https://qualitythoughtnew-employee-api.onrender.com";

		RequestSpecification request=RestAssured.given();
		RestAssured.baseURI="https://qualitythoughtnew-employee-api.onrender.com";

		RequestSpecification request=RestAssured.given();
		Response response=request.get("/employees/21");
		response.prettyPrint();
		
		//Validations
		
		int respcode=response.statusCode();
		System.out.println(respcode);
		System.out.println(response.statusLine());
		System.out.println(response.getHeader("Content-Type"));
		System.out.println(response.getHeaders());
		
		response.then().statusCode(200);
		
		Assert.assertEquals(respcode, 200);
		
		/*Set Base URL
		 * Create Request
		 * Send GET Request
		 * Print Response
		 * Assertions
		 */
	}

}
