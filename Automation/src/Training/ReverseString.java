package Training;

public class ReverseString {
public static void main(String [] args) {
	String str = "Welcome";
	String str1 = "";
	for(int i=str.length()-1;i>=0;i--) {
		System.out.println(str.charAt(i));
		str1=str1+str.charAt(i);

		
	}
	System.out.println(str1);
	
	System.out.println(str.replace("e","m"));
	System.out.println(str.concat(" to class"));
	
} 
 public String reverseString(String str) {
	String str1 ="";
	for(int i=str.length()-1;i>=0;i--) {
		str1=str1+str.charAt(i);	
	}
	return str1;
}
}
