package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {

	WebDriver driver;
	
	ExcelReader exlRead = new ExcelReader("TestData\\2023-02-19--TF_TestData.xlsx");

	String userName = exlRead.getCellData("LoginInfo", "UserName", 2); 
	String password = exlRead.getCellData("LoginInfo","Password" ,2);

	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.enterUserName(userName);
		loginPage.insertPassword(password);
		loginPage.ClickOnSigninButton();
		
		DashBoardPage dashBoard = PageFactory.initElements(driver, DashBoardPage.class);
		dashBoard.validateDashboardPage();
		
		BrowserFactory.tearDown();

	}

}
