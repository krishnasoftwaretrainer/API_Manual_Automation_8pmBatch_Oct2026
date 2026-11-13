package parameters;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static  io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.http.Headers;
import io.restassured.http.Cookies;
import io.restassured.http.Header;
public class CookiesAll 
{
	//@Test
	public void getSingleCookie()
	{
		Response response=
		when()
		.get("https://www.google.com/");
		
		String singlecookie=response.cookie("AEC");
		System.out.println("singlecookie:"+singlecookie);
	}
	//@Test
	public void getAllCookies()
	{
		Response response=
		when()
		.get("https://www.google.com/");
		
		Cookies allcookies=response.getDetailedCookies();
		
		System.out.println("allcookies:"+allcookies);
	}
	
	//@Test
		public void validategetSingleCookie()
		{
			
			when()
			.get("https://www.google.com/")
			
			.then()
			.cookie("AEC", notNullValue())
			.cookies("AEC",not(equalTo("Aaa9EJraH4YHypD92HD-bUaR7RBYE_GuLDhj0HU2wKuj9aJIZwE3a8fICE0")));
			
			//.cookies("AEC",equalTo("Aaa9EJraH4YHypD92HD-bUaR7RBYE_GuLDhj0HU2wKuj9aJIZwE3a8fICE0"));
		}
		
		@Test
		public void validategetAllCookies()
		{
			
			when()
			.get("https://www.google.com/")
			
			.then()
			.cookie("AEC", notNullValue())
			.cookies("AEC",not(equalTo("Aaa9EJraH4YHypD92HD-bUaR7RBYE_GuLDhj0HU2wKuj9aJIZwE3a8fICE0")))
			.and()
			.cookies("__Secure-STRP",not(equalTo("ABNhA6j4K04uVoGRNfAES5MBrlkFflIe8PFTSzlIesO5cyyNLDOwtuY3z914A7ZkmKh5NNfESksa2zHNVdJGaE6yg2Ld0p4Icw")));
			//.cookies("AEC",equalTo("Aaa9EJraH4YHypD92HD-bUaR7RBYE_GuLDhj0HU2wKuj9aJIZwE3a8fICE0"));
		}
}
