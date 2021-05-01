package assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver"); 
		WebDriver driver = new ChromeDriver();
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
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
		
		//enter first name
		driver.findElement(By.xpath("(//div/input[@name='firstName'])[3]")).sendKeys("Anitha");
		
		//click on find leads button
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	        Thread.sleep(1000);
	        
	     driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
	        
	      String text=driver.getTitle();
	      System.out.println(text);
	      Thread.sleep(1000);
	      
	      driver.findElement(By.xpath("//a[text()='Edit']")).click();
	      
	      driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
	      
	      driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Amazon");
	      
	      driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
	      
	      String text2= driver.findElement(By.xpath("//div[@class='fieldgroup']//div//table//tbody//tr//span[@id='viewLead_companyName_sp']")).getText();
	      System.out.println(text2);
	      Thread.sleep(2000);
	      driver.close();
	      

		
		
	}

}
