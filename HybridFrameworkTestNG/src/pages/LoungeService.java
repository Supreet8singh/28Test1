package pages;

import constantValues.LocatorValues;
import utility.ActionKeywords;

public class LoungeService {

	ActionKeywords AK = new ActionKeywords();
	LocatorValues LV = new LocatorValues();
	
	public void fetchLoungeSerives() {
		AK.fetchMultiplValues(LV.allServicesLocation_LoungeServicesPage);
	}
}
