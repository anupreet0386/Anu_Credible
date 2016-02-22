package signUpFlow;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import page.signUpFlow.CrediblePersonalLoanPage;
import utils.UserUtil;

public class CrediblePersonalLoanBorrowerTest extends BaseTest {

//	@Test
//	public void testCrediblePersonalLoanBorrower(){
//		WebDriver driver = getFireFoxWebdriver();
//		CrediblePersonalLoanPage cplp = new CrediblePersonalLoanPage(driver);
//		UserUtil.navigateTo(driver, CrediblePersonalLoanPage.PERSONAL_LOAN_URL);
//		cplp.setFirstName(driver, "Anupreet");
//		cplp.setLastName(driver, "Kaur");
//		cplp.setLoanAmount(driver, "5,000");
//		cplp.selectLoanPurpose(driver);
//		cplp.selectDateOfBirth(driver, "10-3-1975");
//		cplp.selectCurrentEmploymentStatus(driver);
//		cplp.setAnnualIncome(driver, "50,000");
//		cplp.selectEstimatedCreditScore(driver);
//		cplp.setSocialSecurityNumber(driver, "123456789");
//		cplp.setPhoneNumber(driver, "9999999999");
//		//	cplp.setPermanentAddress(driver, "1035 Aster Avenue Sunnyvale, CA, United States");
//		cplp.clickEnterAddressManually(driver);
//		cplp.setAddressStreet(driver, "1035 Aster Avenue");
//		cplp.setAddressCity(driver, "Sunnyvale");
//		cplp.setUnitNumber(driver, "1214");
//		cplp.selectAddressState(driver, "California");
//		cplp.setAddressZipcode(driver, "94086");
//		cplp.selectHousingStatus(driver);
//		cplp.setEmailAddress(driver, "interntest_anupreet@interest.com");
//		cplp.setPassword(driver, "Anupreet123");
//		cplp.clickCheckBox(driver);
//		//cplp.clickFindMyRates(driver);
//
//	}

	/**
	 * This test is to see that the user is able to get Pre-Qualified
	 * loan rates
	 */
	@Test
	public void testCrediblePersonalLoanBorrower2(){
		WebDriver driver = getFireFoxWebdriver();
		CrediblePersonalLoanPage cplp = new CrediblePersonalLoanPage(driver);
		UserUtil.navigateTo(driver, CrediblePersonalLoanPage.PERSONAL_LOAN_URL);
		cplp.setFirstName(driver, "Anupreet")
		.setLastName(driver, "Kaur")
		.setLoanAmount(driver, "5,000")
		.selectLoanPurpose(driver)
		.selectDateOfBirth(driver, "10-3-1975")
		.selectCurrentEmploymentStatus(driver)
		.setAnnualIncome(driver, "50,000")
		.selectEstimatedCreditScore(driver)
		.setSocialSecurityNumber(driver, "123456789")
		.setPhoneNumber(driver, "9999999999")
		//	cplp.setPermanentAddress(driver, "1035 Aster Avenue Sunnyvale, CA, United States");
		.clickEnterAddressManually(driver)
		.setAddressStreet(driver, "1035 Aster Avenue")
		.setAddressCity(driver, "Sunnyvale")
		.setUnitNumber(driver, "1214")
		.selectAddressState(driver, "California")
		.setAddressZipcode(driver, "94086")
		.selectHousingStatus(driver)
		.setEmailAddress(driver, "interntest_anupreet@interest.com")
		.setPassword(driver, "Anupreet123")
		.clickCheckBox(driver)
		.clickFindMyRates(driver);

	}

}
