package AutomationTestingTraining.ProgramsAndCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArray {
public static void main(String [] args) {
	//str1 = “listen”  str2 = “silent” // anagram
	int count =0;
	String str1 = "listen";
	String str2 = "silent";
	char[] ch = str1.toCharArray();
	char[] ch2 = str2.toCharArray();
	  Arrays.sort(ch);
	  Arrays.sort(ch2);
	 
	for(int i=0;i<ch.length;i++) {
		if(ch[i]==ch2[i]) {
			count++;
		}else {
			break;
		}
	}
	if(count==ch.length) {
		System.out.println("is a anagram");
	}else {
		System.out.println("Not a anagram");
	}
	//Another way
//	char[] s = str1.toCharArray();
//	ArrayList<Character> ab = new ArrayList<Character>();
//	for(int i=0;i<s.length;i++) {
//		ab.add(s[i]);
//	}
//	char[] s2 = str2.toCharArray();
//	ArrayList<Character> ab2 = new ArrayList<Character>();
//	for(int i=0;i<s2.length;i++) {
//		ab2.add(s2[i]);
//	}
//	for(int i=0;i<s2.length;i++) {
//	if(ab2.contains(ab.get(i))) {
//		
//	}
//	}
//	
	
}
}


