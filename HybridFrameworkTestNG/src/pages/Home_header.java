package pages;

import org.openqa.selenium.Keys;
import constantValues.LocatorValues;
import constantValues.TestData;
import utility.ActionKeywords;

public class Home_header {

	TestData TD = new TestData();
	ActionKeywords AK = new ActionKeywords();
	LocatorValues LV = new LocatorValues();
	
	public void departureCity() {
	
		for (int i = 0; i < 15; i++) {
		AK.handlingKeyBoardKeys(LV.fromLocation_HomePage, Keys.BACK_SPACE);
		}
		AK.handlingTextBoxes(LV.fromLocation_HomePage, TD.deptCity);
		AK.handlingKeyBoardKeys(LV.fromLocation_HomePage, Keys.ENTER);
	}
	
	public void destnationCity() throws Exception {
		Thread.sleep(2000);
		AK.handlingTextBoxes(LV.toLocation_HomePage, TD.arrivalCity);
		AK.handlingKeyBoardKeys(LV.toLocation_HomePage, Keys.TAB);
	}
	
	public void departureMonthYear() {
		for (int i = 0; i < 12; i++) {
		
		AK.handlingClick(LV.nextMonthIconLocation_HomePage);
		if (AK.fetchValue(LV.monthLocation_HomePage).equalsIgnoreCase(TD.month) && AK.fetchValue(LV.yearLocation_HomePage).equalsIgnoreCase(TD.year)) {
			break;
		}
		}
	}
	
	public void departureDate() {
		AK.handlingTables(LV.dateSelectionLocation_HomePage, TD.date);
	}
	
	public void searchFlightButton() throws Exception {
		AK.handlingClick(LV.searchFlightLocation_HomePage);
		Thread.sleep(5000);
	}
}
