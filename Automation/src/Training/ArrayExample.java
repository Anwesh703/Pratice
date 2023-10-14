package Training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   int[] arr = new int[5];
//   arr[0]=101;
//   arr[1]=102;
//   arr[2]=103;
//   arr[4]=105;
//   arr[3]=104;
//   for(int index=0;index<arr.length;index++) {
//	   System.out.println(arr[index]);
//   }
//   String[] arr2 = {"Naveen","Tazeer","veenetha"};
//   System.out.println("***************");
//   for(int index=1;index<arr2.length;index++) {
//	   System.out.println(arr2[index]);
//   }
//   System.out.println("***************");
//	for(String s : arr2) {
//		System.out.println(s);
//	}
		List<String> l = new ArrayList<String>();
	List<String> a = new ArrayList<String>();
	a.add("Selenium");
	a.add("Java");
	
	a.add(2,"CSS");
	a.add(3,"Javascript");
	a.add(4, "HTML");
	l.addAll(a);
	a.remove(2);
	
	boolean b =a.contains("Javascrip");
	System.out.println(b);
	for(String s:a) {
		System.out.println(s);
	}
	
	//TypeCasting
	String[] arr = {"Selenium","Java","Javascript"};
	List<String> arrArrayList = Arrays.asList(arr);
	
	System.out.println(arrArrayList.contains("Jav"));
	
	String s = "name"; 
	int i = Integer.parseInt(s);
	
	
	
	
	
//	ArrayList<int> b = new ArrayList<int>();
	
	
	}
}
