package apimethods;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest 
{
	@Test
	public void postmethod()
	{
		RestAssured.baseURI="https://qualitythoughtnew-employee-api.onrender.com";
		
		String postreqbody=
			"{"+"\"name\":\"Sample\","+
		"\"email\":\"sample@gmail.com\","+
		"\"salary\":23456"+"}";
				
		RequestSpecification request=RestAssured.given();
		
		request.header("Content-Type","application/json");
		request.body(postreqbody);
		
		Response reponse=request.post("/employees");
		
		reponse.prettyPrint();
		System.out.println(reponse.statusCode());
		System.out.println(reponse.statusLine());
		reponse.then().statusCode(201);
		
	}

}
