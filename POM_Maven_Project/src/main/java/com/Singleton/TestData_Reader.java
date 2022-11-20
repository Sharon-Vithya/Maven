package com.Singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import okhttp3.Address;

public class TestData_Reader {
	public static Properties p;

	public TestData_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\ELCOT\\eclipse-workspace\\POM_Maven_Project\\src\\main\\java\\com\\Singleton\\singleton.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getUsername() {
		String username = p.getProperty("username");
		return username;

	}

	public String getPassword() {
		String password = p.getProperty("password");
		return password;

	}

	public String getLocation() {
		String location = p.getProperty("location");
		return location;

	}

	public String getHotel() {
		String hotel = p.getProperty("hotel");
		return hotel;

	}

	public String getRoom() {
		String room = p.getProperty("room");
		return room;

	}

	public String getNumber() {
		String number = p.getProperty("number");
		return number;

	}

	public String check_in_date() {
		String check_in_date = p.getProperty("check_in_date");
		return check_in_date;

	}

	public String check_out_date() {
		String check_out_date = p.getProperty("check_out_date");
		return check_out_date;

	}

	public String firstname() {
		String firstname = p.getProperty("firstname");
		return firstname;

	}

	public String lastname() {
		String lastname = p.getProperty("lastname");
		return lastname;

	}

	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}

	public String credit_card_number() {
		String card_num = p.getProperty("credit_card_number");
		return card_num;
	}

	public String credit_card_type() {
		String card_type = p.getProperty("credit_card_type");
		return card_type;
	}

	public String getMonth() {
		String month = p.getProperty("month");
		return month;

	}

	public String getYear() {
		String year = p.getProperty("year");
		return year;

	}

	public String getCVV() {
		String cvv = p.getProperty("cvv");
		return cvv;

	}

}
