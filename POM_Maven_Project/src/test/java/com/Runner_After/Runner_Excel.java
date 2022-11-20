
package com.Runner_After;

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

import com.Page_Object_Manager.Page_Object_Manager;
import com.Utility_Files.Book_Hotel;
import com.Utility_Files.Booking_Confirm;
import com.Utility_Files.Home_Page;
import com.Utility_Files.Search_Hotel;
import com.Utility_Files.Select_Hotel;
import com.Utility_Files.Utility_File;

public class Runner_Excel extends Utility_File {
	public static WebDriver driver = browser_Config("chrome");
	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	public static void main(String[] args) throws InterruptedException, IOException {
		get_Url("https://adactinhotelapp.com/");
		maximise("maximise");
		String username = particular_Cell_Data("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\Adactin Test cases.xlsx", 0, 2, 5);
		send_Keys(manager.getHp().getUsername(), username);
		String password = particular_Cell_Data("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\Adactin Test cases.xlsx", 0, 3, 5);
		send_Keys(manager.getHp().getPassword(), password);
		click_On_Element(manager.getHp().getLogin());
		String location = particular_Cell_Data("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\Adactin Test cases.xlsx", 0, 4, 5);

		select_byValue(manager.getSh().getLocation(), location);
		String hotel = particular_Cell_Data("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\Adactin Test cases.xlsx", 0, 5, 5);
		select_byVisible(manager.getSh().getHotel(), hotel);
		String room = particular_Cell_Data("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\Adactin Test cases.xlsx", 0, 6, 5);
		select_byValue(manager.getSh().getRoom(), room);
		String num = particular_Cell_Data("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\Adactin Test cases.xlsx", 0, 7, 5);
		select_byVisible(manager.getSh().getNum(), num);
		clear_Element(manager.getSh().getCheckin_Date());
		String checkin_date = particular_Cell_Data("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\Adactin Test cases.xlsx", 0, 8, 5);
		send_Keys(manager.getSh().getCheckin_Date(), checkin_date);
		clear_Element(manager.getSh().getCheckout_Date());
		String checkout_date = particular_Cell_Data("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\Adactin Test cases.xlsx", 0, 9, 5);
		send_Keys(manager.getSh().getCheckout_Date(), checkout_date);
		select_byIndex(manager.getSh().getAdult_room(), 1);
		select_byIndex(manager.getSh().getChild_room(), 1);
		click_On_Element(manager.getSh().getSearch());
		click_On_Element(manager.getSo().getSelect_btn());
		click_On_Element(manager.getSo().getContinue_btn());
		String first_name = particular_Cell_Data("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\Adactin Test cases.xlsx", 0, 10, 5);
		send_Keys(manager.getBh().getFirst_name(), first_name);
		String last_name = particular_Cell_Data("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\Adactin Test cases.xlsx", 0, 11, 5);
		send_Keys(manager.getBh().getLast_name(), last_name);
		String address = particular_Cell_Data("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\Adactin Test cases.xlsx", 0, 12, 5);
		send_Keys(manager.getBh().getAddress(), address);
		String credit_card_num = particular_Cell_Data("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\Adactin Test cases.xlsx", 0, 13, 5);
		send_Keys(manager.getBh().getCredit_num(), credit_card_num);
		String credit_card_type = particular_Cell_Data("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\Adactin Test cases.xlsx", 0, 14, 5);
		select_byValue(manager.getBh().getCredit_type(), credit_card_type);
		String month = particular_Cell_Data("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\Adactin Test cases.xlsx", 0, 15, 5);
		select_byValue(manager.getBh().getMonth(), month);
		String year = particular_Cell_Data("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\Adactin Test cases.xlsx", 0, 16, 5);
		select_byValue(manager.getBh().getYear(), year);
		String cvv_num = particular_Cell_Data("C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\Adactin Test cases.xlsx", 0, 17, 5);
		send_Keys(manager.getBh().getCvv_num(), cvv_num);
		click_On_Element(manager.getBh().getBook_now());
		sleep(5000);
		scroll_Down(manager.getBc().getMy_iternitity());
		//screenshot();



	}
}

