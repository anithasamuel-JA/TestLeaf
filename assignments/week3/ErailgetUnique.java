package week3.day2.assignments;

		import java.util.ArrayList;
		import java.util.List;
		import java.util.Set;
		import java.util.TreeSet;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class ErailgetUnique {

			public static void main(String[] args) throws InterruptedException {

			
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://erail.in/");
				driver.manage().window().maximize();


				driver.findElement(By.id("chkSelectDateOnly")).click();


				WebElement fromStation = driver.findElement(By.xpath("//input[@title='Type SOURCE station code or name']"));
			
				fromStation.clear();
				fromStation.sendKeys("TPJ");
				fromStation.sendKeys(Keys.TAB);


				WebElement toStation = driver.findElement(By.xpath("//input[@title='Enter DESTINATION station code or name']"));
				// driver.findElement(By.xpath("//input[@placeholder='To Station']"));
				toStation.clear();
				toStation.sendKeys("MMK");
				toStation.sendKeys(Keys.TAB);


				Thread.sleep(1000);


				driver.findElement(By.id("buttonFromTo")).click();

				System.out.println("--- Train Details ---");


				List<WebElement> eleTrainList = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]//td[2]"));
				List<String> trainName = new ArrayList<String>();
				for (int i = 0; i < eleTrainList.size(); i++) {
					// System.out.println(trainName);

					trainName.add(eleTrainList.get(i).getText());
				}

				System.out.println("Train count: " + eleTrainList.size());


				Set<String> set = new TreeSet<String>(trainName);

				set.addAll(trainName);


				System.out.println("Set of Size:" + trainName.size());

			}

		
		
	}


