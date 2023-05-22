package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilePage {

	WebDriver driver;

	public ProfilePage(WebDriver driver) {
		this.driver = driver;
	}
//	WebElement

	@FindBy(how = How.XPATH, using = "//a[@id='summary']")
	WebElement SUMMARY_ON_PROFILE_PAGE;

//	Intractable Method

	public void validateProfilePage() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(SUMMARY_ON_PROFILE_PAGE));
		Assert.assertTrue(SUMMARY_ON_PROFILE_PAGE.isDisplayed(), "profile page not found!!");
	}


	
	

}
