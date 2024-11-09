package OopsConcept;

import java.util.Scanner;

public class CompoundInterestCalculator {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter savingsPermonth");
	int savingsPermonth = sc.nextInt();
	System.out.println("Enter maturity Period i.e., Total period of years");
	int years = sc.nextInt();
	System.out.println("Enter rate of interest");
	int interest = sc.nextInt();
    int savingsPerYear = savingsPermonth*12;
    int total = 0;
    int maintotal = 0;
    for(int i=1;i<=years;i++) {
    	total = savingsPerYear+savingsPerYear*interest/100;	
    	maintotal = maintotal+total;
    	
    }
    maintotal = maintotal+total;
    System.out.println(maintotal);
}
}
