package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
WebDriver driver;

public DashboardPage(WebDriver driver) {
	this.driver = driver;
	
}
	//storing the dashboard's web elements
	
	@FindBy(how = How.LINK_TEXT, using="Validations") 
	WebElement Validations;
	
	@FindBy(how = How.LINK_TEXT, using="NEW VALIDATION") 
	WebElement NewValidatons;
	
	@FindBy(how = How.ID, using="validation_form_license_plate") 
	WebElement PlateNumber;

	@FindBy(how = How.ID, using="validation_form_end_time") 
	WebElement EndDate;

	@FindBy(how = How.LINK_TEXT, using="Validations") 
	WebElement Validatons;
	
	@FindBy(how = How.ID, using="validation_form_customer_name") 
	WebElement CustomerName;
	
	@FindBy(how = How.ID, using="validation_form_room_number") 
	WebElement Number;
	
	@FindBy(how = How.ID, using="validation_form_notes") 
	WebElement Notes;
	
	
	

}
