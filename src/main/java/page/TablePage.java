package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class TablePage {
	WebDriver driver;

	public TablePage(WebDriver driver) {
		this.driver = driver;
	}

//	WebElements  
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/a[2]")
	WebElement TABLE_ELEMENT_PAGE;
	
//	Intractable method
	
	public void validateTablePage() {
		Assert.assertTrue(TABLE_ELEMENT_PAGE.isDisplayed(), "table page not found");
	}
	
	

}
