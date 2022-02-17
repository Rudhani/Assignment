package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/img)[1]")).click();
		String title=driver.getTitle();
		System.out.println("Link 1 Title : "+title);
		
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/img)[2]")).click();
		String title1=driver.getTitle();
		System.out.println("Link 2 Title : "+title1);
		
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/img)[3]")).click();
		String title2=driver.getTitle();
		System.out.println("Link 3 Title : "+title2);

	}

}
