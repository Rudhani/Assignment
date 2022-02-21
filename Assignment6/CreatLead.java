package Assignment6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title = driver.getTitle();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("WIPRO MANAGEMENT");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anirudh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anirudh");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");
		
		WebElement inputBox=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select a=new Select(inputBox);
		a.selectByIndex(4);
		
		WebElement inputbox2=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select b=new Select(inputbox2);
		b.selectByIndex(2);
		
		WebElement inputbox3=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select c=new Select(inputbox3);
		c.selectByIndex(4);
		
		//driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("22/08/97");
		driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Computer Software");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("952450598");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rudhani88@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Anirudh");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("West circular road");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Mylapore");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamilnadu");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("612001");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
}
