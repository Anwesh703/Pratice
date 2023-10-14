package OopsConcept;

final public class FinalExample {
	final static int b = 532;
	public static void main(String [] args) {
	
		System.out.println(b);
		method1();
		
	}
	final public static int method1() {
		return 583120;
	}
	
	
/*
 Final - Final keyword can be used for variables , method and also for class.
 If final Keyword is initialized to variable the reinitialising the variable is not possible
 Eg : final int a=23;
 -> if final keyword is assigned to method then overriding the method is not possible;
 Eg : final public void main(){
 sop("it is a final method");
 }
 -> if final kwyword is assigned to class then futher inheritance(Extends) of class is not possible.
 Eg :
 class A
 {
 final method A
 }
 final class B extends A{
 method A;
 }
 class c extends B{   // it is not possible compiler says that you cannot inherit the final class
 }
 Note : We can inherit final method but cannot override it.
 */
}
