package page.signUpFlow;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CrediblePersonalLoanPage {

	public CrediblePersonalLoanPage(WebDriver driver){

	}

	//URL
	public static final String PERSONAL_LOAN_URL ="https://www.credible.com/personal-loan/borrower";

	//Fields
	public static final By FIRST_NAME = By.cssSelector("input[ id='c71_borrower_first_name']");
	public static final By LAST_NAME = By.cssSelector("input[id='c71_borrower_last_name']");
	public static final By LOAN_AMOUNT = By.cssSelector("input[id='c71_loan_amount']");

	public static final By LOAN_PURPOSE = By.cssSelector("div[id='s2id_c71_loan_purpose'] a[class='select2-choice']");
	//	public static final By LOAN_PURPOSE_ARROW = By.cssSelector("#s2id_c71_loan_purpose .select2-arrow");
	public static final String LOAN_PURPOSE_ARROW = "#s2id_c71_loan_purpose .select2-arrow";

	public static final By FIRST_VALUE_FROM_DROPDOWN = By.cssSelector(".select2-result-sub [id*='select2-result-label']");

	public static final By DATE_OF_BIRTH = By.cssSelector("div[class='input-group date datepicker-container'] input[class='form-control']");

	public static final By CURRENT_EMPLOYMENT_STATUS = By.cssSelector("a[class='select2-choice'] span[id='select2-chosen-2']");
	//public static final By CURRENT_EMPLOYMENT_STATUS_ARROW = By.cssSelector("#s2id_c71_employment_employment_status .select2-arrow");
	public static final String CURRENT_EMPLOYMENT_STATUS_ARROW = "#s2id_c71_employment_employment_status .select2-arrow";

	public static final By ANNUAL_INCOME = By.cssSelector("input[id='c71_employment_income_yearly']");

	//	public static final By ESTIMATED_CREDIT_SCORE = By.cssSelector("div[id='s2id_c71_borrower_credit_score_approx'] span[id='select2-chosen-3']");
	//	public static final By ESTIMATED_CREDIT_SCORE_ARROW= By.cssSelector("#s2id_c71_borrower_credit_score_approx .select2-arrow");
	public static final String ESTIMATED_CREDIT_SCORE_ARROW= "#s2id_c71_borrower_credit_score_approx .select2-arrow";

	public static final By SOCIAL_SECURITY_NUMBER = By.cssSelector("input[id='c71_borrower_ssn']");

	//	public static final By PHONE_NUMBER = By.cssSelector("#c71_borrower_phone");
	public static final String PHONE_NUMBER = "c71_borrower_phone";

	public static final By ENTER_ADDRESS_MANUALLY = By.cssSelector(".to-manual-mode");
	public static final By ADDRESS_STREET = By.cssSelector("#c71_current_address_street");
	public static final By ADDRESS_CITY = By.cssSelector("#c71_current_address_city");
	public static final By ADDRESS_STATE = By.cssSelector("#s2id_c71_current_address_state a");
	//public static final By ADDRESS_ZIPCODE = By.cssSelector("#c71_current_address_zipcode");
	public static final String ADDRESS_ZIPCODE = "c71_current_address_zipcode";
	//public static final By PERMANENT_ADDRESS = By.cssSelector("input[id='c71_current_address_full_address']");
	public static final String PERMANENT_ADDRESS = "c71_current_address_full_address";

	public static final By UNIT_NUMBER = By.cssSelector("input[id='c71_current_address_unit']");

	public static final By HOUSING_STATUS = By.cssSelector("div[id='s2id_c71_expenses_housing_type'] span[id='select2-chosen-5']");
	//public static final By HOUSING_STATUS_ARROW= By.cssSelector("#s2id_c71_expenses_housing_type .select2-arrow");
	public static final String HOUSING_STATUS_ARROW= "#s2id_c71_expenses_housing_type .select2-arrow";

	public static final By EMAIL_ADDRESS = By.cssSelector("input[id='c66_email']");
	public static final By PASSWORD = By.cssSelector("input[id='c66_password']");

	//Buttons, Links, Checkbox, Radio button
	public static final By CHECK_BOX = By.cssSelector("label[for='c71_borrower_accept_terms-0'] span[class='checkbox-icon']");
	public static final By CREDIT_REPORT_PULL_AUTHORISATION = By.cssSelector("label[for='c71_borrower_accept_terms-0'] a[id='disclosure1']");
	public static final By TERMS_OF_USE = By.cssSelector("label[for='c71_borrower_accept_terms-0'] a[href='/terms']");
	public static final By PRIVACY_POLICY = By.cssSelector("label[for='c71_borrower_accept_terms-0'] a[href='/privacy']");
	public static final By ELECTRONICS_CONSENT = By.cssSelector("label[for='c71_borrower_accept_terms-0'] a[id='disclosure2']");
	public static final By FIND_MY_RATES = By.cssSelector("button[class='btn btn-primary btn-full']");

	/**
	 * Set First name
	 * @param driver
	 * @param firstname
	 */
	public CrediblePersonalLoanPage setFirstName(WebDriver driver, String firstName){
		driver.findElement(FIRST_NAME).sendKeys(firstName);
		return this;
	}

	/**
	 * Set Last name
	 * @param driver
	 * @param lastname
	 */
	public CrediblePersonalLoanPage setLastName(WebDriver driver, String lastName){
		driver.findElement(LAST_NAME).sendKeys(lastName);
		return this;
	}
	/**
	 * Set Loan Amount
	 * @param driver
	 * @param loanamount
	 */
	public CrediblePersonalLoanPage setLoanAmount(WebDriver driver, String loanAmount){
		driver.findElement(LOAN_AMOUNT).sendKeys(loanAmount);
		return this;
	}
	/**
	 * Select Loan Purpose
	 * @param driver
	 * @param loanpurpose
	 */
	public CrediblePersonalLoanPage selectLoanPurpose(WebDriver driver){
		//		Select dropdown= new Select(driver.findElement(LOAN_PURPOSE));
		//		dropdown.selectByVisibleText(loanPurpose);
		WebElement loanDropdown = driver.findElement(By.cssSelector(LOAN_PURPOSE_ARROW));
		loanDropdown.click();
		driver.findElement(FIRST_VALUE_FROM_DROPDOWN).click();
		return this;

	}
	/**
	 * Select date of Birth
	 * @param driver
	 * @param dob
	 */
	public CrediblePersonalLoanPage selectDateOfBirth(WebDriver driver, String dob){
		driver.findElement(DATE_OF_BIRTH).sendKeys(dob);
		return this;
	}
	/**
	 * Select Employment status
	 * @param driver
	 * @param employmentstatus
	 */
	public CrediblePersonalLoanPage selectCurrentEmploymentStatus(WebDriver driver){
		//		Select dropdown= new Select (driver.findElement(CURRENT_EMPLOYMENT_STATUS));
		//		dropdown.selectByVisibleText(employmentStatus);
		WebElement employmentDropdown = driver.findElement(By.cssSelector(CURRENT_EMPLOYMENT_STATUS_ARROW));
		employmentDropdown.click();
		driver.findElement(FIRST_VALUE_FROM_DROPDOWN).click();
		return this;
	}
	/**
	 * Set Annual Income
	 * @param driver
	 * @param annualincome
	 */
	public CrediblePersonalLoanPage setAnnualIncome(WebDriver driver, String annualIncome){
		driver.findElement(ANNUAL_INCOME).sendKeys(annualIncome);
		return this;
	}
	/**
	 * Select Estimated Credit Score
	 * @param driver
	 * @param creditscore
	 */
	public CrediblePersonalLoanPage selectEstimatedCreditScore(WebDriver driver){
		//		Select dropdown= new Select (driver.findElement(ESTIMATED_CREDIT_SCORE));
		//		dropdown.selectByVisibleText(creditScore);
		WebElement creditScoreDropdown =driver.findElement(By.cssSelector(ESTIMATED_CREDIT_SCORE_ARROW));
		creditScoreDropdown.click();
		driver.findElement(FIRST_VALUE_FROM_DROPDOWN).click();
		return this;
	}
	/**
	 * Set Social Security number
	 * @param driver
	 * @param snn
	 */
	public CrediblePersonalLoanPage setSocialSecurityNumber(WebDriver driver, String snn){
		driver.findElement(SOCIAL_SECURITY_NUMBER).sendKeys(snn);
		return this;
	}
	/**
	 * Set Phone Number
	 * @param driver
	 * @param phonenumber
	 */
	public CrediblePersonalLoanPage setPhoneNumber(WebDriver driver, String phoneNumber){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("document.getElementById('"+PHONE_NUMBER+"').value="+ phoneNumber+"");
		return this;
	}
	/**
	 * Set Permanent Addres
	 * @param driver
	 * @param address
	 */ 
	public CrediblePersonalLoanPage setPermanentAddress(WebDriver driver, String address){

		//		JavascriptExecutor executor = (JavascriptExecutor)driver;
		//		executor.executeScript("document.getElementById('"+PERMANENT_ADDRESS+"').value='"+address+"'");
		WebElement element =driver.findElement(By.id(PERMANENT_ADDRESS));
		element.click();
		element.sendKeys(address);
		return this;
	}
	/**
	 * Click to Enter Address manually
	 * @param driver
	 * @return
	 */
	public CrediblePersonalLoanPage clickEnterAddressManually(WebDriver driver){
		driver.findElement(ENTER_ADDRESS_MANUALLY).click();
		return this;
	}
	/**
	 * Set Adress Street
	 * @param driver
	 * @param street
	 * @return
	 */
	public CrediblePersonalLoanPage setAddressStreet(WebDriver driver, String street){
		driver.findElement(ADDRESS_STREET).sendKeys(street);
		return this;
	}
	/**
	 * Set Address City
	 * @param driver
	 * @param city
	 * @return
	 */
	public CrediblePersonalLoanPage setAddressCity(WebDriver driver, String city){
		driver.findElement(ADDRESS_CITY).sendKeys(city);
		return this;
	}
	/**
	 * Select Address State
	 * @param driver
	 * @param state
	 * @return
	 */
	public CrediblePersonalLoanPage selectAddressState(WebDriver driver, String state){
		driver.findElement(ADDRESS_STATE).click();
		driver.findElement(By.cssSelector("#s2id_autogen4_search")).sendKeys(state);
		driver.findElement(FIRST_VALUE_FROM_DROPDOWN).click();
		return this;
	}
	/**
	 * Set Address Zipcode
	 * @param driver
	 * @param zip
	 * @return
	 */
	public CrediblePersonalLoanPage setAddressZipcode(WebDriver driver, String zip){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("document.getElementById('"+ADDRESS_ZIPCODE+"').value="+zip+"");
		return this;
	}
	/**
	 * Set Unit number
	 * @param driver
	 * @param unit
	 */
	public CrediblePersonalLoanPage setUnitNumber(WebDriver driver, String unit){
		WebElement unitnum = driver.findElement(UNIT_NUMBER);
		unitnum.sendKeys(unit);
		return this;
	}
	/**
	 * Select Housing status
	 * @param driver
	 * @param housingStatus
	 */
	public CrediblePersonalLoanPage selectHousingStatus(WebDriver driver){
		//		Select dropdown= new Select (driver.findElement(HOUSING_STATUS));
		//		dropdown.selectByVisibleText(housingStatus);
		WebElement housingDropdown = driver.findElement(By.cssSelector(HOUSING_STATUS_ARROW));
		housingDropdown.click();
		driver.findElement(FIRST_VALUE_FROM_DROPDOWN).click();
		return this;
	}
	/**
	 * Set Email Address
	 * @param driver
	 * @param emailAddress
	 */
	public CrediblePersonalLoanPage setEmailAddress(WebDriver driver, String emailAddress){
		driver.findElement(EMAIL_ADDRESS).sendKeys(emailAddress);
		return this;
	}
	/**
	 * Set Password
	 * @param driver
	 * @param password
	 */
	public CrediblePersonalLoanPage setPassword(WebDriver driver, String password){
		driver.findElement(PASSWORD).sendKeys(password);
		return this;
	}
	/**
	 * Click Check Box
	 * @param driver
	 */
	public CrediblePersonalLoanPage clickCheckBox(WebDriver driver){
		driver.findElement(CHECK_BOX).click();
		return this;
	}
	/**
	 * Click Find My Rates
	 * @param driver
	 */
	public void clickFindMyRates(WebDriver driver){
		driver.findElement(FIND_MY_RATES).click();
	}
	
	

}
