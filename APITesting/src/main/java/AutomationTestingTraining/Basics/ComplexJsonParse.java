package AutomationTestingTraining.Basics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import AutomationTestingTraining.Reusables.ReusableFiles;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
public static void main(String[] args) throws IOException {
	
	
//	1. Print No of courses returned by API
//	2.Print Purchase Amount
//	3. Print Title of the first course
//	4. Print All course titles and their respective Prices
//	5. Print no of copies sold by RPA Course
//	6. Verify if Sum of all Course prices matches with Purchase Amount
	
JsonPath js = new JsonPath(ReusableFiles.coursePrice());
int size =js.getInt("courses.size()");
int total = js.getInt("dashboard.purchaseAmount");
js.get("courses[0].title");
int SumofallCourse =0;
for(int i=0;i<size;i++) {
	System.out.println("The course title is "+js.get("courses["+i+"].title").toString());
	System.out.println("The Price of course is "+js.getInt("courses["+i+"].price"));
	SumofallCourse+=js.getInt("courses["+i+"].price")*js.getInt("courses["+i+"].copies");
	if(js.get("courses["+i+"].title").equals("RPA")) {
		System.out.println("The copies of RPA is "+js.get("courses["+i+"].copies").toString());
	}
}Assert.assertEquals(SumofallCourse, total);
System.out.println("The SumofallCourse is "+SumofallCourse);



	
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

