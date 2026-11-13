package parameters;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class Pagination {

	@Test
	public void PaginationEmp()
	{
		given()
		.queryParam("page", 1)
		.queryParam("limit", 10)
		.when()
		.get("https://qualitythoughtnew-employee-api.onrender.com/employees")
		
		.then()
		.statusCode(200)
		.log().body();
		
	}
}
