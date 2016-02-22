package signUpFlow;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.signUpFlow.CredibleHomePage;
import page.signUpFlow.CredibleUserSigninPage;
import utils.UserUtil;

public class CredibleUserSignupTest extends BaseTest {
	
	
	@Test
	public void testUserSignupFlowForStudentLoan() throws InterruptedException{
	
		WebDriver driver = getFireFoxWebdriver();
		UserUtil.navigateTo(driver, CredibleHomePage.URL);
		
		CredibleHomePage chp = new CredibleHomePage(driver);
		chp.clickOnSignInLink(driver);
		Thread.sleep(5000);
		
		CredibleUserSigninPage cusip = new CredibleUserSigninPage();
		cusip.clickOnSignUpLink(driver);
	}

	
}
