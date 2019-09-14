package testCases;

import org.testng.Reporter;

import mainScript.DriverScript;
import pages.Flight_select;

public class TC002 {

	public void tc02() {
		try {
			Flight_select FS = new Flight_select();
			
			FS.defaultflightPrice();			
		} catch (Exception e) {
			DriverScript.bValue = false;
			Reporter.log("TC02 Failed");
			e.printStackTrace();
		}

	}
}
