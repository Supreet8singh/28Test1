package pages;

import constantValues.LocatorValues;
import utility.ActionKeywords;

public class ContactUS {

	ActionKeywords AK = new ActionKeywords();
	LocatorValues LV = new LocatorValues();
	
	public void fetchOfficeAdd() throws Exception {
		Thread.sleep(1000);
		String add = AK.fetchValue(LV.CINLocation_ContactUsPage);
		System.out.println(add);
	}
	
	public void hoverManageLink() throws Exception {
		Thread.sleep(2000);
		AK.mouseHoverWithOutCLick(LV.manageLocation_ContactUsPage);
	}
	
	public void hoverandClickServices() {
		AK.mouseHoverWithCLick(LV.loungeServiceLocation_ContactUsPage);
	}
}
