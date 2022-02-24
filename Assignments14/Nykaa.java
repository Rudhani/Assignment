package Assignments14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		String url="https://www.nykaa.com/";
		driver.get(url);
		
		WebElement brand=driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(brand).perform();
		
		WebElement paris=driver.findElement(By.linkText("L'Oreal Paris"));
		Actions builder1=new Actions(driver);
		builder1.click(paris).build().perform();
		
		String title1=driver.getTitle();
		System.out.println(title1);
		
		driver.close();
		
	}

}
