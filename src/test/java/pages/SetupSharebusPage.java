package pages;

import org.openqa.selenium.By;

public class SetupSharebusPage extends BaseClass{
	
	// Inside MainPage
	
	public By departurePoint = By.xpath("//input[@id='startPoint']");
	
	public By destinationPoint = By.xpath("//input[@id='destination']");
	
	public By departureDate = By.xpath("//input[@placeholder='Departure Date']");
	
	public By departureTime = By.xpath("//div[@class='row my-3']//span[@class='p-calendar p-component p-inputwrapper p-calendar-timeonly']//input[@placeholder='Time']");
	
	public By destinationDate = By.xpath("//input[@placeholder='Return Date']");
	
	public By destinationTime = By.xpath("//div[@class='row my-4']//input[@placeholder='Time']");
	
	public By clicktwentyMarch2023 = By.xpath("//span[text()='20']");
	
	public By clickThirtyOneMarch2023 = By.xpath("//span[text()='31']");
	
	public By clickSubmitForContinue = By.xpath("//button[contains(@type,'submit')]");
	
	public By inputSwitchOff = By.xpath("//label[@for='returnTripswitch']");
	
	
	// Inside Page 2
	
    public By clickYes = By.xpath("//button[@class='btn yes-no-btn custom-border-radius bg-white border-light']");
	
	public By selectField = By.xpath("//i[@class='fi fi-chevron-down']");
	
	public By clickNTNUI = By.xpath("//li[normalize-space()='NTNUI']");
	
	public By clickContinue = By.xpath("//button[contains(@type,'submit')]");
	
	
	// Inside Page 3
	
    public By noButtonClickForNeedTicketsForYourSelf = By.xpath("//button[@class='btn gray-white-bg ship-gray btn-discount-size rounded-end']");
	
	public By noButtonClickForActivateTicketsForDiscounts = By.xpath("//div[contains(@class,'discount-ticket-wrapper p-4 light-gray-bg mb-2 mt-2')]//button[contains(@class,'btn gray-white-bg ship-gray btn-discount-size rounded-end')][normalize-space()='No']");
	
	public By createSharebusButton = By.xpath("//span[normalize-space()='Create Sharebus']");
			

}
