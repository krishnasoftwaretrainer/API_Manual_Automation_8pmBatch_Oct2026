package parameters;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class Sorting {
	
	@Test
	public void SortEmp()
	{
		given()
		.queryParam("page", 1)
		.queryParam("limit", 10)
		.queryParam("sortBy" ,"salary")
		.queryParam("order", "asc")
		.when()
		.get("https://qualitythoughtnew-employee-api.onrender.com/employees")
		
		.then()
		.statusCode(200)
		.log().body();
	}
}
