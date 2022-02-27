package Assignments15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class ReSize {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://jqueryui.com/resizable");
		
		driver.switchTo().frame(0);
		WebElement size= driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(size, 50, 60).build().perform();
		driver.switchTo().defaultContent();
		
	}
}
