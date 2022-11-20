
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

public class Runner_After_POM extends Utility_File {
	public static WebDriver driver = browser_Config("chrome");
	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	public static void main(String[] args) throws InterruptedException, IOException {
		get_Url("https://adactinhotelapp.com/");
		maximise("maximise");
		send_Keys(manager.getHp().getUsername(), "Sharonvithya");
		send_Keys(manager.getHp().getPassword(), "sharon@123");
		click_On_Element(manager.getHp().getLogin());

		select_byValue(manager.getSh().getLocation(), "London");
		select_byVisible(manager.getSh().getHotel(), "Hotel Sunshine");
		select_byValue(manager.getSh().getRoom(), "Deluxe");
		select_byVisible(manager.getSh().getNum(), "4- Four");
		clear_Element(manager.getSh().getCheckin_Date());
		send_Keys(manager.getSh().getCheckin_Date(), "26/10/2022");
		clear_Element(manager.getSh().getCheckout_Date());
		send_Keys(manager.getSh().getCheckout_Date(), "30/10/2022");
		select_byIndex(manager.getSh().getAdult_room(), 1);
		select_byIndex(manager.getSh().getChild_room(), 1);
		click_On_Element(manager.getSh().getSearch());
		click_On_Element(manager.getSo().getSelect_btn());
		click_On_Element(manager.getSo().getContinue_btn());
		send_Keys(manager.getBh().getFirst_name(), "Sharon");
		send_Keys(manager.getBh().getLast_name(), "Vithya");
		send_Keys(manager.getBh().getAddress(), "11/169,OOTY-643215");
		send_Keys(manager.getBh().getCredit_num(), "1234567890987654");
		select_byValue(manager.getBh().getCredit_type(), "VISA");
		select_byValue(manager.getBh().getMonth(), "12");
		select_byValue(manager.getBh().getYear(), "2022");
		send_Keys(manager.getBh().getCvv_num(), "655");
		click_On_Element(manager.getBh().getBook_now());
		sleep(5000);
		scroll_Down(manager.getBc().getMy_iternitity());
		//screenshot();



	}
}


