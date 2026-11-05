package apimethods;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetUser_BDD 
{
	
	@Test
	public void getuserbdd()
	{
		Response resopnse=
				RestAssured
				.given()
				.baseUri("\"https://qualitythoughtnew-employee-api.onrender.com")
				.when()
				.get("/employees/16")
				.then()
				.statusCode(200)
				.extract()
				.response();
		
		resopnse.prettyPrint();
		
	}

}
