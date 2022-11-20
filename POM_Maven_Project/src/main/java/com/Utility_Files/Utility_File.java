package com.Utility_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_File {
	public static String value;
public static WebDriver driver;
public static WebDriver browser_Config(String browser) {
if (browser.equalsIgnoreCase("chrome")) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\chrome driver\\chromedriver.exe");	
driver = new ChromeDriver();
}
return driver;		
}

public static void click_On_Element(WebElement element) {
element.click();
}	
public static void send_Keys(WebElement element, String value) {
element.sendKeys(value);
}	
public static void clear_Element(WebElement element) {
element.clear();
}	
public static boolean element_Enabled(WebElement element) {
boolean enabled = element.isEnabled();
return enabled; 
}	
public static String get_Text(WebElement element) {
String text = element.getText();
return text;
}	
public static boolean element_Dispalyed(WebElement element) {
boolean displayed = element.isDisplayed();
return displayed;
}	
public static boolean element_Selected(WebElement element) {
boolean selected = element.isSelected();
return selected;
}
public static String get_Attribute(WebElement element , String value) {
String attribute = element.getAttribute(value);
return attribute;
}
public static String get_Tagname(WebElement element) {
String tagName = element.getTagName();
return tagName;
}
public static void get_Url(String url) {
driver.get(url);
}	
public static void maximise(String max) {
if (max.equalsIgnoreCase("maximise")) {
driver.manage().window().maximize();	
}
}
public static void sleep(long millisec) throws InterruptedException {
Thread.sleep(millisec);
}	
public static void select_byIndex(WebElement element , int index ) {
Select s = new Select(element);
s.selectByIndex(index);
}

public static void select_byValue(WebElement element, String value) {
Select s1 = new Select(element);
s1.selectByValue(value);
}	
public static void select_byVisible(WebElement element, String value) {
Select s2 = new Select(element);
s2.selectByVisibleText(value);
}
public static void move_toElement(WebElement element) {
Actions a = new Actions(driver);
a.moveToElement(element).build().perform();
}
public static void scroll_Down(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView", element);
	js.executeScript("arguments[0].click()", element);

}
public static void screenshot() throws IOException {
TakesScreenshot ss = (TakesScreenshot) driver;
File ss1 = ss.getScreenshotAs(OutputType.FILE);
File ss2 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\screenshot\\zara.png");
FileUtils.copyFile(ss1, ss2);	
}
	
public static String particular_Cell_Data(String path, int sheet , int row , int cell) throws IOException {
	File f = new File(path);
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet s = wb.getSheetAt(sheet);
	Row r = s.getRow(row);
	Cell c = r.getCell(cell);
	CellType type = c.getCellType();
	if (type.equals(CellType.STRING)) {
		 value = c.getStringCellValue();
		
	}
	else if (type.equals(CellType.NUMERIC)) {
		double d = c.getNumericCellValue();
		int a = (int) d;
		 value = String.valueOf(a);
		
	}
	wb.close();
	return value;

}	
	
	
	
	
	
	
	
	
	
	
	
	
}

