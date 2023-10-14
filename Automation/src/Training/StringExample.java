package Training;

public class StringExample {
public static void main(String[] args) {
	String s1 = "Class";
	String s2 = "hello";
	String s3 = "hello";
	String s4 = new String("Welcome");
	String s5 = new String("welcome");
	
	String str = "Welcome to class";
	String[] str1 = str.split("e");
	System.out.println(str1[0]);
	System.out.println(str1[1]);
	System.out.println(str1[2]);
	
	
}
}
