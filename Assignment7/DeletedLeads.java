package Assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeletedLeads {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		
	    driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
	    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Rek");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    
	    Thread.sleep(2000);
	    
	    String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).getText();
	    System.out.println(text);
	    
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
	    driver.findElement(By.linkText("Delete")).click();
	   
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.name("id")).sendKeys(text);
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    
	    String text1= driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
	    System.out.println(text1);
	    driver.close();

				
	}
}
