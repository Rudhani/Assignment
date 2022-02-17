package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		String text=driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).getText();
		String text1="Selenium";
		
		if(text.equals(text1)) {
			System.out.println("Selenium");
		}
		else {
			System.out.println("Selenium is not checked");
		}
			
	}

}
