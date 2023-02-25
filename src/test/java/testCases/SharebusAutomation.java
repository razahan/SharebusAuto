package testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MyBusesPage;
import pages.PublishPage;
import pages.PublishShareBus;
import pages.SelectUserPage;
import pages.SetupSharebusPage;
import pages.SharebusHomePage;
import pages.TripPage;
import utilities.DriverSetup;

public class SharebusAutomation extends DriverSetup {
	
	SharebusHomePage sharebusHomePage = new SharebusHomePage();
	LoginPage loginPage = new LoginPage();
	SelectUserPage selectUserPage = new SelectUserPage();
	MyBusesPage myBusesPage = new MyBusesPage();
	SetupSharebusPage setupSharebusPage = new SetupSharebusPage();
	PublishPage publishPage = new PublishPage();
	PublishShareBus publishShareBus = new PublishShareBus();
	TripPage tripPage = new TripPage();
	
	public String tripName = "Oracle";
	

@Test
public void automateSharebus() throws InterruptedException{
	
		getDriver().get(sharebusHomePage.Url);
		Thread.sleep(3000);
		sharebusHomePage.clickOnElement(sharebusHomePage.signin);
		loginPage.doLogin("brainstation23@yopmail.com", "Pass@1234");
		selectUserPage.clickOnElement(selectUserPage.selectUserButton);
		Thread.sleep(3000);
		selectUserPage.clickOnElement(selectUserPage.selectShareLead);
		Thread.sleep(3000);
		selectUserPage.clickOnElement(selectUserPage.continueButton);
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		// js.executeScript("window.scroll(0,800)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		// js.executeScript("arguments[0].scrollIntoView();",myBusesPage.setUpSharebusbtn);
		// js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		myBusesPage.clickOnElement(myBusesPage.reject);
		Thread.sleep(3000);
		myBusesPage.clickOnElement(myBusesPage.setUpSharebusbtn);
		Thread.sleep(3000);
		
		js.executeScript("window.scroll(0,-100)");
		Thread.sleep(2000);
		
		setupSharebusPage.clickOnElement(setupSharebusPage.departurePoint);
		setupSharebusPage.writeTextOnElement(setupSharebusPage.departurePoint, "Oslo,Norway");
		Thread.sleep(2000);
		Actions actions = new Actions(getDriver());
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		actions.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		
		js.executeScript("window.scroll(0,600)");
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		setupSharebusPage.clickOnElement(setupSharebusPage.destinationPoint);
		setupSharebusPage.writeTextOnElement(setupSharebusPage.destinationPoint, "Kolbotn, Norway");
		Thread.sleep(2000);
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		
		
		
		// Setup ShareBusPage
		
		setupSharebusPage.clickOnElement(setupSharebusPage.departureDate);
		Thread.sleep(2000);
		setupSharebusPage.clickOnElement(setupSharebusPage.clicktwentyMarch2023);
		Thread.sleep(2000);
		setupSharebusPage.clickOnElement(setupSharebusPage.departureTime);
		Thread.sleep(2000);
//		setupSharebusPage.clickOnElement(setupSharebusPage.destinationDate);
//		Thread.sleep(3000);
		
		setupSharebusPage.clickOnElement(setupSharebusPage.inputSwitchOff);
		Thread.sleep(3000);
		setupSharebusPage.clickOnElement(setupSharebusPage.clickSubmitForContinue);
		Thread.sleep(5000);
		
		Thread.sleep(2000);
		
		
		js.executeScript("window.scroll(0,-100)");
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		setupSharebusPage.clickOnElement(setupSharebusPage.clickYes);
		Thread.sleep(3000);
		js.executeScript("window.scroll(0,9000)");
		Thread.sleep(3000);
		setupSharebusPage.clickOnElement(setupSharebusPage.selectField);
		Thread.sleep(3000);
		setupSharebusPage.clickOnElement(setupSharebusPage.clickNTNUI);
		Thread.sleep(3000);
		setupSharebusPage.clickOnElement(setupSharebusPage.clickContinue);
		
		Thread.sleep(3000);
		
		//js.executeScript("window.scroll(0,800)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		Thread.sleep(3000);
		setupSharebusPage.clickOnElement(setupSharebusPage.noButtonClickForNeedTicketsForYourSelf);
		Thread.sleep(3000);
		setupSharebusPage.clickOnElement(setupSharebusPage.noButtonClickForActivateTicketsForDiscounts);
		Thread.sleep(3000);
		setupSharebusPage.clickOnElement(setupSharebusPage.createSharebusButton);
		Thread.sleep(3000);
		
		
		
		// Publish Page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		publishPage.clickOnElement(publishPage.createPublish);
		Thread.sleep(3000);
		
		//Publish Share Page
		publishShareBus.writeTextOnElement(publishShareBus.tripName, tripName);
		Thread.sleep(3000);
		publishShareBus.clickOnElement(publishShareBus.category);
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		publishShareBus.clickOnElement(publishShareBus.previewAndPublish);
		Thread.sleep(3000);
		publishShareBus.clickOnElement(publishShareBus.publishButton);
		Thread.sleep(3000);
		
		tripPage.clickOnElement(tripPage.myBuses);
		Thread.sleep(3000);
		
		String myTripName = myBusesPage.getElementText(myBusesPage.myTripName);
		Thread.sleep(3000);
		assertEquals(myTripName, tripName);
		
	}
}
