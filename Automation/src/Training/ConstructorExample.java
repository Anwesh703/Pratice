package Training;
//default
 public class ConstructorExample {
public int a;
public int b;
	//AccessModifier Classname()
	public ConstructorExample() {
		
	}
private ConstructorExample(int a,int b) {
	this(23);
		 this.a=a;
		 this.b=b;
		 System.out.println("int and int values are displayed " +this.a+this.b);
	}
public ConstructorExample(int b) {

	 System.out.println("int value is displayed " +b);
}
public ConstructorExample(double b) {
	this(21,2312);
	
	 System.out.println("double value is displayed " + b);
	 
}

protected  int nonStatic() {
	//ConstructorExample ce1= new ConstructorExample();
	System.out.println(a);
	return a;
}


	public static void main(String[] args) {
		//ConstructorExample ce= new ConstructorExample();
		ConstructorExample ce1= new ConstructorExample(312.3);
//		ConstructorExample ce2= new ConstructorExample(34);
//		ConstructorExample ce4= new ConstructorExample(53);
		//ConstructorExample ce3= new ConstructorExample(34,423);
		
		ce1.nonStatic();
			
			
		

	}
	

}