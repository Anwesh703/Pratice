package AutomationTestingTraining.ProgramsAndCollections;

import java.util.HashMap;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsExample {
public static void main(String[] args) {
	String str = "hello Anwesh";
	  HashMap<Character, Integer> hash = new HashMap<Character, Integer>(){};
//	for(char ch:str.toCharArray()) {
//		hash.put(ch, hash.containsKey(ch)?hash.get(ch)+1:1);
//	}System.out.println(hash);
//	for(char ch:str.toCharArray()) {
//		if(hash.containsKey(ch)) {
//			System.out.println("first duplicate value is "+ch);
//			break;
//		}hash.put(ch,1);
//	}
	  
//	for(int i=1;i<100;i++) {
//		int count=0;
//		for(int j=1;j<=i;j++) {
//			if(i%j==0) {
//				count++;
//			}
//		}if(count==2) {System.out.print(i+" ");}
//	}System.out.println();
	  
	
	
	System.out.println(DequeCount("EELLEE",1));
	System.out.println(DequeCount("EELLLEELEELLEE",2));
	//List
	//ArrayList 
	ArrayList<String> arraylist = new ArrayList<String>();
	Collections.addAll(arraylist, "namasthe","Hi","good");
	System.out.println(arraylist.contains("Hi"));
	
	//LinkedList
		 LinkedList<String> list = new LinkedList<String>();
		  list.addFirst("hello ");
		  list.addLast(" bye");
		  list.add("This is anwesh");
		  list.get(0);
		  for(String l : list) {
			  System.out.print(l);
		  }
		  //vector
		  Vector<String> v = new  Vector<String>();
		  v.add("Hi andi");
		  System.out.println(v.get(0));
		  //Sets
		  HashSet<String> hs2 = new  HashSet<String>();
		  hs2.add("jai");
          LinkedHashSet<String> lh = new  LinkedHashSet<String>();
		  lh.add("Hello LinkedHashSet ");
		  for(String m : lh) {
			  System.out.println(m);
		  }
//stores only unique values in natural(ascending) order
		  TreeSet<String> ts = new TreeSet<String>();
		  ts.add("Hello TreeSet ");
		 
		  for(String m : ts) {
			  System.out.println(m);
		  }
//Map
		  HashMap<Integer, String> hm = new HashMap<Integer, String>(){{put(1,"Hello");put(2,"bye");}};
		  System.out.println("hashmap example " + hm.get(1));
		  LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>(){{put("hello",1);put("bye",3);}};
		  System.out.println("Linkedhashmap example " +lhm.get("hello"));
		  TreeMap<Integer, String> tm = new TreeMap<Integer, String>(){{put(1,"Hello");put(2,"bye");}};

//Deque
		  Deque<String> queue = new LinkedList<>();
		  queue.addFirst("namaste"); 
	   queue.offer("Hello");// to adds the specified element to the end of 
	//the deque and returns true if the element is added
	//return false if deque is full and cannot accommodate the element.
		   queue.add("Hello");// to adds the specified element to the end of 
	//the deque and throws IllegalStateException if deque is full and cannot accommodate the element.
		  queue.poll(); //  removes and returns the first element of the deque 
               	///and return null if the deque is empty
       queue.remove(); //  removes and returns the first element of the deque 
	               ///and throws NosuchElementException if the deque is empty
}
//EELLEE
public static int DequeCount(String ch,int number) {
	int count =0;
	 Deque<Character> queue = new LinkedList<>();
	for(char c : ch.toCharArray()) {
		if(c=='E') {
			queue.offer(c);
			if(queue.size()>number) {
				count++;
			}
		}else if(c=='L') {
			queue.poll();
		}
	}
	return count;
}
}
