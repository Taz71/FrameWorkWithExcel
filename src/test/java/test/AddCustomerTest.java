package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.AddCustomerPage;
import page.DashBoardPage;
import page.ListCustomerPage;
import page.LoginPage;
import page.ProfilePage;
import page.TablePage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest{

	WebDriver driver;

	ExcelReader exlRead = new ExcelReader("TestData\\2023-02-19--TF_TestData.xlsx");

	String userName = exlRead.getCellData("LoginInfo", "UserName", 2);
	String password = exlRead.getCellData("LoginInfo", "Password", 2);
	String fullName = exlRead.getCellData("AddContactInfo", "Password", 2);
    String company = exlRead.getCellData("AddContactInfo", "CompanyName", 2);
	String email = exlRead.getCellData("AddContactInfo", "Email", 2);
	String phone = exlRead.getCellData("AddContactInfo", "Phone", 2);
	String address = exlRead.getCellData("AddContactInfo", "Address", 2);
	String city = exlRead.getCellData("AddContactInfo", "City", 2);
	String country = exlRead.getCellData("AddContactInfo", "Country", 2);
	String state = exlRead.getCellData("AddContactInfo", "State", 2);
	String zip = exlRead.getCellData("AddContactInfo", "Zip", 2);

	@Test
	public void userShouldBeAbleToAddCustomer() {

		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(userName);
		loginPage.insertPassword(password);
		loginPage.ClickOnSigninButton();

		DashBoardPage dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		dashBoardPage.validateDashboardPage();
//		dashBoardPage.clickSideMenu();                                                    //extra
		dashBoardPage.clickCustomerMenuElement();
		dashBoardPage.clickAddCustomerMenuElement();

		AddCustomerPage addCustomer = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomer.validateAddContactPage();
		addCustomer.insertFullName(fullName);
		addCustomer.selectCompany(company);
		addCustomer.insertEmail(email);
		addCustomer.insertPhoneNum(phone);
		addCustomer.insertAddress(address);
		addCustomer.insertCity(city);
		addCustomer.insertState(state);
		addCustomer.insertZipCode(zip);
		addCustomer.insertCountry(country);
		addCustomer.insertSave();
		
		ProfilePage profilePage=PageFactory.initElements(driver, ProfilePage.class);
		profilePage.validateProfilePage();
		
		dashBoardPage.clickListCustomerMenuElement();
		
		TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
		tablePage.validateTablePage();
	    
//		by ProjectName Element
		ListCustomerPage entryTable = PageFactory.initElements(driver, ListCustomerPage.class);
		entryTable.vlidateInsertedName();
	
	}

}
