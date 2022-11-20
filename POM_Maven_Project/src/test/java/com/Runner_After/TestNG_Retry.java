package com.Runner_After;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNG_Retry {
	@Test(priority = -1)
	private void username() {
String expected_username = "Sharon Vithya";
String actual_username = "Angel Nithy";
org.testng.Assert.assertEquals(actual_username, expected_username);

//Assert.assertEquals(actual_username, expected_username);
	}
	@Test
	private void password() {
		String expected_password = "sharon@123";
		String actual_password = "angel@123";
		org.testng.Assert.assertEquals(actual_password, expected_password);
		//Assert.assertEquals(actual_password, expected_password);

	}

}
