package AutomationTestingTraining.Basics;

public class PayLoad {
	public static String Addbook(String isbn , String aisle) {
		return "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "";
	}
}
