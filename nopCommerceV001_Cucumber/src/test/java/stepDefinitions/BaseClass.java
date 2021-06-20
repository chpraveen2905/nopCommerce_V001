package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.Properties;

import org.apache.log4j.Logger;

import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class BaseClass {
	public WebDriver driver;
	public LoginPage lp;
	public static Logger logger;
	public Properties configProp;
	public SearchCustomerPage searchCust;
	public AddcustomerPage addCust;
	public static String randomestring(){
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
}
