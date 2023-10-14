package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindYourAccount {
	WebDriver driver;
	public FindYourAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="identify_email")
	public WebElement TXT_EmailAdressOrMobileNumber;
	@FindBy(id="did_submit")
	public WebElement BTN_Search;
	@FindBy(linkText="Cancel")
	public WebElement BTN_Cancel;
	@FindBy(className="_9nq2")
	public WebElement TXT_PleaseEnter;
	
	
	public void performFindYourAccount(String EmailAdressOrMobileNumber) {
		TXT_EmailAdressOrMobileNumber.sendKeys(EmailAdressOrMobileNumber);
		BTN_Search.click();
	}
}
