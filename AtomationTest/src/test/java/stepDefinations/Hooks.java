package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
@Before("@smokeTest")
	public void beforeSmokeTest() {
		System.out.println("before smoke test");
	}
@After("@smokeTest")
	public void afterSmokeTest() {
		System.out.println("after smoke test");
	}
}
