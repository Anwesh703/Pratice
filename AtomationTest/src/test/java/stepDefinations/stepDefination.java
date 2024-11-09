package stepDefinations;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefination {
	WebDriver driver;
	public WebDriver InitializeDriver()
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
    	ChromeOptions options= new ChromeOptions();    	
    	options.setAcceptInsecureCerts(true);
    	options.addArguments("start-maximized"); // open Browser in maximized mode
    	//options.addArguments("--start-fullscreen");
    	//options.addArguments("--incognito");
    	options.addArguments("disable-infobars"); // disabling infobars
    	options.addArguments("--disable-extensions"); // disabling extensions
    	options.addArguments("--disable-gpu"); // applicable to windows os only
    	options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
    	options.addArguments("--no-sandbox"); // Bypass OS security model 
    	WebDriverManager.chromedriver().setup();
    	driver= new ChromeDriver();
    	driver.manage().deleteAllCookies();
    	
    	return driver;
	}
	
	public stepDefination(){
	 driver = InitializeDriver();
	}
	@Given("^user is on landing page$")
	public void user_is_on_Landing_page() {
		System.out.println("navigated to login page");
	}
//	@When("^user signups with below details$")
//	public void user_signups_with_below_details(DataTable dataTable) {
//		List<List<String>> list = dataTable.asLists();
//	    System.out.println(list.get(0).get(0));
//	    System.out.println(list.get(0).get(1));
//	    System.out.println(list.get(0).get(2));
//	    System.out.println(list.get(0).get(3));
//	}
	@When("^user signups with below details$")
	public void user_signups_with_below_details(DataTable dataTable) {
		List<Map<String, String>> list = dataTable.asMaps();
		 
	    System.out.println(list.get(0).get("UserName"));
	    System.out.println(list.get(0).get("Password"));
	    System.out.println(list.get(0).get("Date"));
	    System.out.println(list.get(0).get("Greetings"));
	}

	@When("^user enters the (.+) and (.+) credentials$")
	public void user_enters_the(String username,String password) {
	  System.out.println(username);
	  System.out.println(password);
	}
	
	@When("user enter the {string} and {string} credentials")
	public void user_enter_the_and_credentials(String string, String string2) {
	  System.out.println(string);
	  System.out.println(string2);
	}
	@And("^clicks on login button$")
public void clicks_on_login_button() {
		System.out.println("clicked on login page");
	}
	@Then("User lands on Home page is {string}")
	public void user_lands_on_home_page_is(String string) {
	  System.out.println(string);
	}
	@Given("validate the browser")
	public void validate_the_browser() {
	    System.out.println("Browser is chrome");
	}
	@When("browser is triggered")
	public void browser_is_triggered() {
	    System.out.println("Browser is triggered");
	}
	@Then("check if browser is started")
	public void check_if_browser_is_started() {
	    System.out.println("broswer is launched");
	}
	
	
	
	//DTE
	@Given("^user is on (.+) DTE home page$")
	public void user_is_on_https_dte_deloitte_com_te_expense_summary_aspx_dte_home_page(String url) {
		new stepDefination();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@When("user clicks on hyperlink of current week")
	public void user_clicks_on_hyperlink_of_current_week() {
		if (Integer.parseInt(driver.findElement(By.xpath("(//span[@class='TotalHoursColumn gridItemStyle linkBlue'])[2]/u")).getText())<40){
		driver.findElement(By.xpath("//a[@title='Click to go to the timesheet for this period'])[3]")).click();}
		else {
			System.out.println("Skipped time charging");
		}
		
	 }

	@Then("User lands on DTE page and clicks on expand button")
	public void user_lands_on_dte_page_and_clicks_on_expand_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@aria-label='Expand Tax Jurisdiction']//span[@class='icon-standard-simple-arrow-right-special']")).click();
		
	
	 }

	@Then("^user enters (.+) hours on (.+) for charge code$")
	public void user_enters_hours_for_charge_code(String hours,String day) {
		driver.findElement(By.xpath("//input[@aria-label='Attendance Hours entry for "+day+"']")).sendKeys(hours);
	 }

	@Then("Clicks on save button")
	public void clicks_on_save_button() {
		System.out.println("Clicked on save button");
	 }
	
	
}
