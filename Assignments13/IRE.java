package Assignments13;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRE {
	
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String url="https://erail.in/";
		driver.get(url);
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("ms");
		driver.findElement(By.className("selected")).click();
		
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("mdu");
		driver.findElement(By.xpath("//div[@title='Madurai Jn']")).click();
		
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		driver.findElement(By.xpath("//tr//td[@onclick='DoDateSelect(1645641000000)']")).click();
		
		java.util.List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		int rowCount = findElements.size();
		System.out.println(rowCount);
		
		for(int i=1;i<rowCount;i++) {
			
			String trainNo=driver.findElement(By.xpath("//div[@id='divTrainsList']//tr["+i+"]/td[1]")).getText();
			String trainName=driver.findElement(By.xpath("//div[@id='divTrainsList']//tr["+i+"]/td[2]")).getText();
			System.out.println("Train No: "+trainNo+" "+"Train Name: "+trainName);
		}
		
		
		
		
		
		
	}

}
