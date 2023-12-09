package tests.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.supers.TestBase;
import util.GenUtils;


public class PageObjectCode extends TestBase {

	@Test
	public void test() {
		try {
			
			WebDriver driver = app.getDriver();
			driver.get("https://demo.nopcommerce.com/");
			
			app.pages().menusPage.clickRegisterLink().setFirstName("Moshe")
			.setLastName("Zucmir").setMailAddres("ReplaseAfter1Use@gmail.com").
			setPassword("123456").setConfirmationPassword("123456").clickRegisterButton().
			verifyRegestrationMessage().clickContinue().verifyHomePageWellcomeMessage();
			
			
			
			endTestSuccess();
		} catch (Throwable t) {
			onTestFailure(t);
		}
	}
}

