package AutomationTestingTraining.ProgramsAndCollections;
import java.util.*;
public class IntegerToChar {
	public static void main(String [] args) {
		integerToChar();
		anotherApproachintegerToChar();
	}
	public static void integerToChar() {
	ArrayList<Integer> ar = new ArrayList<Integer>(){};
	ArrayList<Character> ar1 = new ArrayList<Character>(){};
	Collections.addAll(ar,0,0,1,0,1,1,0,1,0,1,1,0,0,0);
	for(int i=0;i<ar.size();i++){
	    if(i==0 || i%2==0){
	        if(ar.get(i)==0){
	            ar1.add(i,'Z');
	        }else if(ar.get(i)==1){
	            ar1.add(i,'A');
	    }
	}
	 else if(i%2!=0){
	        if(ar.get(i)==0){
	            ar1.add(i,'z');
	        }else if(ar.get(i)==1){
	            ar1.add(i,'a');
	    }
	}
	
	
	}
	    System.out.println(ar1);
	}
	public static void anotherApproachintegerToChar() {
		// 	ArrayList<Integer> ar = new ArrayList<Integer>(){};
//	 	Collections.addAll(ar,0,0,1,0,1,1,0,1,0,1,1,0,0,0);

	int[] ar = {0,0,1,0,1,1,0,1,0,1,1,0,0,0};
	char[] ch= new char[ar.length];
		for(int i=0;i<ar.length;i++){
		    if(i==0 || i%2==0){
		        if(ar[i]==0){
		            ch[i]='Z';
		        }else if(ar[i]==1){
		             ch[i]='A';
		    }
		}
		 else if(i%2!=0){
		        if(ar[i]==0){
		             ch[i]='z';
		        }else if(ar[i]==1){
		            ch[i]='a';
		    }
		}
		
		
		}
		  for(int i=0;i<ar.length;i++)  {
		     System.out.print(ch[i]);
		  }
	}
}
