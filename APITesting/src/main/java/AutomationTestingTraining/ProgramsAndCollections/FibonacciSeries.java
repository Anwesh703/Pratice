package AutomationTestingTraining.ProgramsAndCollections;

public class FibonacciSeries {
public static void main(String [] args) {
	//without recursive
	 int n1 =0;
	 int n2 = 1;
	 int n3=0;
	 System.out.print(n1+" "+n2);
	 for(int i=2;i<10;i++) {
		 n3=n1+n2;
		 n1 = n2;
		 n2 = n3;
		 System.out.print(" "+n3);
	 }
	 System.out.println();
	System.out.print("0 1 "); 
	 fibonacciWithRecusive(10-2);
}
static int n1=0,n2=1,n3=0;
public static void fibonacciWithRecusive(int n) {	
	if(n>0) {
	n3=n1+n2;
	n1=n2;
	n2=n3;
	System.out.print(n3+" ");
	fibonacciWithRecusive(n-1);
	}//if closed here
}
}
