package Assignment6;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("anirudh655@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("NANBANani007");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.name("submit [Continue]"));
	}

}
