package Training;

public class Localvariables {
public static int d=43;
int r=32;
	public static void main(String[] args) {
		int t=323;
		System.out.println(d);
		even();
System.out.println(addition());
System.out.println(sub());

	}
	
	//Rules of method identifiers   $ _
	/* 2Demo
	 * #Demo
	 * demoPage
	 * _demopage
	 * @demoPage
	 * Demo_Page
	 * DemO
	 * demo78
	 * Demo#Page
	 * demo Page
	 */
	
	// Control statements :It will help us to control the flow of program
	// simple if
//	if else 
//	else if
//	switch
	//Scenario : Print only even numbers from 1 - 100
	public static void even() {
		
		
		for(int i=1;i<=100;i++) {
		if(i%2==0) {
		System.out.println(i);	
		}
		}
		
		
	}
	
	
	//accessModifier staticOrNonStaticMethodKeyword returnType methodName()
	public static float addition() {
		//550+212+31+43
		float a=550.21f;
		int b=212;
		float c=31.32f;
		double g = 22.10;
		char h = 'd';
		float e=a+b+c+d;
		String str =  "Hello world sdhsdnmasdsa";
		return b;
		
	}
	public static float sub() {
		//550+212+31+43
		float a=550.21f;
		int b=212;
		float c=31.32f;
		double g = 22.10;
		char h = 'd';
		float e=a-b-c-d;
		String str =  "Hello world sdhsdnmasdsa";
		return e;
		
	}
	
	
	
	

}
