package week7.day2.assignments.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import week7.day2.assignments.hooks.TestNgHooks;

public class EnterSearch extends TestNgHooks {

	public UpdateCallerDetailsSN searchfield(String data) {

		WebElement ele1 = locateElement("xpath", "//input[@placeholder='Search']");
		ele1.sendKeys(data, Keys.ENTER);
		click(locateElement("xpath", "//a[@class='linked formlink']"));
		return new UpdateCallerDetailsSN();

	}

}
