package Training;

public class B {
	public static int a = 21;
	public  int b = 312;
public static void main(String [] args) {
//	A a = new A();
	System.out.println(A.Addition(312, 312));
	ReverseString reverseString = new ReverseString();
	System.out.println(reverseString.reverseString("Reverse"));
	
	//static method as sm and non static method as nsm -> directly
	// SM -> SV [directly] -SM
	//NSM -> NSV directly - NSM
	//SM -> NSV [through object] - NSM
	//NSM -> SV directly - SM
	
	B b1 = new B();
	
	System.out.println(a);
	a= 32;
	b1.b = 612;
	System.out.println(a);
	System.out.println(b1.b);
	method1();
	b1.method2();
}
public static void method1() {
	System.out.println(a);
	B b1 = new B();
	System.out.println(b1.b);
}
public  void method2() {
	System.out.println(a);
    System.out.println(b);
    method1();
}
}

// create non static global variable and call it in static method ,
// and create static  global variable and call it in non static method in 1 class but don't call this in main class
// call them in another class 
