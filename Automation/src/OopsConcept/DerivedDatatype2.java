package OopsConcept;

public class DerivedDatatype2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DerivedDataTypes d;
		d = new DerivedDataTypes();
		d.a = 21;
		d.b = "String";
		//Syntax : DerivedDataType objectName = new Constructor();
		main1().a=21;
		System.out.println(d.a);
	}
	
		public static DerivedDataTypes main1() {
			// TODO Auto-generated method stub
			DerivedDataTypes renew = new DerivedDataTypes();
			return renew;
			
		}

	
}
