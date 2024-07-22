package Selenium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//public class RRR {

	//public static void main(String[] args) {
	
	
//WebDriver driver=new ChromeDriver();
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

public class RRR {
    public static void main(String[] args) throws IOException {
        // Set path to chromedriver.exe
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Open a website
        driver.get("https://www.google.com");
        
        
        
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.manage().window().maximize();
        TakesScreenshot ts = (TakesScreenshot)driver;
        
      File src= ts.getScreenshotAs(OutputType.FILE);
      File trg=new File("screen.png");
      FileUtils.copyFile(src,trg);
        
        
//        // Take screenshot
//        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        
//        try {
//            // Save the screenshot
//            FileUtils.copyFile(screenshotFile, new File("screenshot.png"));
//            System.out.println("Screenshot saved successfully.");
//        } catch (Exception e) {
//            System.out.println("Failed to save screenshot: " + e.getMessage());
//        }
        
        // Close the browser
  //      driver.quit();
      
      
      WebElement ele= driver.findElement(By.xpath(""));
      
      Select drp= new Select(ele);
      
      drp.selectByIndex(0);
    }
}
 


