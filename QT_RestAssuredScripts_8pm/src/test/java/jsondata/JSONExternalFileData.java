package jsondata;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class JSONExternalFileData {
	@Test
	public void JSONExternalInputData() throws FileNotFoundException
	{
		RestAssured.baseURI="https://qualitythoughtnew-employee-api.onrender.com";
		
		File f=new File(".\\jsondata\\jsondata.json");
		FileReader reader=new FileReader(f);
		JSONTokener jstoken=new JSONTokener(reader);
		
		JSONObject jsonbody=new JSONObject(jstoken);

				
		given()
		.contentType("application/json")
		.body(jsonbody.toString())
		
		.when()
		.post("/employees")
		
		.then()
		.statusCode(201)   //Pass:ASC:201 ESC:201
		.statusLine("HTTP/1.1 201 Created")
		.body("employee.salary", equalTo("55000.00"))
		.log().all();
	}
}
