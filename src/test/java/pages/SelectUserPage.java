package pages;

import org.openqa.selenium.By;

public class SelectUserPage extends BaseClass {
	
	public By selectUserButton = By.xpath("//span[@class='p-dropdown-trigger-icon pi pi-chevron-down']");
	
	public By selectShareLead = By.xpath("//li[@aria-label='sharelead']//div");
		
	public By continueButton = By.xpath("//span[normalize-space()='Continue']");

}
