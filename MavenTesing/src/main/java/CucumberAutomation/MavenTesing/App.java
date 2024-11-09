package CucumberAutomation.MavenTesing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;


public class App {

public static void main(String[] args) {
	 
//	  a.	Sally: {90, 84, 92, 88, 96}
//	  b.	Bob: {72, 84, 92, 66, 80}
//	  c.	Abby: {90, 82, 84, 70, 86}
//	  •	Use a data structure to store each student’s set of grades.
//	  •	Pass this data structure as an argument to a method which will calculate the average of each student’s grades
//	  •	Print out each student’s average grade.
	  Map<String,ArrayList<Integer>> maps = new HashMap<String,ArrayList<Integer>>();
	  ArrayList<Integer> ar = new ArrayList<Integer>();
	  Collections.addAll(ar, 90, 84, 92, 88, 96);
	  ArrayList<Integer> ar2 = new ArrayList<Integer>();
	  Collections.addAll(ar2, 72, 84, 92, 66, 80);
	  ArrayList<Integer> ar3 = new ArrayList<Integer>();
	  Collections.addAll(ar3, 90, 82, 84, 70, 86);
	  maps.put("Sally",ar);
	  maps.put("Bob",ar2);
	  maps.put("Abby",ar3);
	  ArrayList<String> keyName = new ArrayList<String>();
	  for(String s : maps.keySet()) {
		  keyName.add(s);
	  }
	  
	  System.out.println("The average of "+keyName.get(0) +" is "+averageOfStudentGrades(maps.get("Sally")));
	  System.out.println("The average of "+keyName.get(1) +" is "+averageOfStudentGrades(maps.get("Bob")));
	  System.out.println("The average of "+keyName.get(2) +" is "+averageOfStudentGrades(maps.get("Abby")));
	  
	// programing  output [p:1,r:2,o:1 …..]
	  Map<Character,Integer> map = new HashMap<Character,Integer>();
	  String str = "programing";
	  char[] ch = str.toCharArray();
	  for(char character:ch) {
		  map.put(character, map.containsKey(character)?map.get(character)+1:1);
	  }
	 System.out.println(map);
	 Set<Character> set = map.keySet();
	 Iterator<Character> i = set.iterator();
	// Iterator i = map.keySet().iterator();
	 while(i.hasNext()) {
		 System.out.println(map.get(i.next()));
	 }
	 System.out.println("Please enter the starcount to display: ");
	 Scanner sc = new Scanner(System.in);
	 int starCount = sc.nextInt();
	 starSchema(starCount);
	 swaptwoNumberWithout3rdvariable(10,21);
	 

  }
//  •	Pass this data structure as an argument to a method which will calculate the average of each student’s grades
public static int averageOfStudentGrades(ArrayList<Integer> ar) {
	int avg=0;
	for(int a:ar) {
		avg+=a;
	}
	return avg/ar.size();
} 	 
  
public static void starSchema(int starCount) {
	for(int i=1;i<=starCount;i++) {
		for(int j=1;j<=i;j++) {
		System.out.print("*");	
	}System.out.print("\n");
		}
}
public static void swaptwoNumberWithout3rdvariable(int a,int b) {	
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("the a and b value are swapped "+a+" "+b);
}
}
