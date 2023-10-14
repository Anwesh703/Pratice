package POM;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import AutomationTesting.SeleniumTesting.ExcelDataDriven;
import util.WebKeywords;

public class FacebookLogin {
//POM - Page object Model
	WebDriver driver;
	String ScreenName="FacebookLogin";
	Logger log=Logger.getLogger(FacebookLogin.class);
	public FacebookLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement EmailAdress=driver.findElement(By.id("email"));
	@FindBy(id="email")
	public WebElement TXT_EmailAdress;
	@FindBy(id="1pass")
	public WebElement TXT_Password;
	@FindBy(xpath="//*[@name='login']")
	public WebElement BTN_Login;
	@FindBy(linkText="Sign up for Facebook")
	public WebElement LNK_SignUpForFacebook;
	@FindBy(linkText="Forgotten account?")
	public WebElement LNK_ForgottenAccount;
	@FindBy(linkText="Forgotten password?")
	public WebElement LNK_ForgottenPassword;
	@FindBy(how=How.LINK_TEXT, using="Forgotten password?")
	public WebElement LNK_ForgottenPassword1;
	@FindBy(how=How.XPATH,using ="//*[@name='login']")
	public WebElement BTN_Login1;
	
	public void PerformFacebookLogin(String TestCaseName) throws IOException, InterruptedException {
		ExcelDataDriven excel = new ExcelDataDriven();
		
		ArrayList<String> al= excel.Run("C:\\Users\\anwreddy\\ExcelData\\FacebookLogin.xlsx",ScreenName,"TestCases",TestCaseName);
		WebKeywords we = new WebKeywords();
		we.sendKeys(driver,TXT_EmailAdress,al.get(1));
		
		we.sendKeys(driver,TXT_Password,al.get(2));
		new util.WebKeywords().click(driver,BTN_Login);
	}
	
	
	
	
	public void PerformFacebookLogin_Default(String TestCaseName) throws IOException, InterruptedException {
		ExcelDataDriven excel = new ExcelDataDriven();
		
		ArrayList<String> al= excel.Run("C:\\Users\\anwreddy\\ExcelData\\FacebookLogin.xlsx",ScreenName,"TestCases","Default");
		
	TXT_EmailAdress.sendKeys(al.get(1));
	TXT_Password.sendKeys(al.get(2));
	BTN_Login.click();}
	
	public void PerformFacebookLogin_Custom(String TestCaseName,int CustIndex) throws IOException, InterruptedException {
		ExcelDataDriven excel = new ExcelDataDriven();
		ArrayList<String> al= excel.Run("C:\\Users\\anwreddy\\ExcelData\\FacebookLogin.xlsx",ScreenName,"TestCases",TestCaseName+"_Custom"+CustIndex);
		
	TXT_EmailAdress.sendKeys(al.get(1));
	TXT_Password.sendKeys(al.get(2));
	BTN_Login.click();
	}
	
	
	
}
