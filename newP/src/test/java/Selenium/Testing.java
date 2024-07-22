package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing {

    private WebDriver driver;
    

    @Parameters({ "browser", "url" })
    @BeforeTest
    public void launch(String browser, String url) {
        if (browser.equals("chrome")) {
            // System.setProperty("webdriver.chrome.driver", "E:\\Automation\\newP\\Library\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
           
        }

        driver.get(url);
        driver.manage().window().maximize();
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
            { "admin1", "manager1" },
            { "admin1", "manager1" },
            // Add more test data as needed
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
    	
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.name("pwd"));
        WebElement loginButton = driver.findElement(By.linkText("Login"));
        
        
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
        driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
       // logout.click();
        
       

        // You may want to add assertions or validation steps here to verify login success or failure.
    }
    
    @AfterTest
    public void closebrowser()
    {
    	driver.close();
    }
}




		
	


