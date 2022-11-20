package com.Runner_After;

import org.testng.annotations.DataProvider;

public class DataProvider_Uitility {
	@DataProvider String[][] data_value() {
		String[][] value = {
				
				{"Sharon","Sharon@123","12345"},
				{"Zarah", "Zarah@123","67890"},
				{"Angel", "Angel@123","98765"}	
		};
		return value;
		

	}
}
