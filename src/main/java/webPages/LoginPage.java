package webPages;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class LoginPage {
WebDriver driver;

public LoginPage(WebDriver driver) {
	this.driver = driver;
}

//storing the login's web elements



@FindBy(how = How.XPATH, using="//button[@class='styled__StyledButton-sc-1ejttgx-0 jTYses']") 
WebElement SignInButton;

@FindBy(how = How.XPATH, using="//input[@name='login']") 
WebElement UserName;

@FindBy(how = How.XPATH, using="//input[@name='password']") 
WebElement Password;




public void clickSignIng() {
	Actions action = new Actions(driver);
	action.moveToElement(SignInButton).click().build().perform();

}

public void enterUserName() {
	
	UserName.sendKeys("jorge@pp.com");
	


}

public void enterPassword() {
	Password.sendKeys("valet1");
	
	
}


	
}

