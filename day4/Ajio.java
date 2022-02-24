package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String url="https://www.ajio.com/";
		driver.get(url);
		
		WebElement men=driver.findElement(By.xpath("//a[@title='MEN']"));
		
		Actions builder=new Actions(driver);
		builder.moveToElement(men).perform();
		
		driver.findElement(By.xpath("(//a[@title='Shirts'])[1]")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		driver.findElement(By.xpath("//label[@for='Men - Shirts']")).click();
		driver.findElement(By.xpath("//span[text()='price']")).click();
		driver.findElement(By.xpath("//label[@for='Below Rs.500']")).click();

	}

}
