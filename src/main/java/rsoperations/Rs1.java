package rsoperations;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Rs1 {
	@Test
	public void createnewrecord()
	{
		String newrecord = null;
		try {
			RestAssured.baseURI ="https://rahulshettyacademy.com";
			newrecord = given().log().all().queryParam("key", "qaclick123").body("{\r\n"
					+ "  \"location\": {\r\n"
					+ "    \"lat\": -38.383494,\r\n"
					+ "    \"lng\": 33.427362\r\n"
					+ "  },\r\n"
					+ "  \"accuracy\": 50,\r\n"
					+ "  \"name\": \"Afsara Samreen\",\r\n"
					+ "  \"phone_number\": \"(+91) 898 893 1234\",\r\n"
					+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
					+ "  \"types\": [\r\n"
					+ "    \"shoe park\",\r\n"
					+ "    \"shop\"\r\n"
					+ "  ],\r\n"
					+ "  \"website\": \"http://google.com\",\r\n"
					+ "  \"language\": \"French-IN\"\r\n"
					+ "}\r\n"
					+ "").log().all().when().post("/maps/api/place/add/json").then().log().all().statusCode(200).body("scope", equalTo("APP")).extract().asString();
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}finally
		{
			
			
			System.out.println("**********************************************************");
			
			System.out.println(newrecord);		
		
	}

}
}
