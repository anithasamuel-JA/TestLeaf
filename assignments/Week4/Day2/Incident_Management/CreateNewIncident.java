package week4.day2.assignments.incident_management;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewIncident {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://dev103117.service-now.com");
		driver.manage().window().maximize();	
		
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("India@123");
		driver.findElement(By.id("sysverb_login")).click();
		
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("Incident");
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("(//div[text()='Create New'])[1]")).click();
		driver.switchTo().frame("gsft_main");
		String number = driver.findElement(By.id("incident.number")).getAttribute("value");
		driver.findElement(By.id("sys_display.incident.caller_id")).sendKeys("Guest");
		Thread.sleep(2000);
		driver.findElement(By.id("sys_display.incident.caller_id")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("incident.short_description")).sendKeys("test scenario 1");
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(number);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
		
		String number2 = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		if(number.equals(number2)) {
			System.out.println("Incident created successfully");
		}
		else {
			System.out.println("Incident not created");
		}
	}

}
