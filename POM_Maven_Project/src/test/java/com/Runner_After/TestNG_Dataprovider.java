package com.Runner_After;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestNG_Dataprovider {
	
	@Test(dataProvider = "data_value",dataProviderClass =DataProvider_Uitility.class )
	private void credential(String username, String password, String number) {
		System.out.println("Username:"+username);
		System.out.println("Password:"+password);
		System.out.println("Number:"+number);
		

	}

}
