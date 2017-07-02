package APITesting.com.org.api;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;
public class Test1 {

	@Test
	public void test_01(){
		Response resp = given().
				parameter("q","London").
				parameter("appid","b1b15e88fa797225412429c1c50c122a1").
				when().
				get("http://samples.openweathermap.org/data/2.5/weather");
		System.out.println(resp.asString());
		
		String wetherReport= resp.
				then().
				contentType(ContentType.JSON).
				extract().
				path("weather[0].description");
				
	}
	
}
