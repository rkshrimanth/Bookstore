package Selenium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Rajanikanth\\Desktop\\url.txt"));
		  
       java.lang.String url = reader.readLine();
        //String searchTerm = reader.readLine();
        reader.close();
		  
        
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class=\"nav-a  \"][@data-csa-c-slot-id=\"nav_cs_5\"]")).click();

//        // Find the search box element by its name attribute
//        WebElement searchBox = driver.findElement(By.name("field-keywords"));
//		  
//        // Enter the search term
//        searchBox.sendKeys(searchTerm);
//		  
//        // Submit the search form
//        searchBox.submit();
	}}


