package Assignments16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		String url="https://www.snapdeal.com/";
		driver.get(url);
		driver.findElement(By.xpath("//div/button[@id='pushDenied']")).click();
		
		Thread.sleep(1000);
		WebElement mens=driver.findElement(By.linkText("Men's Fashion"));
		Actions builder=new Actions(driver);
		builder.moveToElement(mens).perform();
		
		WebElement shoes=driver.findElement(By.linkText("Sports Shoes"));
		Actions builder1=new Actions(driver);
		builder1.click(shoes).build().perform();
		
		//List<WebElement> shoesCount=driver.findElements(By.xpath("//div[@class='child-cat-name selected']/following-sibling::div"));
		//int size=shoesCount.size();
		//System.out.println("Count of Sports Shoes For men's: "+ size);
		
		//String title=driver.getTitle();
		//System.out.println(title);
		
		WebElement trainingShoes=driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		Actions builder2=new Actions(driver);
		builder2.click(trainingShoes).build().perform();
		
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");
		
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		
		
		
		WebElement navyShoes1=driver.findElement(By.xpath("(//div[@class='clearfix row-disc']//div)[1]"));
		Actions builder4=new Actions(driver);
		builder4.moveToElement(navyShoes1).build().perform();
		
		String rate=driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']")).getText();
		System.out.println("Rs: "+rate);
		
		
	}

}
