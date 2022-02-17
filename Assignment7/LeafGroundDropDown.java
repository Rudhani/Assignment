package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement DropDown1=driver.findElement(By.id("dropdown1"));
		Select index=new Select(DropDown1);
		index.selectByIndex(1);
		
		WebElement DropDown3=driver.findElement(By.name("dropdown2"));
		Select text1=new Select(DropDown3);
		text1.selectByValue("2");
		
		WebElement DropDown2=driver.findElement(By.id("dropdown3"));
		Select value=new Select(DropDown2);
		value.selectByValue("3");
		
		driver.close();
		
		System.out.println("Test case : pass");

	}

}
