package assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		1	Launch the browser
//		2	Enter the username
//		3	Enter the password
//		4	Click Login
//		5	Click crm/sfa link
//		6	Click Leads link
//		7	Click Find leads
//		8	Click on Phone
//		9	Enter phone number
//		10	Click find leads button
//		11	Capture lead ID of First Resulting lead
//		12	Click First Resulting lead
//		13	Click Delete
//		14	Click Find leads
//		15	Enter captured lead ID
//		16	Click find leads button
//		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
//		18	Close the browser (Do not log out)
//	
		
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

		//click on phone number
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		//enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("9988776655");

		//click on find button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//capture first id
		String LeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();
		System.out.println("LeadID : " + LeadID);
		Thread.sleep(1000);
		
		//click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();;
		Thread.sleep(1000);
		
		//click Delete
		driver.findElement(By.linkText("Delete"));
        
		//click on find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//enter captured lead ID
		driver.findElement(By.name("id")).sendKeys(LeadID);

		//click on find button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
        	boolean status = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();

        	if (status) {
        		System.out.println("This message confirms the successful deletion of the mentioned Lead Id");
		} 
        
        	else {
			System.err.println("Deletion step failed");
		}
		
        	driver.close();
	}

}
