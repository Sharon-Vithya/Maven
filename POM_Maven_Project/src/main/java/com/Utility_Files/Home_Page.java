package com.Utility_Files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public WebDriver driver;
@FindBy(xpath="//input[@id='username']")
private WebElement username;
@FindBy(xpath="//input[@id='password']")
private WebElement password;
@FindBy(xpath="//input[@value='Login']")
private WebElement login;
public Home_Page(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}










}
