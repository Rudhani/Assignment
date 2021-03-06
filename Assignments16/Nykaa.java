package Assignments16;
	
	import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class Nykaa {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			//Launch UrL
			String url="https://www.nykaa.com/";
			driver.get(url);
			driver.manage().window().maximize();
			
			//MouseOver on Brands and Search L'Oreal PariS
			WebElement brand=driver.findElement(By.xpath("//a[text()='brands']"));
			Actions builder=new Actions(driver);
			builder.moveToElement(brand).perform();
			driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
			
			//Click L'Oreal PariS
			WebElement paris=driver.findElement(By.linkText("L'Oreal Paris"));
			Actions builder1=new Actions(driver);
			builder1.click(paris).build().perform();
			
			//Check the title contains L'Oreal PariS(Hint-GetTitle)
			String title=driver.getTitle();
			System.out.println(title);
			
			String title1 ="Buy L'Oreal Paris products online at best price on Nykaa | Nykaa";
			
			if(title1.equals(title)) {
				System.out.println("The Page You Gone Is Correct");
			}else {
				System.out.println("The Page You Gone Is Wrong");
			}
			
			//Click sort By and select customer top rated
			driver.findElement(By.className("arrow-icon")).click();
			driver.findElement(By.xpath("(//div[@class='control-value']//span)[4]")).click();
			
			//Click Category and click Hair->Click HairCare->ShamPoo
			driver.findElement(By.className("arrow-icon")).click();
			driver.findElement(By.xpath("//span[text()='Category']")).click();
			driver.findElement(By.xpath("//span[text()='Hair']")).click();
			driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
			driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
			
			//Click->Concern->Color Protection
			driver.findElement(By.xpath("//span[text()='Concern']")).click();
			driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
			
			//check whether the Filter is applied with ShamPoo			
			WebElement filterCheck = driver.findElement(By.xpath("(//div[@id='filters-listing']//div)[3]"));
			String filter = filterCheck.getText();
			System.out.println("FiltersApplied : "+filter);
			
			//Click on L'Oreal PariS CoLour Protect ShamPoo
			driver.findElement(By.xpath("(//div[@class='css-1rd7vky'])[1]")).click();
			
			//GO to the new window and select size as 175ml
			Set<String> windowHandles = driver.getWindowHandles();
			ArrayList<String> value =new ArrayList<String>(windowHandles);
			driver.switchTo().window(value.get(1));
		
			WebElement dropdown = driver.findElement(By.xpath("(//select[@title='SIZE'])"));
			Select drop =new Select(dropdown);
			drop.selectByVisibleText("175ml");
			
			//Print the MRP of the product
			WebElement getMrp = driver.findElement(By.xpath("(//div[@class='css-k400rm']//span)[3]"));
			String Mrp = getMrp.getText();
			System.out.println("MRP :"+Mrp);
			
			//Click on ADD to BAG
			WebElement addToBags = driver.findElement(By.xpath("//span[text()='ADD TO BAG']/.."));
			addToBags.click();
			
			//Go to Shopping Bag
			driver.findElement(By.xpath("//span[@class='cart-count']//..")).click();
			Thread.sleep(2000);
			
			//Print the Grand Total amount
			driver.switchTo().frame(0);
			String grandTotal = driver.findElement(By.xpath("//div[@class='first-col']")).getText();
			System.out.println(grandTotal);
			
			//Click Proceed
			driver.findElement(By.xpath("//span[text()='PROCEED']//..//..")).click();
			
			//Click on Continue as Guest
			driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
			
			//Check if this grand total is the same
			if(Mrp.equals(grandTotal)) {
				System.out.println("The Grand Total Is Same");
			}else {
				System.out.println("The Grand Total Is Not Same");
			}
			
			//Close all windows
			driver.quit();
			
		}

}


