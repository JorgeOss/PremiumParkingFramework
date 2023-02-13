package testPages;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.BrowserFactory;
import webPages.LoginPage;

public class LoginTest {
WebDriver driver;
LoginPage loginPage;

@Before
public void setUp() {
	driver = BrowserFactory.initBrowser();
	loginPage = PageFactory.initElements(driver, LoginPage.class);
}

@Test
public void SignIn() throws InterruptedException {
	loginPage.clickSignIng();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='login']")).sendKeys("jorge@pp.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='login']")).submit();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("valet1");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='password']")).submit();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Validations")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("NEW VALIDATION")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("validation_form_license_plate")).sendKeys("714BOA");
	Thread.sleep(1000);
	driver.findElement(By.id("validation_form_end_time")).click();
	//new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("xdsoft_calendar")));
	Thread.sleep(1000);
	//driver.findElement(By.className("xdsoft_date xdsoft_day_of_week5 xdsoft_date")).click();
	
	driver.findElement(By.id("validation_form_customer_name")).sendKeys("Ashley Morgan");
	Thread.sleep(1000);
	driver.findElement(By.id("validation_form_room_number")).sendKeys("808");
	Thread.sleep(1000);
	driver.findElement(By.id("validation_form_notes")).sendKeys("The customer says he is going to park for 2 hours, but he might be extend the validation.");
	Thread.sleep(4000);
	
	driver.findElement(By.className("dropdown-link")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@href='/profile/signout']")).click();
	
	
	
	
}

}
