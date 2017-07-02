package APITesting.com.org.api;

import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PostEx {
	// public static void main(String[] args) {
	// System.out.println("{\"id\":\"2\"," + "\"title\":\"dummyTitle\"," +
	// "\"author\":\"Vaibhav\"}");
	// }

	@Test
	public void addPost(){
		Response resp = given().body("{\"id\":\"2\"," + "\"title\":\"dummyTitle\"," + "\"author\":\"Vaibhav\"}").when()
				.contentType(ContentType.JSON).post("http://localhost:3000/posts");
	}
	

}
