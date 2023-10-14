package Selenium;

import OopsConcept.FinalExample;
import Training.A;
import Training.ConstructorExample;
public class ClassA {
	ConstructorExample ce=new ConstructorExample();
	public static void main(String [] args) {
	System.out.println(FinalExample.method1());
	A a = new A();
	a.add();
	//OopsConcept.A a1 = 
	//System.out.println(new OopsConcept.A().a);
	}
	//public : It can be accessed in same class & in another class of same package 
	//and in different package of another classs by jusing keyword 'import' Eg of import keyword ;import packagename.classname;
	/* default : It can be accessed in same class & in another class of same package.
	 * Private : It can be accessed in same class & cannot be accessed by another class of same package also.
	 * Protected : It can be acccessed in same class, another class of same package and can be accessed by
	 *  another class of another package but need to use both keyword 'import' and we need to perform inheritance
	 */
	
}

