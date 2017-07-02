package APITesting.com.org.api;

import static com.jayway.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class JSONFormat {
	@Test
	public void testJson() {
		Response resp = given().
		parameter("q", "London").
		parameter("appid", "1b15e88fa797225412429c1c50c122a1").
		when().get("http://samples.openweathermap.org/data/2.5/weather");
		
		String actualResult= resp.
		then().
		contentType(ContentType.JSON).
		extract().
		path("weather[0].description");
		System.out.println("weather report is: "+ actualResult);


	}

}
