package OopsConcept;

public class TypeCasting2 {
public static void main(String [] args) {
	//Upcasting
	TypeCasting tc = new TypeCasting1();
	tc.method();
	//Downcasting
	TypeCasting1 tc1 = (TypeCasting1) tc;
	tc1.method();
}
}
