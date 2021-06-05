package week7.day2.assignments.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import week7.day2.assignments.hooks.TestNgHooks;
import week7.day2.assignments.pages.LoginServiceNow;

public class CreateCallerTest extends TestNgHooks {

	@BeforeTest
	public void setValues() {
		testCaseName = "Create Caller";
		testDescription = "Create a new Caller";
		nodes = "Callers";
		authors = "Meenakshi";
		category = "sanity";
		dataSheetName = "CreateCaller";
	}

	@Test(dataProvider = "FetchExcelData")
	public void createcallertest(String firstname, String lastname, String phno, String email, String usertitle,
			String mobile) throws InterruptedException {

		new LoginServiceNow().clickMainFrame().typeUsername("admin").typePassword("India@123").clickLogin()
				.verifyWelcomeMsg().typeFilter("Callers").switchParentFrame().clickNewButton().typeFirstname(firstname)
				.typeLastname(lastname).typeEmail(email).typePhone(phno).typeUsertitle(usertitle).typeMobile(mobile)
				.clickSubmit();

	}

}
