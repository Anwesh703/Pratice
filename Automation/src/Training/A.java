package Training;

public class A {
	B b  =  new B();
	public static void main(String[] args) {
		A a = new A();
	System.out.println(a.Addition(21,54));
	A a1 = new A();
	System.out.println(a1.Addition(42,534));
	System.out.println(B.a);
	B b  =  new B();
	int as = B.a + b.b;
	System.out.println(b.b);
	}
	public static int Addition(int a,int b) {
		int c= a+b;
		return c;
	}
	public int Addition() {
		int c = B.a + b.b;
		return c;
	}
	int a=321;
	int c = 21;
	public int add() {
		int d= a+c;
		return d;
		
	}
}
