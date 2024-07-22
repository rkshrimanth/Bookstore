package Mavenprojecttesting.testing1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 
		
		Select sel=new Select(driver.findElement(By.id("dropdown-class-example")));
		List<WebElement> links=sel.getOptions();
		
		for(WebElement options:links)
		{
			System.out.println(options.getText());
		}
		
          sel.selectByVisibleText("Option3");
          
          
          TakesScreenshot ts= (TakesScreenshot)driver;
          File src =ts.getScreenshotAs(OutputType.FILE);
          File des=new File("file.png");
          FileUtils.copyFile(src, des);
          
          WebElement img=driver.findElement(By.cssSelector(".logoClass"));
          
         File SRC1= img.getScreenshotAs(OutputType.FILE);
         File dess=new File("imgg.png");
         FileUtils.copyFile(SRC1, dess);
   
	}

}
