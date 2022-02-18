package Assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Anirudh");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("anirudh@gmail.com");
		driver.findElement(By.xpath("//select[@name='UserTitle']/option[@value='Sales_Manager_AP']")).click();
		driver.findElement(By.xpath("//select[@name='CompanyEmployees']/option[@value='9']")).click();
		driver.findElement(By.xpath("//select[@name='CompanyCountry']/option[@value='IN']")).click();
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("kekaran makaran company");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9876543210");
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();
		
		String text=driver.findElement(By.xpath("//button[@name='start my free trial']")).getText();
		String text1="START MY FREE TRIAL";
		
		if(text.equals(text1)) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case not pass");
			
		}
		driver.close();
	}

}
