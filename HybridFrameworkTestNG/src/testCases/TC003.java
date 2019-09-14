package testCases;

import org.testng.Reporter;

import mainScript.DriverScript;
import pages.ContactUS;
import pages.Flight_select;

public class TC003 {

	public void tc03() throws Exception {
		try {
			Flight_select FS = new Flight_select();
			ContactUS CS = new ContactUS();
			
			FS.clickContactUsLink();
			FS.switchWindow();
			CS.fetchOfficeAdd();			
		} catch (Exception e) {
			DriverScript.bValue = false;
			Reporter.log("TC03 Failed");
			e.printStackTrace();
		}

	}
}
