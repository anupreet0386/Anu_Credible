package page.signUpFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CredibleUserSigninPage {
	
	public CredibleUserSigninPage(WebDriver driver){
		
	}

	//Selectors for Input text fields on the page
	public static final By LOGIN_PAGE_EMAIL_TEXT_BOX = By.cssSelector("input[name= 'email']");
	public static final By LOGIN_PAGE_PASSWORD_TEXT_BOX = By.cssSelector("input[name='password']");

	//Selectors for Buttons on the page
	public static final By LOGIN_BUTTON = By.cssSelector("button[class='btn btn-primary login-button']");

	//Selectors for link on the page
	public static final By SIGN_UP_LINK = By.cssSelector("a[href='/signup']");

	public CredibleUserSigninPage(){

	}

	/**
	 * Enter desired User Email on Signin page
	 * @param driver
	 */
	public void setEmailAddress(WebDriver driver, String email){
		driver.findElement(LOGIN_PAGE_EMAIL_TEXT_BOX).sendKeys(email);
	}

	/**
	 * Enter desired User password on Signin page
	 * @param driver
	 */
	public void setUserPassword(WebDriver driver, String password){
		driver.findElement(LOGIN_PAGE_PASSWORD_TEXT_BOX).sendKeys(password);
	}

	/**
	 * Click on Login button on Signin page
	 * @param driver
	 */
	public void clickOnLogInButton(WebDriver driver){
		driver.findElement(LOGIN_BUTTON).click();
	}
	/**
	 * Click on Sign up link on Signin page
	 * @param driver
	 */
	public void clickOnSignUpLink(WebDriver driver){
		driver.findElement(SIGN_UP_LINK).click();
	}

}
