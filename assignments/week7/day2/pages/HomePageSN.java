package week7.day2.assignments.pages;

import org.openqa.selenium.WebElement;

import week7.day2.assignments.hooks.TestNgHooks;

public class HomePageSN extends TestNgHooks {

	public MyHomePageSN verifyWelcomeMsg() {

		WebElement navsideBar = locateElement("xpath", "//nav[@class='navpage-nav']");

		boolean navdisplay = navsideBar.isDisplayed();
		System.out.println(navdisplay);

		if (navdisplay) {
			if (verifyTitle("ServiceNow")) {
				System.out.println("User Login Successful");
			} else {
				System.out.println("User Login is not Successful");
			}
		}
		return new MyHomePageSN();
	}

	public LoginServiceNow clickLogout() {

		click(locateElement("xpath", "//span[@class='caret']"));
		click(locateElement("link", "Logout"));

		return new LoginServiceNow();
	}

}
