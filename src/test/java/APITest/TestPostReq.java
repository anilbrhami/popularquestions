package APITest;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyData;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseOptions;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.authentication;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestPostReq {
	
	@Test
	public void firstPost() {
		RestAssured.baseURI = "https://reqres.in/";
		
		JSONObject reqBody = new JSONObject();
		 reqBody.put("name", "Ajay");
		 reqBody.put("job", "leader");
		
		RequestSpecification reqSpec = RestAssured.given()
				.contentType("application/json")
				.body(reqBody);
				
		       
		Response res = reqSpec.post("/api/users");
		
		System.out.println(res.asString());
		
	}
	
	@Test
	public void testHttp() {
		
				
	RestAssured.baseURI = "https://reqres.in/";
	
	 JSONObject reqBody = new JSONObject();
	 reqBody.put("name", "Ajay");
	 reqBody.put("job", "leader");
		
		Response res= 
				RestAssured.given()
				.contentType("application/json")
				.accept("*/*")
				.body(reqBody)
.when()
.post("/api/users")

.then()
.assertThat()
.statusCode(201)
.and()
.extract().response();
		
		
		System.out.println(((ResponseBodyData) res).asString());
		
			
	}
	
	
	}


