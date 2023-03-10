package POMmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pom_modeldemo {

	public WebDriver driver;
	//constructor
	Pom_modeldemo()
	{
		this.driver = driver;
	}
	//locators
	By image_logo = By.xpath("//div[@class='orangehrm-login-branding']");
	By username = By.xpath("//input[@placeholder='Username']");
	By password = By.xpath("//input[@placeholder='Password']");
	By submit_btn = By.xpath("//button[@type='submit']");

	
	//action
	public void image_logo()
	{
		driver.findElement(image_logo).isDisplayed();
	}
	public void username_method(String name) {
		driver.findElement(username).sendKeys(name);;
	}
	public void password_method(String pswrd) {
		driver.findElement(password).sendKeys(pswrd);
	}
	public void btn_method() {
		driver.findElement(submit_btn).click();
	}
}
