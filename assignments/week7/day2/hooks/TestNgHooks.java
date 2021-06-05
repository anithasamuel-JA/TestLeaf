package assignments.week7.day2.hooks;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import week7.day2.assignments.utils.DataLibrary;
import week7.day2.assignments.wrappers.BaseDriver;

public class TestNgHooks extends BaseDriver {

	public static ChromeDriver driver;
	public static String number;

	public String dataSheetName;

	@DataProvider(name = "FetchExcelData")
	public Object[][] fetchData() throws IOException, InvalidFormatException {
		return DataLibrary.readExcelData(dataSheetName);
	}

	@BeforeMethod
	public void beforeMethod() {
		startApp("chrome", "https://dev103117.service-now.com");
		setNode();
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}
}
