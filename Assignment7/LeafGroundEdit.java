package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("rudhani@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Append");
		driver.findElement(By.xpath("//input[@value='TestLeaf']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("Clear me");
		driver.findElement(By.xpath("//input[@disabled='true']")).sendKeys("Disabled");
		
		
		
	}

}
