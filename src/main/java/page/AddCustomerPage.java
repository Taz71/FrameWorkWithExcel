package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

//	WebElements

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add Contact')]")
	WebElement ADD_CONTACT_PAGE;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULLNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_CODE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement country_dropdown_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement SAVE_BUTTON;

//	Intractable Method

	public void validateAddContactPage() {
		Assert.assertTrue(ADD_CONTACT_PAGE.isDisplayed(), "ADD_CONTACT_PAGE is not found");
	}

	public void insertFullName(String fullName) {
		FULLNAME_ELEMENT.sendKeys(fullName + generateRandomNumber(999));
	}

	public void selectCompany(String company) {
		selectFromDropDown(COMPANY_DROPDOWN_ELEMENT, company);
	}

	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNumber(999) + email);
	}

	public void insertPhoneNum(String phone) {
		PHONE_NUMBER_ELEMENT.sendKeys(phone + generateRandomNumber(9999));
	}

	public void insertAddress(String address) {
		ADDRESS_ELEMENT.sendKeys(address);
	}

	public void insertCity(String city) {
		CITY_NAME_ELEMENT.sendKeys(city);
	}

	public void insertState(String state) {
		STATE_NAME_ELEMENT.sendKeys(state);
	}

	public void insertZipCode(String zip) {
		ZIP_CODE_ELEMENT.sendKeys(zip);
	}

	public void insertCountry(String country) {
		country_dropdown_ELEMENT.sendKeys(country);
	}

	public void insertSave() {
		SAVE_BUTTON.click();
	}
	

}
