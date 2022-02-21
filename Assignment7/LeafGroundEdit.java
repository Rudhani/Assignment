package Assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("rudhani@gmail.com");
		
		String str=driver.findElement(By.xpath("//input[@value='Append ']")).getAttribute("value");
		System.out.println(str);
		
		String attribute=driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println(attribute);
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		boolean enabled=driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		
		System.out.println("enabled "+enabled);
		
	}

}
