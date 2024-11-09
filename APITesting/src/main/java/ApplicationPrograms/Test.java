package ApplicationPrograms;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr = {10.5, 2.4 , 1.5, 17.2, 19.6, 5.6, 1.1};
		//"ggggggjjjjjggkkkkkffkkkffffff"
		System.out.println(maxProfit(arr));		
	}
	
	public static int maxOccurance(String str) {
		HashMap<Character,Integer> hs = new HashMap<Character,Integer>(){};
	for(char ch:str.toCharArray()) {
		hs.put(ch, hs.containsKey(hs)?hs.get(ch)+1:1);
	}
		
	return 0;
	}
	
public static double maxProfit(double[] arr) {
	TreeSet<Double> ar = new TreeSet<Double>() {};
	for(double d:arr) {
		ar.add(d);}	
	double output = Math.abs(ar.pollFirst()-ar.pollLast());
	return output;
}
}
