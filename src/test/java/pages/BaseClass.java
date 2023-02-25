package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static utilities.DriverSetup.getDriver;

public class BaseClass{
	
	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();
	}
	
	public String getElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public void writeTextOnElement(By locator, String text) {
		getElement(locator).sendKeys(text);
	}

}
