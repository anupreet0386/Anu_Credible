package page.signUpFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author anupreet
 * This page object contains selectors and methods for Credible User Signup Page
 */
public class CredibleUserSignupPage {
	
	public CredibleUserSignupPage(WebDriver driver){
		
	}

	//Selectors for Links on the Page
	public static final By TERM_OF_USE_LINK = By.cssSelector("a[href='/terms']");
	public static final By LOGIN_LINK = By.cssSelector("a[href=/login']");
	
	//Slectors for Labels on the Page
	
	
	//Selctors for Input boxes on the Page
	public static final By SIGN_UP_PAGE_EMAIL_TEXT_BOX = By.cssSelector("input[id='c66_email']");
	public static final By SIGN_UP_PAGE_PASSWORD_TEXT_BOX = By.cssSelector("input[id='c66_password']");
	
	//Selectors for Pop Button on the Page
	public static final By FREE_GUIDE_YES_BUTTON = By.cssSelector("button[data-exitintel-name='button-2-1438730537188']");
	public static final By FREE_GUIDE_NO_BUTTON = By.cssSelector("button[data-exitintel-name='button-3-1438730547842']");
	public static final By SIGN_UP_POP_UP_CLOSE_BUTTON = By.cssSelector("button[data-exitintel-name='close-button #3']");
	
	//Selectors for Button on the Page
	public static final By SIGN_UP_BUTTON = By.cssSelector("button[data-ga-action='Create Account Button']");
	
	
	/**
	 * Set Email for Sign Up
	 * @param driver
	 * @param email
	 */
	public void setSignUpPageEmailTextBox(WebDriver driver,String email){
		driver.findElement(SIGN_UP_PAGE_EMAIL_TEXT_BOX).sendKeys(email);
	}
	/**
	 * Set Password for Sign Up
	 * @param driver
	 * @param password
	 */
	public void setSignUpPagePasswordTextBox(WebDriver driver, String password){
		driver.findElement(SIGN_UP_PAGE_PASSWORD_TEXT_BOX).sendKeys(password);
	}
	
	/**
	 * Click on Sign Up Button
	 * @param driver
	 */
	public void  clickOnSignUpButton(WebDriver driver){
		driver.findElement(SIGN_UP_BUTTON).click();
	}
	/**
	 * Click on Term of use Link 
	 * @param driver
	 */
	public void  clickOnTermOfUseLink(WebDriver driver){
		driver.findElement(TERM_OF_USE_LINK).click();
	}
	/**
	 * Click on Login Link 
	 * @param driver
	 */
	public void  clickOnLoginLink(WebDriver driver){
		driver.findElement(LOGIN_LINK).click();
	}
	/**
	 * Click on Pop up Yes Button
	 * @param driver
	 */
	public void  clickOnFreeGuideYesButton(WebDriver driver){
		driver.findElement(FREE_GUIDE_YES_BUTTON).click();
	}
	/**
	 * Click on Pop up No Button
	 * @param driver
	 */
	public void  clickOnFreeGuideNoButton(WebDriver driver){
		driver.findElement(FREE_GUIDE_NO_BUTTON).click();
	}
	/**
	 * Click on Pop up close Button
	 * @param driver
	 */
	public void  clickOnSignUpPagePopUpButton(WebDriver driver){
		driver.findElement(SIGN_UP_POP_UP_CLOSE_BUTTON).click();
	}
	
}
