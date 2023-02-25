package pages;

import org.openqa.selenium.By;

public class PublishShareBus extends BaseClass{
	
	public By tripName = By.xpath("//div[contains(@class,'col-sm-12 col-md-6 my-4')]//input[contains(@class,'form-control rounded')]");
	
	public By category = By.xpath("//p[normalize-space()='Music']");
	
	
	public By previewAndPublish = By.xpath("//span[contains(@class,'fw-600 ms-2')]//i[contains(@class,'fi fi-arrow-right-short')]");
	//public By previewAndPublish = By.xpath("//button[contains(@class,'rounded-pill d-flex align-items-center fw-bold ms-auto')]");
	
	public By publishButton = By.xpath("//span[normalize-space()='Publish']");

}
