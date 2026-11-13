package parameters;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static  io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.http.Headers;
import io.restassured.http.Header;


public class GetHeaders_ValidateHeaders 
{

	@Test(enabled=false)
		public void singleheadervalue()
		{
			
			Response response=			
			when()
			.get("https://qualitythoughtnew-employee-api.onrender.com/employees?name=Ajit Rao&id=24");
			
			String headervalue=response.getHeader("Content-Type");
			System.out.println("Header Value: "+headervalue);
			//application/json; charset=utf-8
		}
		
	@Test(enabled=false)
	public void allheadervalues()
	{
		
		Response response=			
		when()
		.get("https://qualitythoughtnew-employee-api.onrender.com/employees?name=Ajit Rao&id=24");
		
		Headers headervalue=response.getHeaders();
		
		for(int i=0;i<headervalue.size();i++)
		{
			Header headervalues=headervalue.asList().get(i);
		System.out.println(headervalues);
		
		//application/json; charset=utf-8
	}
	}
	
	//@Test
	public void validatesingleheadervalue()
	{
		RestAssured.baseURI="https://qualitythoughtnew-employee-api.onrender.com";
		ValidatableResponse response=
				when()
				.get("/employees?name=Ajit Rao&id=24")
				.then()
				.header("Content-Type", containsString("application/json"));
						
	}
	@Test
	public void validateAllheadervalues()
	{
		RestAssured.baseURI="https://qualitythoughtnew-employee-api.onrender.com";
		ValidatableResponse response=
				when()
				.get("/employees?name=Ajit Rao&id=24")
				.then()
				.header("Content-Type", containsString("application/json"))
				.and()
				.header("Server", equalTo("cloudflare"))
				.and()
				.header("Date", notNullValue());
			
						
	}
}
