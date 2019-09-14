package testCases;

import org.testng.Reporter;

import mainScript.DriverScript;
import pages.ContactUS;
import pages.LoungeService;
import utility.ActionKeywords;

public class TC004 {
	
	public void tc04() {
		try {
			ActionKeywords AK = new ActionKeywords();
			ContactUS CS = new ContactUS();
			LoungeService LS = new LoungeService();
			
			CS.hoverManageLink();
			CS.hoverandClickServices();
			LS.fetchLoungeSerives();
			
			AK.closeBrowser();			
		} catch (Exception e) {
			DriverScript.bValue = false;
			Reporter.log("TC04 Failed");
			e.printStackTrace();
		}

	}

}
