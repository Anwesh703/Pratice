package AutomationTestingTraining.ProgramsAndCollections;

import java.util.Arrays;
import java.util.List;

public class SubStringFromWords {
public static void main(String[] args) {
	String word = "Akshay is a Handsome guy";
	String subString = "handsome";
	SubStringFromWord(word,subString);
	System.out.println(indexOfChar(subString,'o'));
	
}
public static void SubStringFromWord(String word,String subString) {
	String[] arr = word.split(" ");
	List<String> sub= Arrays.asList(arr);
	int max =0;
	int maxIndex =0;
	for(int i=0;i<sub.size();i++) {
	int expectedmax = sub.get(i).length();
	if(max<expectedmax) {
		max=expectedmax;
		maxIndex=i;}
			}
	System.out.println("The word "+ sub.get(maxIndex)+ " is max with length "+ max);
	//return sub.contains(subString);
}
public static int indexOfChar(String word,char c) {
	char[] ch = word.toCharArray();
//	List<char[]> as = Arrays.asList(ch);
//	as.contains('b');
	int indexPosition=0;
	for(int i=0;i<ch.length;i++) {
		if(ch[i]==c) {
			indexPosition = i;
		}
	}
	return indexPosition;
}
}
