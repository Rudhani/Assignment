package Assignment8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Anirudh");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anirudh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anirudh@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Anirudh@007");
		driver.findElement(By.xpath("//select[@name='country_id']/option[@value='99']")).click();
		
		String text=driver.findElement(By.xpath("(//button[@type='submit'])[1]")).getText();
		String text1="REGISTER";
		
		if(text.equals(text1)) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case not pass");
		}
		driver.close();
	}

}
