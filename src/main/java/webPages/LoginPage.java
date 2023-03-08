package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

//storing the login's Web Elements

	@FindBy(how = How.XPATH, using = "//button[@class='styled__StyledButton-sc-1ejttgx-0 jTYses']")
	WebElement SignInButton;

	@FindBy(how = How.XPATH, using = "//input[@name='login']")
	WebElement UserName;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement Password;

//Encapsulating my Web Elements ready to be call them from loginTest
 
	public void clickSignIng() {
		SignInButton.click();
	}

	public void enterUserName() throws InterruptedException {
		UserName.sendKeys("jorge@pp.com");
		UserName.submit();
	}

	public void enterPassword() throws InterruptedException {
		Password.sendKeys("valet");
		Password.submit();
	}

}
