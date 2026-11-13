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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class File_Upload_Download 
{

	//@Test
	public void SingleFileUpload()
	{
		File myfile=new File("C:\\Users\\HP\\Downloads\\SwagLogin_Test_By.java");
		
		given()
		.multiPart("file",myfile)
		.contentType("multipart/form-data")
		.when()
		.post("http://localhost:3000/api/files/upload/single")
		
		.then()
		.statusCode(200)
		.log().all();
		
	}
	
	//@Test
	public void MultipleFilesUpload()
	{
		File myfile1=new File("C:\\Users\\HP\\Downloads\\SwagLogin_Test_By.java");
		File myfile2=new File("C:\\Users\\HP\\Downloads\\sampleFile.jpeg");
		given()
		.multiPart("files",myfile1)
		.multiPart("files",myfile2)
		.contentType("multipart/form-data")
		.when()
		.post("http://localhost:3000/api/files/upload/multiple")
		
		.then()
		.statusCode(200)
		.log().all();
		
	}
	
	@Test
	public void DownloadFile() throws IOException
	{
		/*
		given()
		
		.when()
		//.get("http://localhost:3000/api/files/download/2049bdc2-16d6-44fd-94be-d0c76f580fd9.txt")
		.get("http://localhost:3000/api/files/download/2266b933-5db1-4f5e-8521-4f4e1834e290.pdf")
		.then()
		.statusCode(200)
		.log().all(); */
		
		Response response=
		given()
		
		.when()
		//.get("http://localhost:3000/api/files/download/2049bdc2-16d6-44fd-94be-d0c76f580fd9.txt")
		.get("http://localhost:3000/api/files/download/2266b933-5db1-4f5e-8521-4f4e1834e290.pdf");
		response.then().statusCode(200);
		
		FileOutputStream fs=new FileOutputStream("D://TestFileDownload.pdf");
		fs.write(response.asByteArray());
		fs.close();
	}
}
