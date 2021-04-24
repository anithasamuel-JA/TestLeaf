package assignments.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Get the Title
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		//Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		
		//first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anitha");
		
		//last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		
		//source drop down
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select d1= new Select(dropdown);
		d1.selectByVisibleText("Partner");
		
		//marketing campaign drop down
		WebElement marketdropdown = driver.findElement(By.name("marketingCampaignId"));
		Select d2= new Select(marketdropdown);
		d2.selectByVisibleText("Automobile");
		
		//first name local
	    driver.findElement(By.name("firstNameLocal")).sendKeys("Ani");
	    
		//Last name local
	    driver.findElement(By.name("lastNameLocal")).sendKeys("Sam");
	    
	    //salutation
	    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("test");
	    
	    //birthdate
	    driver.findElement(By.name("birthDate")).sendKeys("03/30/1997");
	    
	    //Title
	    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Organization");
	    
	    //Department
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT Testing domain");
	    
	    //annual revenue
	    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
	    
	    //industry
	    WebElement industrydropdown= driver.findElement(By.id("createLeadForm_industryEnumId"));
	    Select d3= new Select(industrydropdown);
		d3.selectByVisibleText("Aerospace");
		
		//Number of employees
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		
		//ownership
	    WebElement ownershipdropdown= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select d4= new Select(ownershipdropdown);
		d4.selectByVisibleText("Partnership");
		
		//SIC code
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1029384");
		
		//Ticker symbol
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("testing");
		
		//description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi This is my first selenium program");
		
		//Notes
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("This is my week2 day1 assignment");
		
		//Country code
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("100");
		
		//phone number
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("0192837465");
		
		//extension
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		
		//person to ask for
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Lead");
		
		//email id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anisam@gmail.com");
		
		//web url
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/crmsfa/");
		
		//toname
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("testleaf");
		
		//attention name
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("test attention name");
		
		//address line 1
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No.3");
		
		//address line 2
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Gandhi street");
		
		//city
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		
		//state/province
	    WebElement statedropdown= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select d5= new Select(statedropdown);
		d5.selectByVisibleText("Arizona");
		
		//zip code
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600123");
		
		//zip/postal extension
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("019283");
				
		//Create lead button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Click duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//Clear existing Company name
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		Thread.sleep(1000);
		
		//Enter new company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		Thread.sleep(1000);
		
		//Create lead button
	     driver.findElement(By.className("smallSubmit")).click();
	     
	    //get text
	     String text3 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	     System.out.println(text3);
	 	Thread.sleep(5000);    
		
		driver.close();

	}

}
