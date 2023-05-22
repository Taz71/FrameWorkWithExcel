package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ListCustomerPage extends BasePage {

	WebDriver driver;

	public ListCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

//WebElements:

		//tbody/tr[1]/td[3]
		//tbody/tr[2]/td[3]
		//tbody/tr[3]/td[3]
		//tbody/tr[4]/td[3]
		//tbody/tr[5]/td[3]
		//tbody/tr[1]/td[7]/a[2]

	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULLNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[7]/a[2]")
	WebElement DELETE_BUTTONElement;

	String Before_xpath = "//tbody/tr[";
	String after_xpath = "]/td[3]";
	String after_xpath_delate = "]/td[7]/a[2]";

//	Methods
	String insertedName;

	public void insertFullName(String fullName) {
		insertedName = fullName + generateRandomNumber(999);
		FULLNAME_ELEMENT.sendKeys(insertedName);
	}

	public void vlidateInsertedName() {

		for (int i = 1; i <= 5; i++) {
			String name = driver.findElement(By.xpath(Before_xpath + i + after_xpath)).getText();

		}

	}
//public void vlidateInsertedNameAndDelate() {
//
//	for (int i = 1; i <= 5; i++) {
//		String name = driver.findElement(By.xpath(Before_xpath + i + after_xpath)).getText();
//		System.out.println(name);
//		if(name.contains(insertedName)) {
//			driver.findElement(By.xpath(Before_xpath + i +after_xpath_delate).
//		}
//	}
//	
//}

}