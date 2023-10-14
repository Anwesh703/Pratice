package AutomationTestingTraining.Reusables;

import java.io.InputStream;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReusableMethods {

	public static JsonPath rawToJson(String resp) {
		JsonPath js = new JsonPath(resp);
		return js;
	}
}
