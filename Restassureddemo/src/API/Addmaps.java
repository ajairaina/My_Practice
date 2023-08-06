package API;

import io.restassured.RestAssured;
import static io.restassured.RestAssured. *;
public class Addmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Add place and validate 
		/* Api as three methods
		 -given - input all api details
		 -when - resources,http methods
		 -then - validate the api
		 */
		
		//Hit the base url
		
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Ajai house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"Car park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"Tamil-IN\"\r\n"
				+ "}").when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200);
		
		
		
		
	}

}
