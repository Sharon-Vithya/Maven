
package com.Runner_Class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Utility_Files.Book_Hotel;
import com.Utility_Files.Booking_Confirm;
import com.Utility_Files.Home_Page;
import com.Utility_Files.Search_Hotel;
import com.Utility_Files.Select_Hotel;
import com.Utility_Files.Utility_File;

public class Runner_Pages extends Utility_File {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		driver = browser_Config("chrome");
		get_Url("https://adactinhotelapp.com/");
		maximise("maximise");
		Home_Page hp = new Home_Page(driver);
		send_Keys(hp.getUsername(), "Sharonvithya");
		send_Keys(hp.getPassword(), "sharon@123");
		click_On_Element(hp.getLogin());

		Search_Hotel sh = new Search_Hotel(driver);
		select_byValue(sh.getLocation(), "London");
		select_byVisible(sh.getHotel(), "Hotel Sunshine");
		select_byValue(sh.getRoom(), "Deluxe");
		select_byVisible(sh.getNum(), "4 - Four");
		clear_Element(sh.getCheckin_Date());
		send_Keys(sh.getCheckin_Date(), "26/10/2022");
		clear_Element(sh.getCheckout_Date());
		send_Keys(sh.getCheckout_Date(), "30/10/2022");
		select_byIndex(sh.getAdult_room(), 1);
		select_byIndex(sh.getChild_room(), 1);
		click_On_Element(sh.getSearch());
		Select_Hotel so = new Select_Hotel(driver);
		click_On_Element(so.getSelect_btn());
		click_On_Element(so.getContinue_btn());
		Book_Hotel bh = new Book_Hotel(driver);
		send_Keys(bh.getFirst_name(), "Sharon");
		send_Keys(bh.getLast_name(), "Vithya");
		send_Keys(bh.getAddress(), "11/169,OOTY-643215");
		send_Keys(bh.getCredit_num(), "1234567890987654");
		select_byValue(bh.getCredit_type(), "VISA");
		select_byValue(bh.getMonth(), "12");
		select_byValue(bh.getYear(), "2022");
		send_Keys(bh.getCvv_num(), "655");
		click_On_Element(bh.getBook_now());
		sleep(5000);
		Booking_Confirm bc = new Booking_Confirm(driver);
		scroll_Down(bc.getMy_iternitity());
		//screenshot();



	}
}
