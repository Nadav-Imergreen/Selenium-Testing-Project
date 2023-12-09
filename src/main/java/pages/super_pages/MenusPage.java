package pages.super_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages._pages_mngt.MainPageManager;
import pages.util_pages.RegisterPage;

public class MenusPage extends AnyPage{

	public MenusPage(MainPageManager pages) {
		super(pages);

	}

	public MenusPage ensurePageLoaded() {
			super.ensurePageLoaded();
			waitBig.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body")));
			return this;
		}

	public RegisterPage clickRegisterLink() {
		
		log.info("Click Register link");
		driver.findElement(By.linkText("Register")).click();
		
		return pages.registerPage.ensurePageLoaded();
	}
}
