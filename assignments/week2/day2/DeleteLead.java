package assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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

		//click on phone number
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		//enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("9988776655");

		//click on find button
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(1000);

        //capture first id
        String LeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();
        System.out.println("LeadID : " + LeadID);
        Thread.sleep(1000);

        //click First Resulting lead
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();;
        Thread.sleep(1000);

        //click Delete
        driver.findElement(By.linkText("Delete")).click();
        
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
	}
}
