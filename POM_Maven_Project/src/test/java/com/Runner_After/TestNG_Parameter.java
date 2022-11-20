package com.Runner_After;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameter {

	@Parameters({"id","pass","first","last"})
	@Test
	private void credential_login(String username, String password,String firstname,String lastname) {
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		System.out.println("firstname:"+firstname);
		System.out.println("lastname:"+lastname);
		

	}
}
