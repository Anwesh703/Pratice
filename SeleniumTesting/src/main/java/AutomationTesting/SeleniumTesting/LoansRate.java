package AutomationTesting.SeleniumTesting;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoansRate {
@Test(groups= {"Smoke"})
	public  void homeLoan() {
		System.out.println("In home loan method");
		
	}
@Test(groups= {"Regression"})
	public void personalLoan() {
		System.out.println("In personal loan method");
	}
	
@Test(groups= {"Regression"})
public void VehicleLoanoffering() {
	System.out.println("In VehicleLoanoffering method");
	System.out.println("************");
}
@Test(groups= {"Smoke"})
public  void BikeLoan() {
	System.out.println("In Bike method");
	
}
@Test(groups= {"Regression"})
public  void BikeLoanoffer() {
	System.out.println("In BikeLoanoffer method");
	System.out.println("*******");
}
@Test(groups= {"Regression"})
public  void BikeLoanofferExtends() {
	System.out.println("In before method");
	
}
@Test(groups= {"Regression"})
public  void BikeLoanoffertrain() {
	System.out.println("In BikeLoanoffertrain method");
	
}
@Test(groups= {"Regression"})
public void VehicleLoan() {
	System.out.println("In Vehicle method");
	System.out.println("************");
}
@Test(groups= {"Smoke"})
public void truckLoan() {
	System.out.println("************");
	System.out.println("In truckLoan method");
}
}
