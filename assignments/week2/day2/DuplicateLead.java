package assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		
		//click on leads
		driver.findElement(By.linkText("Leads")).click();

		//click on find leads
		driver.findElement(By.linkText("Find Leads")).click();

		//click on email 
		driver.findElement(By.xpath("//span[text()='Email']")).click();

		//enter email address
		driver.findElement(By.name("emailAddress")).sendKeys("test@gmail.com");

		//click on find button
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    
    //capture first id
    String LeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();
    System.out.println("LeadID : " + LeadID);
    Thread.sleep(1000);
    
    //click First Resulting lead
    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();;
    Thread.sleep(1000);
    
    //get the name
    String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
    
    //click Duplicate Lead
    driver.findElement(By.linkText("Duplicate Lead"));
        
		//Verify the title as Duplicate Lead
    String duplicate = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
    System.out.println(duplicate);
        
		//click create lead
    driver.findElement(By.className("smallSubmit")).click();

		//Get the duplicate lead name
    String dup_name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
    
    //Confirm the duplicate name
    if(name==dup_name) {
	    	System.out.println("Duplicate name is same as original name");
    }
    else {
	    	System.out.println("Duplicate name and original name are different");
    }
    driver.close();
	}
}
