package week7.day2.assignments.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import week7.day2.assignments.hooks.TestNgHooks;
import week7.day2.assignments.pages.LoginServiceNow;

public class UpdateCallerTest extends TestNgHooks {

	@BeforeTest
	public void setValues() {
		testCaseName = "Update Caller";
		testDescription = "Update Caller";
		nodes = "Callers";
		authors = "Meenakshi";
		category = "sanity";
		dataSheetName = "UpdateCaller";
	}

	@Test(dataProvider = "FetchExcelData")
	public void createcallertest(String firstname, String phno) throws InterruptedException {

		new LoginServiceNow()
      .clickMainFrame()
      .typeUsername("admin")
      .typePassword("India@123")
      .clickLogin()
      .verifyWelcomeMsg()
      .typeFilter("Callers")
      .switchEnterSearch()
      .searchfield(firstname)
      .updatePhone(phno)
      .clickUpdate()
      .verifyCallerUpdate();

	}

}
