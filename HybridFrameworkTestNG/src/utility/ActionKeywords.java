package utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class ActionKeywords {

	//Openbrowser
	//OpenURL
	//Click
	//Sendkeys
	//SelectValuefromdropdown
	//MouseHoveringwithoutclick
	//MouseHoveringwithclick
	//switchingmuliplewindows
	//switchingframes
	//Tables
	//Scrolling
	//FetchtheValue
	//CloseBrowser
	
	public static WebDriver driver;
	public static boolean bValue = false;
	
	public WebDriver openBrowser(String bName) {
		if (bName.equalsIgnoreCase("CHROME")) {
			driver = new ChromeDriver();			
			driver.manage().window().maximize();
		} else if (bName.equalsIgnoreCase("FIREFOX")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (bName.equalsIgnoreCase("SAFARI")) {
			driver = new SafariDriver();
		}
		return driver;		
	}
	
	public void openURL(String testData) {
		driver.get(testData);
		Reporter.log("The URL opened is " + testData);
	}
	
	public void handlingClick(String locVariable) {
		WebElement element = driver.findElement(LocatorSpliFunction.locatorSplit(locVariable));
		element.click();
		Reporter.log("Element clicked at Locator  " + locVariable);
	}
	
	public void handlingTextBoxes(String locVariable, String testData) {
		WebElement element = driver.findElement(LocatorSpliFunction.locatorSplit(locVariable));		
		element.sendKeys(testData);
		Reporter.log("Entered the value at Locator  " + locVariable);
	}
	
	public void handlingKeyBoardKeys(String locVariable, Keys backSpace) {
		WebElement element = driver.findElement(LocatorSpliFunction.locatorSplit(locVariable));		
		element.sendKeys(backSpace);
		Reporter.log("Entered the Key at Locator  " + locVariable);
	}
	
	public void handlingDropdown(String locVariable, String testData) {
		WebElement element = driver.findElement(LocatorSpliFunction.locatorSplit(locVariable));
		Select sel = new Select(element);
		sel.selectByVisibleText(testData);
		Reporter.log("Selected the value from the drop down at Locator  " + locVariable);
	}
	
	public void mouseHoverWithOutCLick(String locVariable) {
		WebElement element = driver.findElement(LocatorSpliFunction.locatorSplit(locVariable));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		Reporter.log("Hovered the value at Locator  " + locVariable);
	}
	
	public void mouseHoverWithCLick(String locVariable) {
		WebElement element = driver.findElement(LocatorSpliFunction.locatorSplit(locVariable));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().perform();
		Reporter.log("Hovered and clicked the value at Locator  " + locVariable);
	}
	
	public void switchmultipleWindows(int wndowId) {
		List<String> allWindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allWindows.get(wndowId));
		Reporter.log("Switched to the window id  " + wndowId);
	}
	
	public void switchFrames(String testData) {
		driver.switchTo().frame(testData);
		Reporter.log("switched to the frame  " + testData);
	}

	public void switchToDefault() {
		driver.switchTo().defaultContent();
		Reporter.log("Switched to default frame  " );
	}
	
	public void handlingTables(String locVariable, String testData) {
		List<WebElement> totalRows = driver.findElements(LocatorSpliFunction.locatorSplit(locVariable));
		int count = totalRows.size();
		System.out.println("The number of rows is ---" + count);
				
		for (int i = 0; i < count; i++) {
			if (bValue == true) {
				break;
			} 
			else 
			{
			List<WebElement> totalData = totalRows.get(i).findElements(By.tagName("td"));
			int tdTags = totalData.size();
			System.out.println("The total td tags in row # " + i + " is " + tdTags);
			
			for (int j = 0; j < tdTags; j++) {
				String tdTagText = totalData.get(j).getText();
				System.out.println("The values in td tag # " + i + " is " + tdTagText);
				
				if (tdTagText.equals(testData)) {
					totalData.get(j).click();
					bValue = true;
					break;
				}
			}
		}
	 }

	}
	
	public void fetchMultiplValues(String locVariable) {
		List<WebElement> loungeSerices = driver.findElements(LocatorSpliFunction.locatorSplit(locVariable));
		for (int i = 0; i < loungeSerices.size(); i++) {
			String allServices = loungeSerices.get(i).getText();
			System.out.println(allServices);
		}
		
		Reporter.log("Entered the value at Locator  " + locVariable);
	}
	
	public void scrolling() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll('0,1000')");
		Reporter.log("Scrolling successfully done");
	}
	
	public String fetchValue(String locVariable) {
		WebElement element = driver.findElement(LocatorSpliFunction.locatorSplit(locVariable));
		String value = element.getText();
		Reporter.log("Fetched the value from Locator  " + locVariable);
		return value;
	}
	
	public void closeBrowser() {
		driver.quit();
		Reporter.log("Closed the browser  ");
	}

}
