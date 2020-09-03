package APITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyData;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

public class GetOpenExchangeLatest {
	
	@Test
	public void testGet() {
		RestAssured.baseURI="https://openexchangerates.org";
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("app_id", "b0fad421a450408c8c0392d9755a31f8");
		map.put("base", "USD");
		map.put("symbols", "GBP,INR,AUD");
		map.put("prettyprint", "true");
		map.put("show_alternative", "true");
		
		RequestSpecification reqSpec = RestAssured.given();
				
		reqSpec.queryParams(map);
		reqSpec.accept("JSON");
		
				
		Response res = reqSpec.get("/latest.json")
				.then()
				.assertThat()
				.statusCode(200)
				.extract().response();
		
		String resStr = res.asString();
		JsonPath jp = new JsonPath(resStr);
		String inrT = jp.getString("rates.INR");
		String inrU = jp.getString("rates.GBP");
		Assert.assertEquals(jp.getString("rates.INR"), "73.085045");
		System.out.println(inrT);
		System.out.println(inrU);
				
		
		
		System.out.println(res.asString());
		
		
	}

}
