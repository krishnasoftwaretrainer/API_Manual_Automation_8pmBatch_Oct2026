package parameters;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Filtring
{
	@Test
	public void FilterEmp()
	{
		given()
		.queryParam("name" ,"Nanda Kumar")
		.queryParam("salary", 66666.00)
		.when()
		.get("https://qualitythoughtnew-employee-api.onrender.com/employees")
		
		.then()
		.statusCode(200)
		.log().body();
	}

}
