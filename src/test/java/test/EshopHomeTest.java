package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.EshopHomePage;
import pages.ResultsPage;

public class EshopHomeTest extends TestBaisClass {
EshopHomePage homeObject;
ResultsPage resultObject;
/// should read from excel and initialize search keyword variable
String searchKeyword;
/// should read from excel and initialize expected url
String expectedUrl;
////// should read from excel and initialize search results 
String searchres;
@Test(priority=1)
public void userSearch() {
	homeObject = new EshopHomePage(driver);
	homeObject.searchQuery(searchKeyword);
	resultObject = new ResultsPage(driver);
	String url= resultObject.checkUrl();
	assertEquals(url, expectedUrl);
}

@Test(priority=2)
public void Queryresult() {
	resultObject.searchResults(searchres);
}

}
