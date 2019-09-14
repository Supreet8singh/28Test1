package constantValues;

import utility.ExcelReadWrite;

public class TestData {

	ExcelReadWrite ER = new ExcelReadWrite();
	
	public final String sheetPath = "E:\\Eclipse wrokspace\\28TestJuly\\HybridFrameworkTestNG\\Indigo Test Cases.xlsx";
	public final String sheetName = "TestCases";
	public final String testScenariosheet = "Test Scenarios";
	
	public final int runMOde = 3;
	public final int status = 2;
	
	public final String Pass = "PASS";
	public final String fail = "FAIL";
	public final String Skip = "SKIP";
	
	public final String browserName = ER.readValues(sheetPath, sheetName, 1, 4);
	public final String URL = ER.readValues(sheetPath, sheetName, 2, 4);
	public final String deptCity = ER.readValues(sheetPath, sheetName, 3, 4);
	public final String arrivalCity = ER.readValues(sheetPath, sheetName, 4, 4);
	public final String month = ER.readValues(sheetPath, sheetName, 5, 4);
	public final String year = ER.readValues(sheetPath, sheetName, 6, 4);
	public final String date = ER.readValues(sheetPath, sheetName, 7, 4);
	
}
