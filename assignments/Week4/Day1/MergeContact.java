package week4.day1.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
ChromeDriver driver= new ChromeDriver();
		
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
		
		//click on merge contact 
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//click on first widget
		driver.findElement(By.xpath("//span[text()='From Contact']/following::img")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		List<String> listofWindows=new ArrayList<String>(allWindows);
		
		driver.switchTo().window(listofWindows.get(1));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='10264']")).click();
		Thread.sleep(1000);
		
		driver.switchTo().window(listofWindows.get(0));
		Thread.sleep(1000);
		//click on second widget
		driver.findElement(By.xpath("(//span[text()='To Contact']/following::img)[1]")).click();
		Thread.sleep(1000);
		
		allWindows=driver.getWindowHandles();
		listofWindows=new ArrayList<String>(allWindows);
		
		driver.switchTo().window(listofWindows.get(1));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='10265']")).click();
		Thread.sleep(1000);
		
		driver.switchTo().window(listofWindows.get(0));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
		
		
	}
