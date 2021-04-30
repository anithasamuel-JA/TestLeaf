package assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		// username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		// password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// login button
		driver.findElement(By.className("decorativeSubmit")).click();		

		// Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();

		//click on contacts tab
		driver.findElement(By.linkText("Contacts")).click();

		//click on create contact
		driver.findElement(By.linkText("Create Contact")).click();

		//enter first name
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Anitha");

		//enter last name
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("J");

		//Enter first name local
		driver.findElement(By.name("firstNameLocal")).sendKeys("Sam");

		//enter last name local
		driver.findElement(By.name("lastNameLocal")).sendKeys("Manoj"); 	

		//enter department
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Cognizant");

		//enter description:
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is my week2 assignment");
		
		//enter email
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("test@gmail.com");

		//state province
		WebElement statedropdown= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select d1 = new Select(statedropdown);
		d1.selectByVisibleText("New York");
		
		//click on submit button
	    driver.findElement(By.name("submitButton")).click();
	
	    //click on edit button
	    driver.findElement(By.linkText("Edit")).click();

	    //Clear description:
	    driver.findElement(By.id("updateContactForm_description")).clear();

	    //important note
	    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("adding important notes");

	    //update
	    driver.findElement(By.xpath("//input[@value='Update']")).click();

	    //get the title
	    String text= driver.getTitle();
	    System.out.println(text);
	}
}
