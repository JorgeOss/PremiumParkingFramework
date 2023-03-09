package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;

	}
	// storing the dashboard's web elements

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Validations")
	WebElement Validations;

	@FindBy(how = How.LINK_TEXT, using = "NEW VALIDATION")
	WebElement NewValidatons;

	@FindBy(how = How.ID, using = "validation_form_license_plate")
	WebElement PlateNumber;

	@FindBy(how = How.ID, using = "validation_form_end_time")
	WebElement EndDate;

	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[9]")
	WebElement NextMonth;

	@FindBy(how = How.XPATH, using = "/html/body/div[5]/div[1]/div[2]/table/tbody/tr[4]/td[4]/div")
	WebElement PickADate;

	@FindBy(how = How.ID, using = "validation_form_customer_name")
	WebElement CustomerName;

	@FindBy(how = How.ID, using = "validation_form_room_number")
	WebElement Number;

	@FindBy(how = How.ID, using = "validation_form_notes")
	WebElement Notes;

	@FindBy(how = How.CLASS_NAME, using = "dropdown-link")
	WebElement clickSignOut;

	@FindBy(how = How.XPATH, using = "//a[@href='/profile/signout']")
	WebElement SignOut;

	// Encapsulating my WebElements ready to be call them from loginTest

	public void clickValidations() {
		Validations.click();
	}

	public void newValidation() {
		NewValidatons.click();
	}

	public void insertLpNumber() {
		PlateNumber.sendKeys("743FEA");
	}

//	public void pickADate() throws InterruptedException {
//		EndDate.click();
//		NextMonth.click();
//		PickADate.click();
//		Thread.sleep(1000);
//	}

	public void customerName() {
		CustomerName.sendKeys("Ashley Morgan");
	}

	public void custRoomNumber() {
		Number.sendKeys("1012");
	}

	public void additionalNotes() throws InterruptedException {
		Notes.sendKeys("The customer will stay for 7 hours and will let us know if decides to extend the license plate validation to overnight, any questions call to her room number 1012");
		Thread.sleep(3000);
	}

	public void clickProfile() {
		clickSignOut.click();
	}

	public void logOut() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(SignOut));
		SignOut.click();
	}
}
