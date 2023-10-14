package OopsConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class A {
public static void main(String args[]){
	ArrayList<ArrayList<String>> as = new ArrayList<ArrayList<String>>() {};
	ArrayList<String> al = new ArrayList<String>() {};
	
	Collections.addAll(al,"sas","dadj");
ArrayList<String> al1 = new ArrayList<String>() {};
	
	Collections.addAll(al1,"sas","dadj");
	ArrayList<Hashtable<String, String>> hash = new ArrayList<Hashtable<String, String>>() {};
	Hashtable<String, String> h = new Hashtable<String, String>(){{put("1","val");put("2","hello");put("3","good");}};
	
	hash.add(h);
	System.out.println(hash.get(0).get("1"));
	
	
	Collections.addAll(as, al);
	System.out.println(as.get(0).get(1));
	Car c1 = new Car("Red");
	Car c2 = new Car("Blue");
	Car c3 = new Car("Yellow");
//System.out.println(c3.wheels);
}
}
