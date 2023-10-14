package AutomationTestingTraining.Basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import AutomationTestingTraining.Reusables.ReusableFiles;
import AutomationTestingTraining.Reusables.ReusableMethods;

public class ScratchLevelPratice {

	public static void main(String args[]) {
	
	//Add Place
	RestAssured.baseURI = "https://rahulshettyacademy.com";
	String response = given().log().all().queryParam("key","qaclick123")
			.header("Content-Type","application/json")
	.body(ReusableFiles.getBoby())
	.when().post("maps/api/place/add/json").
	then().assertThat().statusCode(200).body("scope", equalTo("APP"))
	.header("Server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
	JsonPath js = new JsonPath(response);
	String placeId = js.getString("place_id");
	System.out.println(placeId);
	
	//Update Place
	String newAddress = "70 winter walk, USA";
	given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
	.body("{\r\n"
			+ "\"place_id\":\""+placeId+"\",\r\n"
			+ "\"address\":\""+newAddress+"\",\r\n"
			+ "\"key\":\"qaclick123\"\r\n"
			+ "}\r\n"
			+ "").when().put("maps/api/place/update/json")
	.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
	
	
	//Get Place
	String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
	.when().get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().response().asString();
	
	//JsonPath js1 = new JsonPath(getPlaceResponse); (or)
	JsonPath js1 = ReusableMethods.rawToJson(getPlaceResponse);
	String actualAddress = js1.getString("Address");
	System.out.println(actualAddress);
	
	Assert.assertEquals(newAddress,actualAddress);
	
	
	
}
	
}
