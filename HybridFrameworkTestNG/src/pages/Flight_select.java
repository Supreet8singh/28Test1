package pages;

import constantValues.LocatorValues;
import utility.ActionKeywords;

public class Flight_select {

	ActionKeywords AK = new ActionKeywords();
	LocatorValues LV = new LocatorValues();
	
	public void defaultflightPrice() {
		String price = AK.fetchValue(LV.flightPriceLocation_SearchFlightPage);
		System.out.println(price);
	}
	
	public void scrolling() {
		AK.scrolling();
	}
	
	public void clickContactUsLink() {
		AK.handlingClick(LV.contactUsLocation_SearchFlightPage);
	}
	
	public void switchWindow() {
		AK.switchmultipleWindows(1);
	}
	
}
