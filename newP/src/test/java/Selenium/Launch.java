package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Launch {
//public static void main(String[] args) {
	
	WebDriver driver;
	@Test
	public void duplicate() throws IOException {
		driver=new ChromeDriver();
		driver.get("https://talent.testgorilla.com/assessments");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 TakesScreenshot ts= (TakesScreenshot)driver;
		 
		 File src =ts.getScreenshotAs(OutputType.FILE);
		 File des=new File("SCREEN.png");
		 FileUtils.copyFile(src, des);
		
		//driver.close();
		 System.out.println(driver.getWindowHandle());
		 
		 //String act="sss";
		// String expected="sss";
		// Assert.assertEquals(act, expected);
		WebElement dd=driver.findElement(By.xpath(""));
		 Select sel=new Select(dd);
		 
		 sel.selectByValue("");
		 sel.selectByVisibleText("");
		 sel.selectByIndex(0);
		 
		 Actions ac=new Actions(driver);
	
}
	
}