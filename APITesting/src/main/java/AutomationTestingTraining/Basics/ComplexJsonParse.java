package AutomationTestingTraining.Basics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import AutomationTestingTraining.Reusables.ReusableFiles;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
public static void main(String[] args) throws IOException {
//	
//	JsonPath js = new JsonPath(ReusableFiles.coursePrice());
//	//Print No of courses returned by API
//int courseSize = js.getInt("courses.size()");
//	System.out.println(js.getInt("courses.size()"));
//	//Print Purchase Amount
//	System.out.println(js.getInt("dashboard.purchaseAmount"));
//	//Print Title of the first course
//	String title = js.get("courses[0].title");
//	System.out.println(js.get("courses[0].title").toString());
//	
//	//Print All course titles and their respective Prices
//for(int i=0;i<courseSize;i++) {
//	System.out.println(js.get("courses["+i+"].title").toString());
//	System.out.println(js.get("courses["+i+"].price").toString());
//	
//}
//
//	//Print no of copies sold by RPA Course
//for(int i=0;i<js.getInt("courses.size()");i++) {
//	if(js.get("courses["+i+"].title").toString().equalsIgnoreCase("RPA")) {
//	System.out.println(js.get("courses["+i+"].copies").toString());
//	break;
//}
//
//}
	System.out.println(GenerateStringFromResource("C:\\Users\\anwreddy\\Desktop\\KentuckyFiles\\Educationfiles\\DesktopShortcuts.txt"));
}
public static String GenerateStringFromResource(String path) throws IOException {



    return new String(Files.readAllBytes(Paths.get(path)));



}
}

