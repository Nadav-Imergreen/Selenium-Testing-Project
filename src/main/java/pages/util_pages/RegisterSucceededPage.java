package pages.util_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import pages._pages_mngt.MainPageManager;
import pages.super_pages.AnyPage;
import pages.super_pages.MenusPage;
import pages.util_pages.RegisterPage;

public class RegisterSucceededPage extends MenusPage{

	public RegisterSucceededPage(MainPageManager pages) {
		super(pages);

	}
	private static final String SUCCESS_MESSAGE = "Your registration completed";

	public RegisterSucceededPage ensurePageLoaded() {
			super.ensurePageLoaded();
			waitBig.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".result"))).getText();
			return this;
		}
	

	public HomePage clickContinue() {
		
		log.info("click continue");
		driver.findElement(By.className("register-continue-button")).click();
		
		return pages.homePage.ensurePageLoaded();
	}
	
	// Confirm registration completed successfully  
	public RegisterSucceededPage verifyRegestrationMessage() {
	
		log.info("Verify message: " + SUCCESS_MESSAGE);
		
		String actualTextRegistration =
		driver.findElement(By.cssSelector(".result")).getText();
		
		Assert.assertTrue(actualTextRegistration.equals(SUCCESS_MESSAGE),
		"Expected value: '" + SUCCESS_MESSAGE + "', but actual is '" +actualTextRegistration + "'");
		
		return this;
	}
}
