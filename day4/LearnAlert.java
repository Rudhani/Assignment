package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		String url="http://www.leafground.com/pages/Alert.html";
		driver.get(url);
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(3000);
		Alert alert2=driver.switchTo().alert();
		alert2.accept();

		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Thread.sleep(3000);
		Alert alert3=driver.switchTo().alert();
		alert3.accept();
		
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		Thread.sleep(3000);
		Alert alert4=driver.switchTo().alert();
		alert4.accept();
		
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		Thread.sleep(3000);
		Alert alert5=driver.switchTo().alert();
		alert5.accept();
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(3000);
		Alert alert6=driver.switchTo().alert();
		alert6.accept();
	}

}
