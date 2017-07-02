package APITesting.com.org.api;



import static com.jayway.restassured.RestAssured.when;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class WeatherGetRequest {

	@Test
	public void Test_01() {
		Response resp = when().get(
				"http://samples.openweathermap.org/data/2.5/weather?q=London&appid=b1b15e88fa797225412429c1c50c122a1");
	System.out.println(resp.getStatusCode());
	}
}