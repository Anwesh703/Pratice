package OopsConcept;

public class PolymorphismExample {
/* Polymorphism - poly - many 
	morphs - forms
	A single action which can be performed in multiple(different) ways.
	They are 2 types of polymorphism 
	1) Compile time polymorphism - method overloading
	2) run time polymorphism(Dynamic method dispatch) is a process in which a call to an overridden method is resolved at runtime rather than compile time.
	*/
	public static void main(String args[]) {
		Bank b;
		b = new SBI(); //upcasting
		System.out.println("SBI rate of interest " + b.getRateofinterest());
		b = new HDFC();
		System.out.println("HDFC rate of interest " + b.getRateofinterest());
		b = new ICICI();
		System.out.println("ICICI rate of interest " + b.getRateofinterest());
	}
	
	
	
}
