package AutomationTestingTraining.ProgramsAndCollections;
import java.util.*;
import java.util.stream.Stream;
public class StreamExample {
	 public static void main(String[] args) {
	        int[] arr = {2,4,6,8,0,2,4,5,0,10};
	        List<Integer> al= new ArrayList<>();
	        for(int l:arr) {
	        al.add(l);}
	      //  Arrays.stream(arr).distinct().forEach(System.out::println);
	       // Arrays.stream(arr).sorted().forEach(System.out::println);
	       // al.stream().sorted().forEach(System.out::println);
	       //Stream<Integer> ar = al.stream().sorted();
	       
	        for(int i=0;i<arr.length-1;i++) {
	        	for(int j=0;j<arr.length-1;j++) {
	        		//{2,4,6,8,0,2,4,5,0,10};
	        		if(arr[j]>arr[j+1]) {
	        			int temp = arr[j];
	        			arr[j] = arr[j+1];
	        			arr[j+1] = temp;
	        		}
	        	}
	        }
	    
	        for(int o:arr)
	        System.out.println(o);
//	        int count =0;
//	        int size = al.size();
//	        for(int i:al) {
//	        	if(i==0) {
//	        		count++;
//	        		 al.remove(i);
//	        	}else {break;}
//	        }
//while(al.size()<size) {
//	al.add(0);
//}
//System.out.println(al);
//	        Set<Integer> hash = new HashSet<>() ;
//	        for(int j:hash){
//	            System.out.println(j);
//	        }
	    }
}
