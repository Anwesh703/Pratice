package OopsConcept;

public class TypeCasting {
/*TypeCasting: It is a process of converting a value from one data type to another datatype in 
	both ways automatically or manually
	Upcasting : upcasting is the typecasting of a subclass object to a super class object 
	i.e, It gives us the flexibility to access the super class members but not possible 
	to access subclass members[Sub class members are hidden]
	*/
	public static int a = 421;
	public  static void method() {
		System.out.println("In TypeCasting class");
	}
	public  static void main1() {
		System.out.println("In TypeCasting class");
	}
	/* Downcasting : Downcasting is the type casting of superclass to subclass object 
	 * i.e., it have the properties[members] of both the class of super class and subclass members
	 */
	/* Note : If a super class method is overided by the subclass and if we create an object for super class
	 * object from subclass constructor[i.e., A a1 = new B()] and when we call the super class method 
	 * from main method we will get the overided output of subclass because the method is overided
	 */
}
