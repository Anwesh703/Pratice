package OopsConcept;


//Method Overriding - Sub class maintains same signature method of super class and changes the method implementaion
//Note: without inheritance overriding cannot be done
// method overriding is not compulsary(it is optional)
// If we does not override the current class it will take the properties of super class
//If current class is overrided then it will only change the data of current class and does not effect the another sub class
public class Daughter extends MethodOveriding {

	public static void main(String [] args) {
		
		System.out.println(car());
	}
	public static int car() {
		System.out.println("Black");
		return 32112;
	}
	
}
