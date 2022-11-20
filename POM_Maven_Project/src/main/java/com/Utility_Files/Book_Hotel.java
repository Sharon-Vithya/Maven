package com.Utility_Files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public WebDriver driver;
@FindBy(xpath="//input[@id='first_name']")
private WebElement first_name;
@FindBy(xpath="//input[@id='last_name']")
private WebElement last_name;
@FindBy(xpath="//textarea[@id='address']")
private WebElement address;
@FindBy(xpath="//input[@id='cc_num']")
private WebElement credit_num;
public Book_Hotel(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public WebDriver getDriver() {
	return driver;
}
public WebElement getFirst_name() {
	return first_name;
}
public WebElement getLast_name() {
	return last_name;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCredit_num() {
	return credit_num;
}
public WebElement getCredit_type() {
	return credit_type;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}
public WebElement getCvv_num() {
	return cvv_num;
}
public WebElement getBook_now() {
	return book_now;
}
@FindBy(xpath="//select[@id='cc_type']")
private WebElement credit_type;
@FindBy(xpath="//select[@id='cc_exp_month']")
private WebElement month;
@FindBy(xpath="//select[@id='cc_exp_year']")
private WebElement year;
@FindBy(xpath="//input[@id='cc_cvv']")
private WebElement cvv_num;
@FindBy(xpath="//input[@id='book_now']")
private WebElement book_now;
	
	
	
	
	
	
	
}
