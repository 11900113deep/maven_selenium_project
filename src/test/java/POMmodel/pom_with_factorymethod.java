package POMmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_with_factorymethod {

	public WebDriver driver;
	//constructor
	pom_with_factorymethod(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	//locators+identification
	@FindBy(xpath = "")
	WebElement image_logo;
	
	@FindBy(xpath = "")
	WebElement username;
	
	@FindBy(xpath = "")
	WebElement password;
	
	@FindBy(xpath = "")
	WebElement submit_btn;

	//action
	public void image_logo()
	{
		image_logo.isDisplayed();
	}
	public void username_method(String name) {
		username.sendKeys(name);;
	}
	public void password_method(String pswrd) {
		password.sendKeys(pswrd);
	}
	public void btn_method() {
		submit_btn.click();
	}
}
