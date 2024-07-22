package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Onee {

	
	 
	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.nasdaq.com/");
		
		driver.manage().window().maximize();
		
driver.findElement(By.xpath("//input[@placeholder='Search for symbols, news or products'][@ aria-label='Search Button - Click to open the Search Overlay Modal Box']")).click();
		
//Alert al=driver.switchTo().alert();
//al.accept();
         WebElement element = driver.findElement(By.xpath("(//div[@class='nasdaq-search-overlay__text'])[8]"));
         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='nasdaq-search-overlay__search-results']//a"));
		
		for(int i=0;i<=links.size()-1;i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src =ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("scr.png");
		FileUtils.copyFile(src,trg);

}
}