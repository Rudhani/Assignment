package Assignments13;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTableInteractions {

	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		String url = "http://www.leafground.com/pages/table.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement eletable = driver.findElement(By.id("table_id"));
		List<WebElement> allRows = eletable.findElements(By.tagName("tr"));

		List<WebElement> allCols;
		
		List<String> percentage=new ArrayList<String>();

		for(int i=0;i<allRows.size();i++)
		{
			if(i==0)
			{
				allCols = allRows.get(i).findElements(By.tagName("th"));
			}
			else
			{
				allCols = allRows.get(i).findElements(By.tagName("td"));
			}
			for(int j=0;j<allCols.size();j++)
			{
				String text = allCols.get(j).getText();
				if(j==1 && i!=0)
				{
					percentage.add(text);
				}
				System.out.print(text+"\t");
			}
			
			System.out.println();
		}

		int min = 0;
		
		for(int i=0;i<percentage.size();i++)
		{
			int result = Integer.parseInt(percentage.get(i).replaceAll("%", ""));
			if(i==0)
				min=result;
			else if(result<min)
				min=result;
		}
		
		System.out.println(min);
		
		driver.findElement(By.xpath("//td[contains(text(),'"+min+"')]/following-sibling::td[1]/input")).click();
	}

}
