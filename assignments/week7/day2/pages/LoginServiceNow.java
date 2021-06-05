package week7.day2.assignments.pages;

import week7.day2.assignments.hooks.TestNgHooks;

public class LoginServiceNow extends TestNgHooks {

	public LoginServiceNow clickMainFrame() {
		switchToFrame("gsft_main");
		return this;
	}

	public LoginServiceNow typeUsername(String username) {

		clearAndType(locateElement("id", "user_name"), username);
		return this;
	}

	public LoginServiceNow typePassword(String password) {

		clearAndType(locateElement("id", "user_password"), password);
		return this;
	}

	public HomePageSN clickLogin() {
		click(locateElement("id", "sysverb_login"));
		return new HomePageSN();
	}

}
