package OopsConcept;

abstract public class AbstractClass {
//Abstract : It is an incomplete method i.e., It has only method signature
	// syntax: abstract access modifier returnType methodname();
	abstract public void carClour();
	//Abstract It has only method signature and ends with semicolumn with a keyword "abstract"
	public void car1() {
		System.out.println("hello");
	}
	public void car2() {
		System.out.println("hello car2");
	}
	
	// If a class consists of only one Incomplete method then it is called as Incomplete class.
	//So we need to declare abstract before class.
	//By developing complete method we give an option to subclass to override the methods of super class.
	// By developing Incomplete methods we make it complusary to subclass to override the method of super class.
	// By using 'final' keyword overriding cannot be done.
	
}
