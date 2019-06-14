package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBaisClass {
public static WebDriver driver;

/**
 * This function will execute before each Test tag in testng.xml
 * @param browser
 * @throws Exception
 */
@BeforeTest
@Parameters("browser")
public void setup(String browser) throws Exception{
	//Check if parameter passed from TestNG is 'firefox'
	if(browser.equalsIgnoreCase("firefox")){
	//create firefox instance
		System.setProperty("webdriver.firefox.marionette", ".\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	//Check if parameter passed as 'chrome'
	else if(browser.equalsIgnoreCase("chrome")){
		//set path to chromedriver.exe
		System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
		//create chrome instance
		driver = new ChromeDriver();
	}
	//Check if parameter passed as 'Edge'
			else if(browser.equalsIgnoreCase("ie")){
				//set path to Edge.exe
				System.setProperty("webdriver.ie.driver",".\\IEDriverServer.exe");
				//create Edge instance
				driver = new InternetExplorerDriver();
			}
	else{
		//If no browser passed throw exception
		throw new Exception("Browser is not correct");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

}

