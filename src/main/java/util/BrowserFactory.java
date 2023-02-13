package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserFactory {
static WebDriver driver;
static String url;
static String browser;


public static void readConfig() {
	

		try {
			InputStream input = new FileInputStream("src\\main\\java\\config.properties");
			Properties prop = new Properties();
			prop.load(input);
			browser = prop.getProperty("browser");
			url = prop.getProperty("url");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
}


public static WebDriver initBrowser() {
	readConfig();
	
			//setting up Chrome Browser
	
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
			//Setting up FireFox Browser
	}else {
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.premiumparking.com/");
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	return driver;
	
	
}





}
