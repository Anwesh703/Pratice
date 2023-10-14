package AutomationTestingTraining.Basics;

import org.testng.Assert;
import org.testng.annotations.Test;

import AutomationTestingTraining.Reusables.ReusableFiles;
import io.restassured.path.json.JsonPath;


public class SumValidation {
	//Verify if Sum of all Course prices matches with Purchase Amount
@Test
	public void SumOfCourses() {
		JsonPath js = new JsonPath(ReusableFiles.coursePrice());
		
	int courseSize = js.getInt("courses.size()");
	int SumOfCourses = 0;
	int SumOfprice =0;
	int sumOfCopies = 0; 
	for(int i=0;i<courseSize;i++) {
		int price = js.getInt("courses["+i+"].price");
		int copies = js.getInt("courses["+i+"].copies");
		int sum = price * copies;
		SumOfCourses += sum;
	}
	
	int purchaseAmount = js.getInt("dashboard.purchaseAmount");
	System.out.println(purchaseAmount);
	Assert.assertEquals(SumOfCourses,purchaseAmount);
	
	}
}
