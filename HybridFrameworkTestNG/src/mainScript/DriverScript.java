package mainScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constantValues.TestData;
import testCases.TC001;
import testCases.TC002;
import testCases.TC003;
import testCases.TC004;
import utility.ExcelReadWrite;

public class DriverScript {
	
		public static boolean bValue;
		
		ExcelReadWrite EW = new ExcelReadWrite();
		TestData TD = new TestData();
		
//-------------------------------------------------------TC001-----------------------------------------------		
		
//---------------------Second-------------------------		
		@Test(priority=1)
		public void tc01() throws Exception{
			TC001 tc01 = new TC001();
		if (EW.readValues(TD.sheetPath, TD.testScenariosheet, 1, TD.runMOde).equalsIgnoreCase("Y")) {
			bValue = true;
			tc01.tc01();
			if (bValue == true) {
				EW.writeValues(TD.sheetPath, TD.testScenariosheet, 1, TD.status, TD.Pass);
			} else if (bValue == false) {
				EW.writeValues(TD.sheetPath, TD.testScenariosheet, 1, TD.status, TD.fail);
				assertTrue(false);
			}
		} else {
			EW.writeValues(TD.sheetPath, TD.testScenariosheet, 1, TD.status, TD.Skip);
		}
		}
//-------------------------------------------------------TC002-----------------------------------------------	
	
	//------------------------Third00-------------------------------
		@Test(priority=2)
		public void tc02() throws Exception{
			TC002 tc02 = new TC002();
		if (EW.readValues(TD.sheetPath, TD.testScenariosheet, 2, TD.runMOde).equalsIgnoreCase("Y")) {
			bValue = true;
			tc02.tc02();	
			if (bValue == true) {
				EW.writeValues(TD.sheetPath, TD.testScenariosheet, 2, TD.status, TD.Pass);
			} else if (bValue == false) {
				EW.writeValues(TD.sheetPath, TD.testScenariosheet, 2, TD.status, TD.fail);
				assertTrue(false);
			}
		} else {
			EW.writeValues(TD.sheetPath, TD.testScenariosheet, 2, TD.status, TD.Skip);
		}
		}
//-------------------------------------------------------TC003-----------------------------------------------	
		@Test(priority=3)
		public void tc03() throws Exception{
			TC003 tc03 = new TC003();
		if (EW.readValues(TD.sheetPath, TD.testScenariosheet, 3, TD.runMOde).equalsIgnoreCase("Y")) {
			bValue = true;
			tc03.tc03();	
			if (bValue == true) {
				EW.writeValues(TD.sheetPath, TD.testScenariosheet, 3, TD.status, TD.Pass);
			} else if (bValue == false) {
				EW.writeValues(TD.sheetPath, TD.testScenariosheet, 3, TD.status, TD.fail);
				assertTrue(false);
			}
		} else {
			EW.writeValues(TD.sheetPath, TD.testScenariosheet, 3, TD.status, TD.Skip);
		}
		}
//-------------------------------------------------------TC004-----------------------------------------------	
		@Test(priority=4)
		public void tc04() throws Exception{
			TC004 tc04 = new TC004();
		if (EW.readValues(TD.sheetPath, TD.testScenariosheet, 4, TD.runMOde).equalsIgnoreCase("Y")) {
			bValue = true;
			tc04.tc04();	
			if (bValue == true) {
				EW.writeValues(TD.sheetPath, TD.testScenariosheet, 4, TD.status, TD.Pass);
			} else if (bValue == false) {
				EW.writeValues(TD.sheetPath, TD.testScenariosheet, 4, TD.status, TD.fail);
				assertTrue(false);
			}
		} else {
			EW.writeValues(TD.sheetPath, TD.testScenariosheet, 4, TD.status, TD.Skip);
		}
		}
	}

