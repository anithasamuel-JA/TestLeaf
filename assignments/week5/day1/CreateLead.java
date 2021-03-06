package week5.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@Test
	public void createLead() throws InterruptedException {

		driver.findElement(By.linkText("Create Lead")).click();

		// Assign value to Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// Assign value to Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sam");

		// Assign value to First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ani");

		WebElement eleSourceId = driver.findElement(By.name("dataSourceId"));

		Select dd1 = new Select(eleSourceId);
		// dd1.selectByVisibleText("Partner");
		// dd1.selectByIndex(7);
		dd1.selectByValue("LEAD_PARTNER");

		// Marketing campaign

		WebElement eleCampaignId = driver.findElement(By.name("marketingCampaignId"));

		Select dd2 = new Select(eleCampaignId);
		dd2.selectByVisibleText("Demo Marketing Campaign");

		// First Name(Local)
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anitha");
		// Last Name (Local)
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Samuel");
		// Salutation
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Test");
		// Birthdate
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("30/01/90");
		// Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead creation demo");
		// Department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		// Annual Revenue
		driver.findElement(By.name("annualRevenue")).sendKeys("2000000");
		// Preferred currency
		WebElement prefCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dd3 = new Select(prefCurrency);
		dd3.selectByVisibleText("USD - American Dollar");
		// Industry
		WebElement eleindustry = driver.findElement(By.name("industryEnumId"));
		Select dd4 = new Select(eleindustry);
		dd4.selectByVisibleText("Finance");
		// Number of employees
		driver.findElement(By.name("numberEmployees")).sendKeys("45");
		// Ownership
		WebElement eleowner = driver.findElement(By.name("ownershipEnumId"));
		Select dd5 = new Select(eleowner);
		dd5.selectByVisibleText("Public Corporation");
		// Ticker Symbol
		driver.findElement(By.name("tickerSymbol")).sendKeys("U");
		// SIC Code
		driver.findElement(By.name("sicCode")).sendKeys("12345");
		// Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys(" Demo on Lead creation form");
		// Important Note
		driver.findElement(By.name("importantNote")).sendKeys("Must create duplicate form");
		// Countrycode
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1");
		// Area code
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("1");
		// Extension
		driver.findElement(By.name("primaryPhoneExtension")).sendKeys("212");
		// Email address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testing@gmail.com");
		// Phone number
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9087654321");
		// Person to ask for
		driver.findElement(By.name("primaryPhoneAskForName")).sendKeys("Test");
		// Web Url
		driver.findElement(By.name("primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps");

		// To Name name("generalToName")
		driver.findElement(By.name("generalToName")).sendKeys("Testing");

		// Attention Name name("generalAttnName")
		driver.findElement(By.name("generalAttnName")).sendKeys("Test");

		// Address Line 1 name ("generalAddress1")
		driver.findElement(By.name("generalAddress1")).sendKeys("Color");

		// Address Line 2 ("generalAddress2")
		driver.findElement(By.name("generalAddress2")).sendKeys("Avenue");

		// City ("generalCity")
		driver.findElement(By.name("generalCity")).sendKeys("Chennai");

		// State/Province ("generalStateProvinceGeoId")
		WebElement eleState = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd6 = new Select(eleState);
		dd6.selectByVisibleText("Washington");

		// Zip/Postalcode ("generalPostalCode")
		driver.findElement(By.name("generalPostalCode")).sendKeys("600100");

		// Country ("generalCountryGeoId")
		WebElement eleCountry = driver.findElement(By.name("generalCountryGeoId"));
		Select dd7 = new Select(eleCountry);
		dd7.selectByVisibleText("United States");

		// Zip/Postal Code Extension ("generalPostalCodeExt")

		driver.findElement(By.name("generalPostalCodeExt")).sendKeys("2100");

		System.out.println("Form created");

		driver.findElement(By.className("smallSubmit")).click();

		driver.findElement(By.linkText("Duplicate Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).clear();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("PayPal");

		driver.findElement(By.className("smallSubmit")).click();

		// Verification of duplicate Company Name
		String dName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Company Name with id: " + dName);
		dName = dName.replaceAll("[^a-zA-Z]", "");
		System.out.println("Duplicate Company name: " + dName);

		// Go to CRM/SFA Page
		WebElement imgLink = driver.findElement(By.xpath("//img[@src=\"/opentaps_images/opentaps_logo.png\"]"));
		imgLink.click();

		// Click on Logout
		driver.findElement(By.className("decorativeSubmit")).click();

	}

}

