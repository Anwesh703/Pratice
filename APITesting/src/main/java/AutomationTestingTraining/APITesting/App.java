package AutomationTestingTraining.APITesting;


import static io.restassured.RestAssured.*;

import AutomationTestingTraining.Reusables.ReusableFiles;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;

public class App {
  public static void main(String[] args) {
	//  POST
    RestAssured.baseURI = "https://rahulshettyacademy.com";
    String response= given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
    .body(ReusableFiles.getBoby())
    .when().post("/maps/api/place/add/json")
    .then().log().all().assertThat().statusCode(200).body("status", equalTo("OK")).body("scope", equalTo("APP")).extract().response().asString();
   JsonPath js = new JsonPath(response);
   String place_id = js.getString("place_id");
   System.out.println(place_id);
   
  // PUT
   given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		    .body("{\r\n"
		    		+ "\"place_id\":\""+place_id+"\",\r\n"
		    		+ "\"address\":\"70 winter walk, USA\",\r\n"
		    		+ "\"key\":\"qaclick123\"\r\n"
		    		+ "}\r\n"
		    		+ "")
		    .when().put("/maps/api/place/update/json")
		    .then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));

  //GET
   given().log().all().queryParam("key","qaclick123").queryParam("place_id",""+place_id+"")
   .when().put("/maps/api/place/get/json")
   .then().log().all().assertThat().statusCode(200);
   //Delete
   given().log().all().queryParam("key","qaclick123").body(""+place_id+"")
   .when().post("/maps/api/place/delete/json")
   .then().log().all().assertThat().statusCode(200);
  }
}