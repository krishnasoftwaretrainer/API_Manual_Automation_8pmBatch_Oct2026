package parameters;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class LogAll 
{
	@Test
	public void LogValues()
	{
		RestAssured.baseURI="https://qualitythoughtnew-employee-api.onrender.com";
		
		when()
		.get("/employees?name=Ajit Rao&id=24")
		.then()
		//.log().headers();
		//.log().body();
		//.log().cookies();
		//.log().status();
		.log().all();
	

}
	}

