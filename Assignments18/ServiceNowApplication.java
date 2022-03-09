package Assignments18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowApplication {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//Get UrL
		driver.get("https://dev98106.service-now.com/");
		
		//Login the page
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("vOIqreWIwH47");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		
		//Click create new
		driver.findElement(By.id("filter")).sendKeys("create new");
		driver.findElement(By.linkText("Create New")).click();
		
		
		//fill the mandatory fields
		driver.switchTo().frame("gsft_main");
		WebElement caller= driver.findElement(By.id("sys_display.incident.caller_id"));
		caller.sendKeys("abraham.lincoln@example.com");
		caller.click();
		WebElement description=driver.findElement(By.id("incident.short_description"));
		description.sendKeys("Issue with a web page");
		driver.findElement(By.id("sysverb_insert")).click();
		driver.switchTo().defaultContent();
		
		//to get the incident number and verify for future
				WebElement number=driver.findElement(By.xpath("//input[@id='incident.number']"));
				String attribute=number.getAttribute("value");
				System.out.println(attribute);
		
		//copy the incident number and paste it in search field and enter then verify the instance number created or not
		driver.switchTo().frame(0);
		WebElement searchInciNo = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		searchInciNo.sendKeys(attribute);
		Thread.sleep(2000);
		searchInciNo.sendKeys(Keys.ENTER);
		
		//to get the incident number for verification
		WebElement verifyNo = driver.findElement(By.xpath("//td[@class='vt']//a"));
		String iccNo = verifyNo.getText();
		System.out.println(iccNo);
		driver.switchTo().defaultContent();
		
		// verify the instance number created or not)
		if(attribute.equals(iccNo)) {
			System.out.println("The Instance Is Created");
		}else {
			System.out.println("The Instance Is Not Created");
		}
		

		
		
	}

}
