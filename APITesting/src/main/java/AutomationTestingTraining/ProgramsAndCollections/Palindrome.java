package AutomationTestingTraining.ProgramsAndCollections;

import java.util.*;

import org.testng.annotations.Test;

public class Palindrome {

	public static void main(String[] args) {
		String s = "programmar";
		
		//first duplicate exit
		int duplicateIndexPlace = 0;
		Map<Character,Integer> hse = new HashMap<Character,Integer>(){};
		for(int j=0;j<s.length();j++) {
		if(!hse.containsKey(s.charAt(j))) {
			hse.put(s.charAt(j),1);
			duplicateIndexPlace++;
		}else {
			break;
			}
		}
		System.out.println("duplicate Index present in "+duplicateIndexPlace);
		Map<Character,Integer> hs = new HashMap<Character,Integer>(){};
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++) {
		hs.put(s.charAt(i), hs.containsKey(s.charAt(i))?hs.get(s.charAt(i))+1:1);}
		System.out.println(hs);
		//contains duplicate
		Set<Character> sc = new HashSet<Character>(){};
		for(int i=0;i<s.length();i++) {
			
			sc.add(ch[i]);
		}
		if(s.length()==sc.size()) {
			System.out.println("String does not contain duplicates");
		}else {
			System.out.println("String does contain duplicates");
		}
//		palindromeForNumberUsingPercentile(121);
//		palindromeForNumber(1001);
//		String s = "madam";
//		anotherPalindrome(s);
//		palindrome(s);
		
	}
	@Test
	public static void palindrome(String s) {
	int count=0;
	char[] ch = s.toCharArray();
	for(int i=s.length()-1;i>=0;i--) {
			if(ch[count]==s.charAt(i)) {
				count++;
			}			
	}
	if(count==s.length()) {
		System.out.println("Given string is palindrome");
	}else {System.out.println("Given string is not a palindrome");
	}
	}
	public static void anotherPalindrome(String s) {
		int index =0;
		int count=0;
		//char[] ch = s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--) {
				if(s.charAt(index++)==s.charAt(i)) {
					count++;
				}			
		}
		if(count==s.length()) {
			System.out.println("Given string is palindrome");
		}else {System.out.println("Given string is not a palindrome");
		}
	}
	public static void palindromeForNumber(int n) {
		int count=0;
		String s = String.valueOf(n);	
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(count)==s.charAt(i)) {
				count++;
			}}		
		if(count==s.length()) {
			System.out.println("Given Integer is palindrome");
		}else {System.out.println("Given Integer is not a palindrome");
		}
	}
	public static void palindromeForNumberUsingPercentile(int n) {
		int reverse_N = 0;
		int temp = n;
		while(temp>0) {
			reverse_N = reverse_N*10+temp%10;
			temp=temp/10;
		}
		if(n==reverse_N) {
			System.out.println("Given Integer is palindrome");
		}else {System.out.println("Given Integer is not a palindrome");
		}
	}	
}
