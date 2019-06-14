package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EshopHomePage extends PageBaseClass {

	public EshopHomePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="search-q")
	WebElement searchBox;
	
public void sendText(String text) {
	
}
}
