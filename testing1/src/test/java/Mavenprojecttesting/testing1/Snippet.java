package Mavenprojecttesting.testing1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snippet {
	 //Creating instance of Chrome driver
	        
	        public static void main(String[] args) throws InterruptedException {
	        	//WebDriverManager.chromedriver().setup();
	    		WebDriver driver=new FirefoxDriver();
			
	
	        //Step#2- Launching URL
	        driver.get("https://demoqa.com/select-menu");
	
	        //Maximizing window
	        driver.manage().window().maximize();
	
	        //Step#3- Selecting the dropdown element by locating its id
	        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
	        Thread.sleep(2000);
	        //Step#4- Printing the options of the dropdown
	        //Get list of web elements
	        List<WebElement> lst = select.getOptions();
	        Thread.sleep(2000);
	        //Looping through the options and printing dropdown options
	        System.out.println("The dropdown options are:");
	        for(WebElement options: lst)
	            System.out.println(options.getText());
	       Thread.sleep(2000);
	     
	        //Step#5- Selecting the option as 'Purple'-- selectByIndex
	        System.out.println("Select the Option by Index 4");
	        select.selectByIndex(4);
	        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
	        Thread.sleep(2000);
	        /*   	  
	        //Step#6- Selecting the option as 'Magenta'-- selectByVisibleText
	        System.out.println("Select the Option by Text Magenta");
	        select.selectByVisibleText("Magenta");
	        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
	        Thread.sleep(2000);
	        
	        //Step#7- Selecting an option by its value
	        System.out.println("Select the Option by value 6");
	        select.selectByValue("6");
	        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
	*/
	       // driver.quit();
	    }
	
	}


