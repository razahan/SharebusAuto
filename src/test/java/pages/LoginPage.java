package pages;

import org.openqa.selenium.By;

public class LoginPage extends BaseClass {
	
	public By email_field = By.xpath("//input[@id='email']");
	
	public By password_field = By.xpath("//input[@id='password']");
	
	public By clickSignin = By.xpath("//button[@type='submit']");
	
	public void doLogin(String userName, String password) {
		writeTextOnElement(email_field, userName);
		writeTextOnElement(password_field, password);
		clickOnElement(clickSignin);
	}

}
