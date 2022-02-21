package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		String text=driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).getText();
		String text1="Selenium";
		
		if(text1.equals(text)) {
			System.out.println("correct");
		}
		else {
			System.out.println("Not correct");
		}
		driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
		
		driver.close();
	}

}
