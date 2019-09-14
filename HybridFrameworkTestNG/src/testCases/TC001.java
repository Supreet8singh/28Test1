package testCases;

import org.testng.Reporter;

import constantValues.TestData;
import mainScript.DriverScript;
import pages.Home_header;
import utility.ActionKeywords;

public class TC001 {

	public void tc01() throws Exception {
		
		try {
			TestData TD = new TestData();
			ActionKeywords AK = new ActionKeywords();
			Home_header HH = new Home_header();
			
			AK.openBrowser(TD.browserName);
			AK.openURL(TD.URL);
			HH.departureCity();
			HH.destnationCity();
			HH.departureMonthYear();
			HH.departureDate();
			HH.searchFlightButton();
			
		} catch (Exception e) {
			DriverScript.bValue = false;
			Reporter.log("TC01 Failed");
			e.printStackTrace();
		}

	}
}
