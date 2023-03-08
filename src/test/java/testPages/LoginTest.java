package testPages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import util.BrowserFactory;
import webPages.DashboardPage;
import webPages.LoginPage;

public class LoginTest {
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;

	@Before
	public void setUp() {
		driver = BrowserFactory.initBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	}

	@Test
	public void SignIn() throws InterruptedException {
		loginPage.clickSignIng();
		loginPage.enterUserName();
		loginPage.enterPassword();
		dashboardPage.clickValidations();
		dashboardPage.newValidation();
		dashboardPage.insertLpNumber();
		dashboardPage.pickADate();
		dashboardPage.customerName();
		dashboardPage.custRoomNumber();
		dashboardPage.additionalNotes();
		dashboardPage.clickProfile();
		dashboardPage.logOut();
		

	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	
	}
}
