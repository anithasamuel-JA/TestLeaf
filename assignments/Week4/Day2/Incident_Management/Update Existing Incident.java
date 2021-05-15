package week4.day2.assignments.incident_management;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdateExistingIncident {

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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Incidents']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("INC0011248");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Incidents']")).click();

		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();

		Select urgency = new Select(driver.findElement(By.id("incident.urgency")));
		urgency.selectByVisibleText("1 - High");
		Select state = new Select(driver.findElement(By.id("incident.state")));
		state.selectByVisibleText("In Progress");
		driver.findElement(By.id("sysverb_insert_bottom")).click();

		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("INC0011248");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
		
		String urgencyText = driver.findElement(By.xpath("//select[@id='incident.urgency']//option[@selected='SELECTED']")).getText();
		String stateText = driver.findElement(By.xpath("//select[@id='incident.state']//option[@selected='SELECTED']")).getText();
		
		if (urgencyText.equals("1 - High") && stateText.equals("In Progress")) {
				System.out.println("Urgency and State is updated as expected");
		} 
		else {
			System.out.println("Urgency and State is not updated as expected");
		}
	}
}
