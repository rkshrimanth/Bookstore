package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ParameterizationfromExcelfile {

    private WebDriver driver;

    @Parameters({"browser", "url"})
    @BeforeTest
    public void launch(String browser, String url) {
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "E:\\Automation\\newP\\Library\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.get(url);
    }

    @Test(dataProvider = "excelData")
    public void loginTest(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.name("pwd"));
        WebElement loginButton = driver.findElement(By.linkText("Login"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        // You may want to add assertions or validation steps here to verify login success or failure.
    }

    @org.testng.annotations.DataProvider(name = "excelData")
    public Object[][] getExcelData() throws IOException {
        String excelFilePath = "D:\\RSK\\testdata.xlsx"; // Provide the path to your Excel file
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

        int rowCount = sheet.getPhysicalNumberOfRows();
        int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rowCount - 1][columnCount]; // Exclude header row

        for (int i = 1; i < rowCount; i++)
        { // Start from row 1 (excluding header)
            Row row = sheet.getRow(i);
            for (int j = 0; j < columnCount; j++) 
            {
                data[i - 1][j] = row.getCell(j).getStringCellValue();
            }
        }

        workbook.close();
        inputStream.close();

        return data;
    }
}
