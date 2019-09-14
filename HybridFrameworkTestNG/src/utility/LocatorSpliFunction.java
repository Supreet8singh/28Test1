package utility;

import org.openqa.selenium.By;

public class LocatorSpliFunction {

	public static By locatorSplit(String locVariable) {
		String locType = locVariable.split(":")[0];
		String locValue = locVariable.split(":")[1];
	
		if (locType.equalsIgnoreCase("NAME")) { 
			return By.name(locValue);
			
		} else if (locType.equalsIgnoreCase("ID")) {
			return By.id(locValue);
			
		} else if (locType.equalsIgnoreCase("XPATH")) {
			return By.xpath(locValue);   
			
		} else if (locType.equalsIgnoreCase("CSSSELECTOR")) {
			return By.cssSelector(locValue);
			
		} else if (locType.equalsIgnoreCase("LINKTEXT")) {
			return By.linkText(locValue);
			
		} else if (locType.equalsIgnoreCase("PARTIALLINKTEXT")) {
			return By.partialLinkText(locValue);
			
		} else if (locType.equalsIgnoreCase("TAGNAME")) {
			return By.tagName(locValue);
			
		} else if (locType.equalsIgnoreCase("CLASSNAME")) {
			return By.className(locValue);
		}
		
		return null;
	}
}
