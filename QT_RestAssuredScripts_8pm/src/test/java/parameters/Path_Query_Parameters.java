package parameters;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static  io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class Path_Query_Parameters {

	//@Test
	public void pathparm()
	{
		RestAssured.baseURI="https://qualitythoughtnew-employee-api.onrender.com";
		
		given()
		.pathParams("emppath", "employees","idvalue",24)
		
		.when()
		//.get("/{emppath}")
		.get("/{emppath}/{idvalue}")
		
		.then()
		.statusCode(200)
		.log().all();
		
	}
	
	//@Test
	public void queryparm()
	{
		//https://qualitythoughtnew-employee-api.onrender.com/employees?name=Ajit Rao&id=24
		
		RestAssured.baseURI="https://qualitythoughtnew-employee-api.onrender.com";
		
		given()
		.queryParams("id",24,"name", "Ajit Rao")
		
		.when()
		.get("/employees")
				
		.then()
		.statusCode(200)
		.log().all();
		
	}
	
	@Test
	public void pathqueryparm()
	{
		//https://qualitythoughtnew-employee-api.onrender.com/employees?name=Ajit Rao&id=24
		
		RestAssured.baseURI="https://qualitythoughtnew-employee-api.onrender.com";
		
		given()
		.pathParam("emppath", "employees")
		.queryParams("id",24,"name", "Ajit Rao")
		
		.when()
		.get("/{emppath}")
				
		.then()
		.statusCode(200)
		.log().all();
		
	}
}
