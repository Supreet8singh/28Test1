package constantValues;

public class LocatorValues {

	public String locatorVariable = "LocatorType:LocatorValue";
	
	public  String fromLocation_HomePage = "name:or-src";
	public 	String toLocation_HomePage = "name:or-dest";
	public  String nextMonthIconLocation_HomePage = "xpath://*[starts-with(@id,'dp15')]/div/div[2]/div/a/span";
	public  String monthLocation_HomePage = "xpath://*[starts-with(@id,'dp15')]/div/div[2]/div/div/span[1]";
	public  String yearLocation_HomePage = "xpath://*[starts-with(@id,'dp15')]/div/div[2]/div/div/span[2]";
	public  String dateSelectionLocation_HomePage = "xpath://*[starts-with(@id,'dp15')]/div/div[2]/table/tbody/tr";
	public  String searchFlightLocation_HomePage = "xpath://*[@id='bookFlightTab']/form/div[7]/div[6]/button/span[1]";
	
	public  String flightPriceLocation_SearchFlightPage = "xpath://*[@id='bookingWidgetContainer']/div/div/div/div[2]/div[3]/div/div[1]/span";
	public  String contactUsLocation_SearchFlightPage = "linktext:Contact us";
	
	public  String CINLocation_ContactUsPage = "xpath:/html/body/div[6]/div[1]/div[1]/div/div[1]/div/div[1]/p[1]";
	public  String manageLocation_ContactUsPage = "linktext:Manage";
	public  String loungeServiceLocation_ContactUsPage = "linktext:Lounge Services";
	
	public  String allServicesLocation_LoungeServicesPage = "xpath://a[starts-with(@class,'ac_closed acc-lnk panel-title collapsed counterdisplay')]";

}
