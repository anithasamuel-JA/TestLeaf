package week3.day2.assignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class erail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://erail.in/l");
		driver.manage().window().maximize();
		
		WebElement fromstation= driver.findElement(By.id("txtStationFrom"));
		fromstation.clear();
		fromstation.sendKeys("Egmore");
		fromstation.sendKeys(Keys.TAB);
		
		Thread.sleep(1000);
		
		WebElement Tostation= driver.findElement(By.id("txtStationTo"));
		Tostation.clear();
		Tostation.sendKeys("Mayiladuturai");
		Tostation.sendKeys(Keys.TAB);
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		Thread.sleep(1000);
				
		List<WebElement> TrainList = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]//td[2]"));
		System.out.println("Train count: " + TrainList.size());
		// Thread.sleep(2000);

		ArrayList<String> trainName = new ArrayList<String>();
		for (int i = 0; i < TrainList.size(); i++) {
			// System.out.println(trainName);

			trainName.add(TrainList.get(i).getText());



		}
		Collections.sort(trainName);
		System.out.println("Ascending order using Collection.sort: ");

		// for Each(System.out::println) -> each value needs to print in next line
		trainName.forEach(System.out::println);

	}

}
