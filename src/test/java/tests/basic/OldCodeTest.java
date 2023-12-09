package tests.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import tests.supers.TestBase;
import util.GenUtils;

public class OldCodeTest extends TestBase {

	@Test
	public void test() {
		try {

			WebDriver driver = app.getDriver();
			driver.get("https://demo.nopcommerce.com/");

			log.info("Click Register link");
			driver.findElement(By.linkText("Register")).click();

			log.info("Enter first name");
			driver.findElement(By.id("FirstName")).sendKeys("Moshe");
			
			log.info("Enter last name");
			driver.findElement(By.id("LastName")).sendKeys("zuchmir");

			log.info("Enter mail addres");
			driver.findElement(By.id("Email")).sendKeys("replaseAfterOneUse@gmail.com");
			
			log.info("Enter password");
			driver.findElement(By.id("Password")).sendKeys("123456");
			
			log.info("Confirm password");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
			
			log.info("Click Register");
			driver.findElement(By.name("register-button")).click();
			
			// Confirm registration completed successfully  
			final String SUCCESS_MESSAGE = "Your registration completed";
			log.info("Verify message: " + SUCCESS_MESSAGE);
			
			String actualTextRegistration =
			driver.findElement(By.cssSelector(".result")).getText();
			
			Assert.assertTrue(actualTextRegistration.equals(SUCCESS_MESSAGE),
			"Expected value: '" + SUCCESS_MESSAGE + "', but actual is '" +
			actualTextRegistration + "'");
			
			
			log.info("Click Continue");
			driver.findElement(By.className("register-continue-button")).click();
			
			// Confirm Return to HomePage  
			final String CONTINUE_MESSAGE = "Welcome to our store";
			log.info("Verify message: " + CONTINUE_MESSAGE);
			
			String actualHomepageText =
			driver.findElement(By.className("topic-block-title")).getText();
			
			Assert.assertTrue(actualHomepageText.equals(CONTINUE_MESSAGE),
			"Expected value: '" + CONTINUE_MESSAGE + "', but actual is '" +
					actualHomepageText + "'");
			
			
		
			GenUtils.sleepMillis(2000);

			endTestSuccess();
		} catch (Throwable t) {
			onTestFailure(t);
		}
	}
}
