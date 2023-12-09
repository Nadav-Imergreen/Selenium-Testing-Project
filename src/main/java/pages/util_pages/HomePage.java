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

public class HomePage extends MenusPage{

	public HomePage(MainPageManager pages) {
		super(pages);

	}
	private static final String CONTINUE_MESSAGE = "Welcome to our store";

	public HomePage ensurePageLoaded() {
			super.ensurePageLoaded();
			waitBig.until(ExpectedConditions.presenceOfElementLocated(By.className("topic-block-title"))).getText();
			return this;
			}
	
	// Confirm Return to HomePage 
	public HomePage verifyHomePageWellcomeMessage() {
		log.info("Verify message: " + CONTINUE_MESSAGE);
		
		String actualHomepageText =driver.findElement(By.className("topic-block-title")).getText();
		Assert.assertTrue(actualHomepageText.equals(CONTINUE_MESSAGE),
		"Expected value: '" + CONTINUE_MESSAGE + "', but actual is '" +actualHomepageText + "'");
		
		return this;
	}
}
