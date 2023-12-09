package pages.util_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages._pages_mngt.MainPageManager;
import pages.super_pages.MenusPage;

public class RegisterPage extends MenusPage {

	public RegisterPage(MainPageManager pages) {
		super(pages);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "register-button")
	 private WebElement registerButton;

	
	public RegisterPage ensurePageLoaded() {
		super.ensurePageLoaded();
		waitBig.until(ExpectedConditions.visibilityOf(registerButton));
		return this;
	}
	
	
	public RegisterPage setFirstName(String firstName) {
		log.info("Enter first name: " + firstName);
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		return this;
		}
	
	
	public RegisterPage setLastName(String lastName) {
		log.info("Enter first name: " + lastName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		return this;
		}
	
	
	public RegisterPage setMailAddres(String mailAddres) {
		log.info("Enter mail addres: " + mailAddres);
		driver.findElement(By.id("Email")).sendKeys(mailAddres);
		return this;
		}
	
	
	public RegisterPage setPassword(String password) {
		log.info("Enter password: " + password);
		driver.findElement(By.id("Password")).sendKeys(password);
		return this;
		}
	
	public RegisterPage setConfirmationPassword(String password) {
		log.info("Confirm password: " + password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		return this;
		}
		
		
	public RegisterSucceededPage clickRegisterButton() {
			
		log.info("Click Register Button");
		driver.findElement(By.name("register-button")).click();
		return pages.registerSucceededPage.ensurePageLoaded();

		}
}
