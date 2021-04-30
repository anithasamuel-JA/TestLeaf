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
		
		//click on leads
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		//click on find leads
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		//click on phone number
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		Thread.sleep(2000);
		//enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("9876543212");
		Thread.sleep(2000);
		//click on find button
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(2000);
        //capture first id
        
		
		
	}

}
