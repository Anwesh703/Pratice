package AutomationTestingTraining.ProgramsAndCollections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.Map;
import java.util.Stack;

import org.checkerframework.common.reflection.qual.ForName;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import groovyjarjarantlr4.v4.gui.TreePostScriptGenerator.VariableExtentProvide;

public class Practice {
	
	public static void main(String[] args) {
		// sort

		// test.fail("Test case failed");

		int arr[] = { 3, 4, 1, 0, 7, 9, 41, 0, 53 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//if(arr[i]<arr[j]) {
//	int temp = arr[i];
//	arr[i] = arr[j];
//	arr[j] = temp;
//}
			}
		}

		for (int a : arr) {
			System.out.println(a);
		}
		countOccurenceOfChar("Helloo Namesthe");
		// below code is not correct code for balancePara
		balanceParanthesis("()[][");
		int[] arr1 = { 2, 3, 10, 2, 36, 7, 1, 0 };
		unqiueValues(arr1);
		System.out.println(nThHighestNumber(arr1, 2));
		String mysentence = "Hi Anwesh, This is Apple, This is ball, This is doll, cat is there, dog is here";
		System.out.println(subStringFind(mysentence));
		primeNumber(101);

	}

	public static void countOccurenceOfChar(String s) {
		char[] ch = s.toCharArray();
		Map<Character, Integer> hs = new HashMap<Character, Integer>() {
		};
		for (char c : ch) {
			hs.put(Character.toLowerCase(c), hs.containsKey(Character.toLowerCase(c)) ? hs.get(c) + 1 : 1);
		}
		System.out.println(hs);
	}

	public static void balanceParanthesis(String str) {
		// {})(;
		int count = 0;
		Stack<Character> sc = new Stack<Character>() {
		};
		for (char c : str.toCharArray()) {
			if (c == '{' || c == '[' || c == '(') {
				sc.push(c);
			} else if (sc.isEmpty()) {
				System.out.println("given string " + str + " is not well balanced");
				count++;
			} else if ((c == '}' && sc.peek() == '{') || (c == ']' && sc.peek() == '[')
					|| (c == ')' && sc.peek() == '(')) {
				sc.pop();
			}
		}
		if (count == 0) {
			System.out.println("given string " + str + " is well balanced");
		}
	}

	public static void unqiueValues(int arr[]) {
		int[] uniqueArr = new int[arr.length];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < count; j++) {
				if (arr[i] == uniqueArr[j]) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				uniqueArr[count++] = arr[i];
			}
		}
		for (int c : uniqueArr) {
			System.out.println(c);
		}
	}

//eg: 5th highest number in an array
	public static int nThHighestNumber(int[] arr, int n) {
		int count = 0;
		Integer max = null;
		TreeSet<Integer> unique = new TreeSet<Integer>() {
		};
		for (int i : arr) {
			unique.add(i);
		}
		for (int k : unique) {
			if (count == unique.size() - n) {
				max = k;
				break;
			}
			count++;
		}
		return max;
	}

//String mysentence = "This is Apple, This is ball, This is doll, cat is there, dog is here";
	public static ArrayList<String> subStringFind(String str) {
		String[] arr = str.split(", ");
		ArrayList<String> as = new ArrayList<String>() {
		};
		for (String s : arr) {
			if (s.startsWith("This is")) {
				as.add(s.split("This is")[1].trim());
			} else if (s.endsWith("is there")) {
				as.add(s.split("is there")[0].trim());
			} // subString example
			else if (s.endsWith("is here")) {
				as.add(s.substring(0, 3));
			} else if (s.startsWith("Hi")) {
				as.add(s.substring(3));
			}
//		}else if (s.endsWith("is here")) {
//			as.add(s.split("is here")[0].trim());
//		}
		}
		return as;
	}

	public static void primeNumber(int n) {
		int count = 0;
		for (int i = 2; i <= n; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(i + " ");
			}
		}
	}

}