package com.Singleton;

import java.io.IOException;

public class File_Reader {

public static File_Reader getInstanceFR() {
	File_Reader reader = new File_Reader();
	return reader;

}	
	
	public TestData_Reader getInstanceTD() throws IOException {
		TestData_Reader td = new TestData_Reader();
		return td;
	}
	
	
	
	
	
	
	
	
	
	
}
