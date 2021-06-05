package week7.day2.assignments.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import week7.day2.assignments.hooks.TestNgHooks;

public class ReturnPageSN extends TestNgHooks {

	public void verifyCallerUpdate() {

		System.out.println(" The Caller is Updated");

	}

	public void verifyCallerDelete() {

		System.out.println("The Caller is Deleted");

	}

	public void verifyCreateArticle() throws InterruptedException {

		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		ele.click();
		ele.sendKeys(number);
		ele.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		String number1 = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		Thread.sleep(1000);

		System.out.println(number);

		if (number.equals(number1)) {
			System.out.println("Knowledge is created successfully");
		} else {
			System.out.println("Knowledge is not created");
		}

	}

	public void verifyUpateArticle() {

		System.out.println("Article Updated");

		WebElement searchOptNum = driver
				.findElement(By.cssSelector("span#kb_knowledge_hide_search>div>div>span>span>select"));
		new Select(searchOptNum).selectByIndex(1);

		WebElement eleSearch = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		eleSearch.click();
		eleSearch.sendKeys(number);
		eleSearch.sendKeys(Keys.ENTER);

	}

}
