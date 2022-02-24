package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String url="http://www.leafground.com/pages/selectable.html";
		driver.get(url);
		
		WebElement iteam1=driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement iteam2=driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement iteam3=driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement iteam4=driver.findElement(By.xpath("//li[text()='Item 7']"));
		
		Actions bulider=new Actions(driver);
		bulider.keyDown(Keys.CONTROL).click(iteam1).click(iteam2).click(iteam3).click(iteam4).release().perform();
		
		
	}

}
