package jsondata;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class JSONObject1 {

	@Test
	public void JSONInputData()
	{
		RestAssured.baseURI="https://qualitythoughtnew-employee-api.onrender.com";
		
		JSONObject jsonbody=new JSONObject();
		jsonbody.put("name", "Rama Rao");
		jsonbody.put("email", "rama@rao.com");
		jsonbody.put("salary", 11500);
				
		given()
		.contentType("application/json")
		.body(jsonbody.toString())
		
		.when()
		.post("/employees")
		
		.then()
		.statusCode(201)   //Pass:ASC:201 ESC:201
		.statusLine("HTTP/1.1 201 Created")
		.body("employee.salary", equalTo("11500.00"))
		.log().all();
	}
}
