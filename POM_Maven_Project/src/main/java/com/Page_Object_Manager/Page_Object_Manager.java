package com.Page_Object_Manager;

import org.openqa.selenium.WebDriver;

import com.Utility_Files.Book_Hotel;
import com.Utility_Files.Booking_Confirm;
import com.Utility_Files.Home_Page;
import com.Utility_Files.Search_Hotel;
import com.Utility_Files.Select_Hotel;

public class Page_Object_Manager {
	public WebDriver driver;
	private Home_Page hp;
	private Search_Hotel sh;
	private Select_Hotel so;
	private Book_Hotel bh;
	private Booking_Confirm bc;


	public Page_Object_Manager(WebDriver driver2) {
		driver=driver2;
	}

	public Home_Page getHp() {
		if (hp == null) {
			hp = new Home_Page(driver);
		}

		return hp;
	}

	public Search_Hotel getSh() {
		if (sh == null) {
			sh = new Search_Hotel(driver);
		}
		return sh;
	}

	public Select_Hotel getSo() {
		if (so == null) {
			so = new Select_Hotel(driver);
		}
		return so;
	}

	public Book_Hotel getBh() {
		if (bh == null) {
			bh = new Book_Hotel(driver);
		}
		return bh;
	}

	public Booking_Confirm getBc() {
		if (bc == null) {
			bc = new Booking_Confirm(driver);
		}
		return bc;
	}

	
}
