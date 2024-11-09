package AutomationTestingTraining.ProgramsAndCollections;
import java.util.*;
public class DuplicateCountProgram {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(List.of(1,1,2,4,2,1,2,2));
		FirstduplicateNumber(al);
		ArrayList<Map<Integer,String>> al2 = new ArrayList<Map<Integer,String>>();
		Map<Integer,String> mapAddData = new HashMap<Integer,String>(){{put(1,"hello");put(2,"namasthe");}};
		al2.add(mapAddData);
		Map<Integer,String> mapAddData1 = new HashMap<Integer,String>(){{put(4,"Jai second row");put(2,"succesfully retrived");}};
		al2.add(mapAddData1);
		System.out.println(al2.get(0).get(1));
		System.out.println(al2.get(1).get(4));
		
	}
	public static void FirstduplicateNumber(ArrayList<Integer> al) {
		Map<Integer,Integer> firstDuplicate = new HashMap<Integer,Integer>();
		for(int number : al) {
          if(firstDuplicate.containsKey(number)) {
        	  System.out.println("The first duplicate value is "+number);
        	  break;
			}
			firstDuplicate.put(number, firstDuplicate.getOrDefault(number, 1));
			
		}
		//or
//		for(int number : al) {
//			if(firstDuplicate.containsKey(number)) {
//				System.out.println("The first duplicate value is "+number);
//				break;
//			}else {
//				firstDuplicate.put(number,1);
//			}
//			
//		}
	}
}
