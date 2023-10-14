package OopsConcept;

public class Encapsulation {
//Encapsulation is a process of wrapping code and data together into a single unit.,
//we can create a fully encapsulated class in java by making all the data members of the class as private.
	public static void main(String [] args) {
		Student s = new Student();
		//System.out.println(s.getCollege());
		s.setCollege("JNTUH");
		s.setRollNumber("1223321231");
		System.out.println(s.getRollNumber());
//		System.out.println(s.getName());
//		s.setName("anwesh");
//		System.out.println(s.getName());
	}
	
	
}
