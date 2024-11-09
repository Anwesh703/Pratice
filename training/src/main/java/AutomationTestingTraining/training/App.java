package AutomationTestingTraining.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class App {
  public static void main(String[] args) {
	 // a[10,25,23,6,78] ta=29
	 int a[] = {10,25,23,6,78};
	 int target = 29;
	 ArrayList<Integer> output= new ArrayList<Integer>();
	 for(int i=0;i<a.length;i++) {
		 for(int j=i+1;j<a.length;j++) {
			 if(a[i]+a[j]==target) {
				 output.add(i);
				 output.add(j);
				 
			 }
		 }
	 }
	 System.out.println(output);
	System.out.println(reverseString("anwesh")); 
	System.out.println(reverseVowels("hello, World!"));
  }
  public static String reverseString(String s) {
	  char[] ch = s.toCharArray();
	  String reverseString="";
	  for(int i=ch.length-1;i>=0;i--) {
		  reverseString+=ch[i];
	  }
	  return reverseString;
  }
  public static String reverseVowels(String s) {
	  
	  Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
	  char[] ch = s.toCharArray();
	  int left=0;
	  int right =ch.length-1;
	  while(left<right) {
		  while(left<right && !vowels.contains(ch[left])){
			  left++;
		  }
          while(left<right && !vowels.contains(ch[right])){
			  right--;
		  }
          if(left<right) {
        	  char temp = ch[left];
        	  ch[left] = ch[right];
        	  ch[right] = temp;
        	  left++;
        	  right--;
          }
	  }
	 
	  return new String(ch);
  }
}
