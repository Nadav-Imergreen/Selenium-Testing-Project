package pages._pages_mngt;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import applogic.ApplicationManager1;
import pages._pages_mngt.page_factory.DisplayedElementLocatorFactory;
import pages.super_pages.MenusPage;
import pages.super_pages.Page;
import pages.util_pages.HomePage;
import pages.util_pages.RegisterPage;
import pages.util_pages.RegisterSucceededPage;
import util.ParamsUtils;
import util.SelUtils;

public class MainPageManager {

	private WebDriver driver;
	public SelUtils su;
	private Logger log;
	private ParamsUtils sessionParams;

	// public LoginPage loginPage;
	
public MenusPage menusPage;
public RegisterPage registerPage;
public RegisterSucceededPage registerSucceededPage;
public HomePage homePage;



	public MainPageManager(ApplicationManager1 app) {
		driver = app.getDriver();
		su = app.su;
		log = app.getLogger();
		sessionParams = app.getParamsUtils();

		// loginPage = initElements(new LoginPage(this));
		
		menusPage = initElements(new MenusPage(this));
		registerPage = initElements(new RegisterPage(this));
		registerSucceededPage = initElements(new RegisterSucceededPage(this));
		homePage = initElements(new HomePage(this));
	}

	public <T extends Page> T initElements(T page) {
		PageFactory.initElements(new DisplayedElementLocatorFactory(driver, 10), page);
		return page;
	}

	public WebDriver getWebDriver() {
		return driver;
	}

	public Logger gerLogger() {
		return log;
	}

	public ParamsUtils getSessionParams() {
		return sessionParams;
	}
}
