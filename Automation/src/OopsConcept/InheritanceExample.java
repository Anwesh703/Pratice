package OopsConcept;
/*
 * Inheritance
 * polymorphism
 * abstraction and Encapsulation
 * 
 *    
 *    Inheritance - Acquiring the properties(variables and methods) from parent class(Super class) to sub class
 *    static members cannot be inheritted
 *    Acquiring means taking the copy of variables and members of non static members of super class.
 *    static variables and method cannot has copy to gives so they only shares the static data to subclass.
 *    To acquire all the properties we use keyword 'extends'
 *    inheritance is also called as 'IS-A'
 *    -->1 single level inheritance - single super class having single sub class
 *    -->2 hierarchical inheritance - single super class having multiple sub classes
 *   --> 3 Multi level inheritance 
 *   -->4 multiple inheritance
 */
public class InheritanceExample {
int ab=43;
static int d = 32;
	public void inhert() {
		System.out.println("InheritanceExample class");
	}
	
}
