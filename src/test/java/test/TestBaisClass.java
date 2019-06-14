package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBaisClass {
public static WebDriver driver;
///// should read it from excel sheet 
String url = "https://www.vodafone.com.eg/eshop/homePage/index.jsp";

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
		System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	//Check if parameter passed as 'chrome'
	else if(browser.equalsIgnoreCase("chrome")){
		//set path to chromedriver.exe
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		//create chrome instance
		driver = new ChromeDriver();
	}
	//Check if parameter passed as 'IE'
			else if(browser.equalsIgnoreCase("ie")){
				//set path to IE.exe
				System.setProperty("webdriver.ie.driver","src/test/resources/drivers/IEDriverServer.exe");
				//create IE instance
				driver = new InternetExplorerDriver();
			}
	else{
		//If no browser passed throw exception
		throw new Exception("Browser is not correct");
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to(url);
}

@AfterSuite
public void tearDown() {
	driver.quit();
}
}

