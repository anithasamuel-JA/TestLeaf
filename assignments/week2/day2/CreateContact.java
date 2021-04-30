package assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
//		1. Launch URL "http://leaftaps.com/opentaps/control/login"
//		 * 
//		 * 2. Enter UserName and Password Using Id Locator
//		 * 
//		 * 3. Click on Login Button using Class Locator
//		 * 
//		 * 4. Click on CRM/SFA Link
//		 * 
//		 * 5. Click on contacts Button
//		 * 
//		 * 6. Click on Create Contact
//		 *  
//		 * 7. Enter FirstName Field Using id Locator
//		 * 
//		 * 8. Enter LastName Field Using id Locator
//		 * 
//		 * 9. Enter FirstName(Local) Field Using id Locator
//		 * 
//		 * 10. Enter LastName(Local) Field Using id Locator
//		 * 
//		 * 11. Enter Department Field Using any Locator of Your Choice
//		 * 
//		 * 12. Enter Description Field Using any Locator of your choice 
//		 * 
//		 * 13. Enter your email in the E-mail address Field using the locator of your choice
//		 * 
//		 * 14. Select State/Province as NewYork Using Visible Text
//		 * 
//		 * 15. Click on Create Contact
//		 * 
//		 * 16. Click on edit button 
//		 * 
//		 * 17. Clear the Description Field using .clear
//		 * 
//		 * 18. Fill ImportantNote Field with Any text
//		 * 
//		 * 19. Click on update button using Xpath locator
//		 * 
//		 * 20. Get the Title of Resulting Page.

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		// username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		Thread.sleep(2000);
		// password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		// login button
		driver.findElement(By.className("decorativeSubmit")).click();		
		Thread.sleep(2000);
		   Thread.sleep(2000);
		
		// Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		//click on contacts tab
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(2000);
		//click on create contact
		driver.findElement(By.linkText("Create Contact")).click();
		Thread.sleep(2000);
		//enter first name
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Anitha");
		Thread.sleep(2000);
		//enter last name
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("J");
		Thread.sleep(2000);
		//Enter first name local
		driver.findElement(By.name("firstNameLocal")).sendKeys("Sam");
		Thread.sleep(2000);
		//enter last name local
		driver.findElement(By.name("lastNameLocal")).sendKeys("Manoj"); 	
		Thread.sleep(2000);
		
		//enter department
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Cognizant");
		Thread.sleep(1000);
		//enter description:
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is my week2 assignment");
		Thread.sleep(1000);
		
		//enter email
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("www.gmail.com");
		Thread.sleep(1000);
		//state province
		WebElement statedropdown= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select d1 = new Select(statedropdown);
		d1.selectByVisibleText("New York");
		Thread.sleep(1000);
		
		//click on submit button
	    driver.findElement(By.name("submitButton")).click();
	    Thread.sleep(1000);
	
	    //click on edit button
	    driver.findElement(By.linkText("edit")).click();
	    Thread.sleep(1000);
	    //Clear description:
	    driver.findElement(By.id("createContactForm_description")).clear();
	    Thread.sleep(1000);
	    //important note
	    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("adding important notes");
	    Thread.sleep(1000);
	    //update
	    driver.findElement(By.xpath("//input[@value='Update']")).click();
	    Thread.sleep(1000);
	    //get the title
	    String text= driver.getTitle();
	    System.out.println(text);
	}

}
