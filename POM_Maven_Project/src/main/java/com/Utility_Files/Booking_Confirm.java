package com.Utility_Files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirm {
	public WebDriver driver;
@FindBy(xpath="//table[@class='content']/tbody/tr[2]/td/form/table/tbody/tr[19]/td/input[2]")
private WebElement my_iternitity;
public Booking_Confirm(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public WebDriver getDriver() {
	return driver;
}
public WebElement getMy_iternitity() {
	return my_iternitity;
}
}
