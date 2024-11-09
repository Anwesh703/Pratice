package JIraToAPIIntegration;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import java.io.File;

public class APIIntegrationToJira {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://rahulshettyacademy-team.atlassian.net/";
		// Creates Jira bug ticket
		String jiraProjectName = "Edwardjones";
		String bugName = "Website items are not working- automation Rest Assured";
		String createIssueResponse = given().header("Content-Type", "application/json").header("Authorization",
				"Basic bWVudG9yQHJhaHVsc2hldHR5YWNhZGVteS5jb206QVRBVFQzeEZmR0YwdFNlOHYzNUtILWQtU3U4NUFMckIyTjdDNXIwY0pJU0djdFIwRFBybUhfZjVlUmg4dE5UUVV6UVp1dTFkMXJHdkRjUzNHRnV4TVE4WklSNU9tdFlPbUszLUxBbVU4OEFTM3JrOGkwODFSYV9kQTlPQ3J5QjRERXlFWldJYXpwWGw3VDFTWnBLY0ZOSDBucjVBMUtLQ3FuWVBldzFLR2JSMWowa2JFdGVNVFZFPUZCMzhFM0JB")
				.body("{\n" + "\"fields\": {\n" + "\"project\":\n" + "{\n" + "\"key\": \"" + jiraProjectName + "\"\n"
						+ "},\n" + "\"summary\": \"" + bugName + "\",\n" + "\"issuetype\": {\n" + "\"name\": \"Bug\"\n"
						+ "}\n" + "}\n" + "}")
				.log().all().when().post("rest/api/3/issue").then().log().all().assertThat().statusCode(201)
				.contentType("application/json").extract().response().asString();
		JsonPath js = new JsonPath(createIssueResponse);
		String issueId = js.getString("id");
		System.out.println(issueId);
		// Add attachment
		given().pathParam("key", issueId).header("X-Atlassian-Token", "no-check").header("Authorization",
				"Basic bWVudG9yQHJhaHVsc2hldHR5YWNhZGVteS5jb206QVRBVFQzeEZmR0YwdFNlOHYzNUtILWQtU3U4NUFMckIyTjdDNXIwY0pJU0djdFIwRFBybUhfZjVlUmg4dE5UUVV6UVp1dTFkMXJHdkRjUzNHRnV4TVE4WklSNU9tdFlPbUszLUxBbVU4OEFTM3JrOGkwODFSYV9kQTlPQ3J5QjRERXlFWldJYXpwWGw3VDFTWnBLY0ZOSDBucjVBMUtLQ3FuWVBldzFLR2JSMWowa2JFdGVNVFZFPUZCMzhFM0JB")
				.
				// multiPart is used to send data in file format by selecting "form data" in
				// body
				// images are sent as File in body of API
				// path Parameters can be intialized in the starting by using key value pair
				// Eg:pathParam("key", issueId) and can be called in post by using {} eg:{key}
				multiPart("file", new File("/Users/rahulshetty/Downloads/IMG_0926.jpeg")).log().all().when()
				.post("rest/api/3/issue/{key}/attachments").then().log().all().assertThat().statusCode(200);
	}
}
