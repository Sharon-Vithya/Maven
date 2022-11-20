

package com.Runner_After;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Page_Object_Manager.Page_Object_Manager;
import com.Singleton.File_Reader;
import com.Utility_Files.Utility_File;

public class TestNG_Attributes extends Utility_File {
	public static WebDriver driver = browser_Config("chrome");
	public static Page_Object_Manager manager = new Page_Object_Manager(driver);
	
	@org.testng.annotations.Test(priority = -3,invocationCount = 1,invocationTimeOut = 5000,groups = "login") 
	private void session_created() {
		get_Url("https://adactinhotelapp.com/");
		maximise("maximise");

	}
	@org.testng.annotations.Test(priority = -2,description = "Loggedin Sucessfully",groups = "login") 
	private void credential() throws IOException {
		String username = File_Reader.getInstanceFR().getInstanceTD().getUsername();
		send_Keys(manager.getHp().getUsername(), username);
		String password = File_Reader.getInstanceFR().getInstanceTD().getPassword();
		send_Keys(manager.getHp().getPassword(), password);

	}
	@org.testng.annotations.Test(priority = -1,dependsOnMethods = "credential",groups = "login") 
	private void hotel_details() throws IOException {
		click_On_Element(manager.getHp().getLogin());
		String location = File_Reader.getInstanceFR().getInstanceTD().getLocation();
		select_byValue(manager.getSh().getLocation(), location);
		String hotel = File_Reader.getInstanceFR().getInstanceTD().getHotel();
		select_byVisible(manager.getSh().getHotel(), hotel);
		String room = File_Reader.getInstanceFR().getInstanceTD().getRoom();
		select_byValue(manager.getSh().getRoom(), room);
		String number = File_Reader.getInstanceFR().getInstanceTD().getNumber();
		select_byVisible(manager.getSh().getNum(), number);
		clear_Element(manager.getSh().getCheckin_Date());
		String check_in_date = File_Reader.getInstanceFR().getInstanceTD().check_in_date();
		send_Keys(manager.getSh().getCheckin_Date(), check_in_date);
		clear_Element(manager.getSh().getCheckout_Date());
		String check_out_date = File_Reader.getInstanceFR().getInstanceTD().check_out_date();
		send_Keys(manager.getSh().getCheckout_Date(), check_out_date);
		select_byIndex(manager.getSh().getAdult_room(), 1);
		select_byIndex(manager.getSh().getChild_room(), 1);

	}
	@org.testng.annotations.Test(priority = 0)
	private void nextpage() {
		click_On_Element(manager.getSh().getSearch());
		click_On_Element(manager.getSo().getSelect_btn());
		click_On_Element(manager.getSo().getContinue_btn());

	}
	@org.testng.annotations.Test(priority = 1)
	private void account_Details() throws IOException {
		String firstname = File_Reader.getInstanceFR().getInstanceTD().firstname();
		send_Keys(manager.getBh().getFirst_name(), firstname);
		String lastname = File_Reader.getInstanceFR().getInstanceTD().lastname();
		send_Keys(manager.getBh().getLast_name(), lastname);
		String address = File_Reader.getInstanceFR().getInstanceTD().getAddress();
		send_Keys(manager.getBh().getAddress(), address);
		//String credit_card_number = File_Reader.getInstanceFR().getInstanceTD().credit_card_number();
		send_Keys(manager.getBh().getCredit_num(), "1234567890987654");
		String credit_card_type = File_Reader.getInstanceFR().getInstanceTD().credit_card_type();
		select_byValue(manager.getBh().getCredit_type(), credit_card_type);
		String month = File_Reader.getInstanceFR().getInstanceTD().getMonth();
		select_byValue(manager.getBh().getMonth(), month);
		String year= File_Reader.getInstanceFR().getInstanceTD().getYear();
		select_byValue(manager.getBh().getYear(), year);
		String cvv = File_Reader.getInstanceFR().getInstanceTD().getCVV();
		send_Keys(manager.getBh().getCvv_num(), cvv);

	}
	@org.testng.annotations.Test(priority = 2)
	private void booking_Details() throws InterruptedException, IOException {
		click_On_Element(manager.getBh().getBook_now());
	sleep(5000);
	scroll_Down(manager.getBc().getMy_iternitity());
	//	screenshot();


	}
		
		
		
		
		


	
}



