package AutomationTesting.SeleniumTesting;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoanRate2 {
	@Test
	public void VehicleLoanoffering() {
		System.out.println("In VehicleLoanoffering method");
		System.out.println("************");
	}
	@Test
	public  void BikeLoan() {
		System.out.println("In Bike method");
		
	}
	@BeforeSuite
	public  void BikeLoanoffer() {
		System.out.println("In BikeLoanoffer method");
		System.out.println("*******");
	}
	@BeforeMethod
	public  void BikeLoanofferExtends() {
		System.out.println("In before method");
		
	}
	@Test
	public  void BikeLoanoffertrain() {
		System.out.println("In BikeLoanoffertrain method");
		
	}
	@BeforeTest
	public void VehicleLoan() {
		System.out.println("In Vehicle method");
		System.out.println("************");
	}
	@AfterTest
	public void truckLoan() {
		System.out.println("************");
		System.out.println("In truckLoan method");
	}
}
