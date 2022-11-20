package com.Utility_Files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public WebDriver  driver;
@FindBy(xpath = "//select[@id='location']")
private WebElement location;
@FindBy(xpath="//select[@name='hotels']")
private WebElement hotel;
@FindBy(xpath="//select[@id='room_type']")
private WebElement room;
@FindBy(xpath="//select[@id='room_nos']")
private WebElement num;
@FindBy(xpath="//input[@name='datepick_in']")
private WebElement checkin_Date;
@FindBy(xpath="//input[@name='datepick_out']")
private WebElement checkout_Date;
@FindBy(xpath="//select[@id='adult_room']")
private WebElement adult_room;
@FindBy(xpath="//select[@id='child_room']")
private WebElement child_room;
@FindBy(xpath="//input[@id='Submit']")
private WebElement search;
public Search_Hotel(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public WebElement getLocation() {
	return location;
}
public WebElement getHotel() {
	return hotel;
}
public WebElement getRoom() {
	return room;
}
public WebElement getNum() {
	return num;
}
public WebElement getCheckin_Date() {
	return checkin_Date;
}
public WebElement getCheckout_Date() {
	return checkout_Date;
}
public WebElement getAdult_room() {
	return adult_room;
}
public WebElement getChild_room() {
	return child_room;
}
public WebElement getSearch() {
	return search;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
