package Assignments16;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Load the uRL
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//search as OnePlus 9 pro 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();

		//Get the price of the first product
		WebElement firstProduct= driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String price=firstProduct.getText();
		System.out.println("Price of the First Product: "+price);
		
		//Print the number of customer ratings for the first displayed product
		String ratings=driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("No of Customer Ratings: "+ratings);
		
		//click on the stars
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-popover'])[1]")).click();
		
		//Get the percentage of ratings for the 5 star
		String star=driver.findElement(By.xpath("//a[contains(text(),'65%')]")).getText();
		System.out.println("5 Star Percentage of : "+star);
		
		//Click the first text link of the first image
		driver.findElement(By.xpath("//span[contains(text(),'OnePlus 9 Pro 5G (Morning Mist, 12GB RAM, 256GB Storage)')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> value =new ArrayList<String>(windowHandles);
		driver.switchTo().window(value.get(1));
		
		//Take a screen shot of the product displayed
		File source=driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./SnapShot/Amazon.png");
		FileUtils.copyFile(source, destination);
		
		//Click 'Add to Cart' button
		driver.findElement(By.id("add-to-cart-button")).click();
		
		// Get the cart subTotal and verify if it is correct
		String subTotal=driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
				
		if(subTotal.equals(price)) {
			System.out.println("The verify is correct");
		}else {
			System.out.println("The verify is not correct");
		}
		
		
		
		
	}

}
