package Assignments16;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		
		//notification disable
		ChromeOptions options=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Launch the UrL
		String url="https://www.snapdeal.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div/button[@id='pushDenied']")).click();
		
		//Go to Mens fashion
		Thread.sleep(1000);
		WebElement mens=driver.findElement(By.linkText("Men's Fashion"));
		Actions builder=new Actions(driver);
		builder.moveToElement(mens).perform();
		
		//Go to Sports shoes
		WebElement sportShoes=driver.findElement(By.linkText("Sports Shoes"));
		Actions builder1=new Actions(driver);
		builder1.click(sportShoes).build().perform();
		
		//Get the count of the sports shoes
		WebElement sportShoesCount= driver.findElement(By.xpath("//div[@class='child-cat-name selected']/following-sibling::div"));
		String count=sportShoesCount.getText();
		System.out.println(count);
		
		//click training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//sort by Low to High
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		Thread.sleep(1000);
		
		//Check if items displayed are sorted correctly
		List<WebElement> product=driver.findElements(By.xpath("//div[@id='products']//span[@class='lfloat product-price']"));
		int size=product.size();
		System.out.println(size);
		
		for(int i=1;i<=size;i++) {
			WebElement sortPrice=driver.findElement(By.xpath("(//span[@class='lfloat product-price'])["+i+"]"));
			String text=sortPrice.getText();
			System.out.println(text);	
		}
		
		//Select the price range 900 to 1200
		WebElement from= driver.findElement(By.xpath("//input[@name='fromVal']"));
		from.clear();
		from.sendKeys("900");
		WebElement to= driver.findElement(By.xpath("//input[@name='toVal']"));
		to.clear();
		to.sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
		//Filter with color navy
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		
		//verify the all applied filters
		Thread.sleep(1000);
		WebElement verifyFilters=driver.findElement(By.xpath("(//div[@class='filters'])[1]"));
		String text=verifyFilters.getText();
		System.out.println("Filter Applied: "+text+" ");
		
		//Mouse Hover on first resulting Training shoes
		Thread.sleep(1000);
		WebElement navyShoes1=driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]"));
		Actions builder2=new Actions(driver);
		builder2.moveToElement(navyShoes1).build().perform();
		
		//click QuickView button
		driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]")).click();
		
		//Print the cost and the discount percentage
		WebElement cost=driver.findElement(By.xpath("//div[@class=' pdp-e-i-PAY clearfix']"));
		String discount=cost.getText();
		System.out.println("Cost & Discount: "+discount);
		
		//Take the snapshot of the shoes
		File source=driver.getScreenshotAs(OutputType.FILE);
		File diestinaton=new File("./SnapShot/snapdeal.png");
		FileUtils.copyFile(source, diestinaton);
		
		//Close the current window
		driver.close();
		
		//Close the main window
		driver.quit();
	}

}
