package week4.day1.assignments;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NykaaApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		
		Actions actions=new Actions(driver);
		org.openqa.selenium.interactions.Action brand=actions.moveToElement(driver.findElement(By.xpath("//a[text()='brands']"))).build();
		brand.perform();
		
		org.openqa.selenium.interactions.Action popular=actions.moveToElement(driver.findElement(By.xpath("//a[text()='Popular']"))).build();
		popular.perform();
		
		driver.findElement(By.xpath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		List<String> listofWindows=new ArrayList<String>(allWindows);
		
		driver.switchTo().window(listofWindows.get(1));
		Thread.sleep(2000);
		String title = driver.getTitle();
		if(title.contains("L'Oreal Paris")){
			System.out.println("Title is L'Oreal Paris");
		}
		
		driver.findElement(By.xpath("//span[text()='Sort By : ']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='pull-right filter-options-toggle']")).click();
		driver.findElement(By.xpath("//div[@class='filter-options-toggle']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//div[@class='control__indicator']")).click();
		String text = driver.findElement(By.xpath("//ul[@class='pull-left applied-filter-lists']/li")).getText();
		
		if(text.contains("Shampoo")) {
			System.out.println("Filtered Shampoo");
		}
		Thread.sleep(2000);
    
		driver.findElement(By.xpath("//a[@href='/l-oreal-paris-color-protect-shampoo/p/6282?ptype=product&productId=6282&skuId=6282&categoryId=595&pps=11']")).click();
		
		allWindows = driver.getWindowHandles();
		listofWindows=new ArrayList<String>(allWindows);
		
		driver.switchTo().window(listofWindows.get(2));
		Thread.sleep(2000);
    
		driver.findElement(By.xpath("//span[text()='175ml']")).click();
		String price = driver.findElement(By.xpath("//span[@class='post-card__content-price-offer']")).getText();
		price=price.replaceAll("\\D", "").trim();
		System.out.println("Price/MRP of Shampoo is:"+price);
		
		driver.findElement(By.xpath("//button[text()='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//div[@class='AddBagIcon']")).click();
		
		Thread.sleep(2000);

		String grandTotal1 = driver.findElement(By.xpath("//div[text()='Grand Total']/following::div")).getText();
		grandTotal1=grandTotal1.replaceAll("\\D", "").trim();
		int grandTotal=Integer.parseInt(grandTotal1);
		System.out.println("Grand Total:"+grandTotal);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn full fill no-radius proceed ']")).click();
		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
		
		String total1 = driver.findElement(By.xpath("//div[text()='Grand Total']/following::span")).getText();
		total1=total1.replaceAll("\\D", "").trim();
		int total=Integer.parseInt(total1);
		System.out.println("Grand Total at the end:"+total);
		
		if(grandTotal==total) {
			System.out.println("Price amount is same");
		}
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
