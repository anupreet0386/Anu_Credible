package page.signUpFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author anupreet
 * This page object contains selectors and methods for Credible Home Page
 */
public class CredibleHomePage {

	public static final String URL = "https://www.credible.com";

	//Selectors for link on the page
	private static final By SIGN_IN_LINK = By.cssSelector("a[data-ga-action='Log in']");

	//Selectors for labels on the page

	//Selectors for Input text fields

	//Constructor
	public CredibleHomePage(WebDriver driver){

	}

	//Click on Sign in Link on home page
	public void clickOnSignInLink(WebDriver driver){
		driver.findElement(SIGN_IN_LINK).click();
	}


}
