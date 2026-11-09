package jsondata;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static  io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class JSON_StringData 
{

	@Test
	public void StringInputData()
	{
		RestAssured.baseURI="https://qualitythoughtnew-employee-api.onrender.com";
		
		String postreqbody1=
				"{"+"\"name\":\"Suman\","+
			"\"email\":\"suman@gmail.com\","+
			"\"salary\":98756"+"}";
		
		given()
		.contentType("application/json")
		.body(postreqbody1)
		
		.when()
		.post("/employees")
		
		.then()
		.statusCode(201)   //Pass:ASC:201 ESC:201
		.statusLine("HTTP/1.1 201 Created")
		.body("employee.salary", equalTo("98756.00"))
		.log().all();
	}
}
