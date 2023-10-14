package Training;

import java.util.Scanner;

public class Scanner1 {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st number");
	int a = sc.nextInt();
	System.out.println("Enter 2st number");
	int b = sc.nextInt();
	
	System.out.println("total = "+a+b);

	System.out.println("Enter Name");
	
	String s = sc.next();
	
System.out.println("Enter Age");
	
	String s1 = sc.next();
	
System.out.println("Enter City");
	
	String s2 = sc.next();
	
	System.out.println("The name of individual is "+s+" and his age is "+s1+" and he is from "+s2);

	
}
}
