package testing.parameters.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DiffClass {

	
	@DataProvider
	public Object[][] check(){
		return new Object[][] {{"Arun","Arun123"},
			                 {"san","San@123"}};
		}
	}
			

