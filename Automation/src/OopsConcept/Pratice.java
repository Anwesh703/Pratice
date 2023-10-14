package OopsConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Pratice {
public static void main(String [] args) throws InterruptedException {
//	ArrayList<Integer> al = new ArrayList<Integer>();
//Collections.addAll(al, 10,25,23,10,78);
	//RetryAnalyzer();
	 ArrayList<Integer> Sally = new ArrayList<Integer>();
	   Collections.addAll(Sally, 90, 84, 92, 88, 96);
	   ArrayList<Integer> Bob = new ArrayList<Integer>();
	   Collections.addAll(Bob,72, 84, 92, 66, 80);
	   ArrayList<Integer> Abby = new ArrayList<Integer>();
	   Collections.addAll(Abby, 90, 82, 84, 70, 86);
	   System.out.println(averageGrade(Sally));
	   System.out.println(averageGrade(Bob));
	   NoOfTimesAssertion(5);
	String str= "Hi Anwesh Nice to meet you";
	CountSequence(str);
	int[] al= {10,10,23,9,78};
int target = 19;
//int[] arr = Comparison(al, target);
int[] arr1 =findIndices(al, target);
System.out.println(arr1[0] + ", " + arr1[1]);
//if (arr.length > 0) {
//    System.out.println(arr[0] + ", " + arr[1]);
//} else {
//    System.out.println("No pair found.");
//}
}
public static int[] findIndices(int[] a, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
//   for(int l=0;l<a.length;l++) {map.put(l, a[l]);
//   }
   System.out.println(map);
    for (int i = 0; i < a.length; i++) {
        int complement = target - a[i];
        if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
        }
        map.put(a[i], i);
    }

    return new int[] {};
}

public static int[] Comparison(int[] al,int t){
	
	
	for(int i=0;i<al.length;i++) {
		for(int j=i+1;j<al.length;j++) 	
	{if(al[i]+al[j]==t) {
		 return new int[] {i, j};
	}
	}
}
	return new int[] {};
	
}
public static void CountSequence(String s) {
	ArrayList<String> ch =new  ArrayList<String>(Arrays.asList(s.split("")));
	int count=1;
	for(int i=0;i<ch.size();i++) {
		for(int j=i+1;j<ch.size();j++) {
//			if(h[j]!=ch[i]) {
		if(ch.get(i).equalsIgnoreCase(ch.get(j))) {
			count++;
			ch.remove(j);
			
			}
		
		}
		System.out.print(ch.get(i)+" : "+count +" ");
		count=1;
	}
	
	
	
}
public static void CountSequenceHashMap(String str) {
HashMap<String,Integer> Occurance = new  HashMap<String,Integer> ();
String[] s = str.split(" ");
for(String m : s){
   Integer integer = Occurance.get(m);
   if(integer==null){
       Occurance.put(m,1);
   }else{
       Occurance.put(m,integer+1);
   }
}
System.out.println(Occurance);
}
public static void SwapNumbers(int a,int b){
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println(a);
    System.out.println(b);
}

public static int averageGrade(ArrayList<Integer> input){
  int addititonOfGrades=0;
	for(int i=0;i<input.size();i++) {
		addititonOfGrades += input.get(i);
	}
	int average = addititonOfGrades/input.size();
   return average;
//   •    Pass this data structure as an argument to a method which will calculate the average of each student’s grades 
//   •    Print out each student’s average grade. 

    //The following students received the following grades: 
//    Sally: {90, 84, 92, 88, 96} 
//    Bob: {72, 84, 92, 66, 80} 
//    Abby: {90, 82, 84, 70, 86} 
//•    Use a data structure to store each student’s set of grades. 

}
public static void NoOfTimesAssertion(int input){
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
			System.out.println();
	   
	}}


static int retryAttempts = 3;

public static void RetryAnalyzer() throws InterruptedException{
	

for (int attempt = 0; attempt < retryAttempts; attempt++) {
    try {
        // Perform the operation that caused the exception
//        WebElement element = driver.findElement(By.xpath("//xpath/to/element"));
//        element.click();
    	System.out.println("Trail "+attempt);
    	Integer.parseInt("null") ;
        break;  // Operation successful, exit the loop
    } catch (Exception e) {
        if (attempt == retryAttempts - 1) {
            throw e;  // Reached maximum retries, rethrow the exception
        } else {
                Thread.sleep(1000);  // Delay before retrying
        }
    }
}
}
//API Testing
//API testing is a type of software testing that analyzes an application program interface (API)
//to verify that it fulfills its expected functionality, security, performance and reliability.
//The tests are performed either directly on the API or as part of integration testing.

//STLC
//The main goal of the STLC is to identify and document any defects or issues in the software 
//application as early as possible in the development process. This allows for issues to be 
//addressed and resolved before the software is released to the public.

//The stages of the STLC include Test Planning, Test Analysis, Test Design,
//Test Environment Setup, Test Execution, Test Closure, and Defect Retesting. 

//Smoke
//Smoke testing tests the basic functionalities and core features of software in development.
//An example of a smoke test could be the testing of a login function of a web application.
//or 
//Smoke Testing is a software testing process that determines whether the deployed software build 
//is stable or not. Smoke testing is a confirmation for QA team to proceed with further software 
//testing. It consists of a minimal set of tests run on each build to test software functionalities.
//Smoke testing is also known as “Build Verification Testing” or “Confidence Testing.

//Sanity testing is a type of software testing that aims to quickly evaluate whether the basic 
//functionality of a new software build is working correctly or not. It is usually performed on
//builds that are in the initial stages of development, before the full regression testing is performed.

//Regression testing is a type of testing where you can verify that the changes made in the 
//codebase do not impact the existing software functionality. For example, these code changes 
//could include adding new features, fixing bugs, or updating a current feature.


}
//Ex. Input: 
//a[] = [10, 25, 23, 6, 78], Target = 29
//Then, Output = [2, 3] as 23 + 6 = 29.

