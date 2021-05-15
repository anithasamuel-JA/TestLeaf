package incident_Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignIncident {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver =new ChromeDriver(); 

		driver.get("https://dev103117.service-now.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().frame(0);
		Thread.sleep(2000);

		driver.findElement(By.id("user_name")).sendKeys("admin");

		driver.findElement(By.id("user_password")).sendKeys("India@123");

		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		Thread.sleep(5000);

		WebElement searchIncident=driver.findElement(By.id("filter"));
		searchIncident.sendKeys("Incident");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='Create New']")).click();

		Thread.sleep(2000);

		driver.switchTo().frame("gsft_main");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-default')]")).click();
		
		Thread.sleep(2000);
		
		WebElement forTextNum = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']")); 
		new Select(forTextNum).selectByIndex(1);

		WebElement searchField=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchField.sendKeys("INC0010928");
		searchField.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		
		driver.findElement(By.linkText("INC0010928")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@data-for='sys_display.incident.assignment_group']//span[1]")).click();
		
		Thread.sleep(2000);
		
		Set<String> newWindow=driver.getWindowHandles();
		List<String> allWindow=new ArrayList<String>(newWindow);
		
		String secondWindow=allWindow.get(1);
		
		driver.switchTo().window(secondWindow);
		
		WebElement forName = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		forName.sendKeys("software");
		Thread.sleep(2000);
		forName.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@sys_id='8a4dde73c6112278017a6a4baf547aa7']")).click();	
		
		driver.switchTo().window(allWindow.get(0));	
		
		driver.switchTo().frame("gsft_main");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@data-for='sys_display.incident.assigned_to']//span[1]")).click();
		
		Thread.sleep(2000);
		
		newWindow=driver.getWindowHandles();
		allWindow=new ArrayList<String>(newWindow);
		
		secondWindow=allWindow.get(1);
		driver.switchTo().window(secondWindow);
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("ITIL User")).click();
		driver.switchTo().window(allWindow.get(0));	
		Thread.sleep(2000);
		
		driver.switchTo().frame("gsft_main");
		Thread.sleep(2000);
		
		driver.findElement(By.id("sysverb_update")).click();
		
		String incidentAssginedgroup = driver.findElement(By.linkText("Software")).getText();
		System.out.println(incidentAssginedgroup);
		
		String incidentAssignedTo = driver.findElement(By.linkText("ITIL User")).getText();
		System.out.println(incidentAssignedTo);

		driver.switchTo().defaultContent();
		
		driver.close();

	}

}
