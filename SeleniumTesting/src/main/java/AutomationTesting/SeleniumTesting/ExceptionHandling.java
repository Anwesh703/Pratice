package AutomationTesting.SeleniumTesting;

import org.testng.annotations.Test;

public class ExceptionHandling {
/*Exception handling:
 * The process of occuring the unexpected events that can be occured during the execution time is called exception.
If the events are not handled the program will stop immediately.to handle we use exception handling

If we write the program that can handle the expections automatically, then it is called as exception handling
try and catch block:
try{
//code
}catch(){
//code
}
they are 2 statements
1) Normal statements - They always behaves normal so their will be no exceptions
2) danger statements - they may behave noraml as well as abnormal.
This statements are taken inside the try block
the catch block will catch the abnormal statements and fixes the problem
	*/
	static int n = 5;
	public static void main(String args[]) {
			run(n);
		
	}
	
	public static void run(int b) {
		try {
			//
			//System.out.println(a);
			int arr[] = new int[3];
			arr[0] = 212;
			arr[2] = 3212;
			System.out.println(arr[b]);}
			catch (Exception e) {
				run(b-1);
				}
		finally {
			System.out.println("finally block");
		}
	}
	
}
