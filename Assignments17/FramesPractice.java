package Assignments17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[1]")).sendKeys("Not a Friendly Topic");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement animal=driver.findElement(By.id("animals"));
		Select dropDown=new Select(animal);
		dropDown.selectByVisibleText("Big Baby Cat");
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		driver.close();
		
	}

}
