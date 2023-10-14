package OopsConcept;

public class InterfaceExampleSubClass implements InterfaceExample{

	@Override
	public void run() {
		System.out.println("In run method");
	}

	@Override
	public void run(int a) {
		System.out.println("In run method with arguments");
	}
	
	public static void main(String [] args) {
		new InterfaceExampleSubClass().run(321);
		System.out.println(a);
	}

}
