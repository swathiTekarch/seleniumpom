package com.testNG.simple;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Assigndayjune17exceldata {

	public void setup() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		public void testLogin( String "username", String "password") {
	        // Salesforce login page URL
	        String url = ("https://www.salesforce.com");
	        driver.get(url);

	        // Find and click the user menu dropdown to open it
	        WebElement userMenuDropdown = driver.findElement(By.id("userNavLabel"));
	        userMenuDropdown.click();

	        // Find and click the "Login" link inside the dropdown
	        WebElement loginLink = driver.findElement(By.id("Login"));
	        loginLink.click();
	     // Wait for the login page to load
	        waitForElementVisible(By.id("username"));

	        // Find the username input field and enter username
	        WebElement usernameField = driver.findElement(By.id("username"));
	        CharSequence username;
			usernameField.sendKeys(username);

	        // Find the password input field and enter password
	        WebElement passwordField = driver.findElement(By.id("password"));
	        CharSequence password;
			passwordField.sendKeys(password);

	        // Find and click the login button
	        WebElement loginButton = driver.findElement(By.id("Login"));
	        loginButton.click();

	        // Wait for the home page to load after login
	        waitForTitleContains("Home | Salesforce");
	     // Example: Assert that the correct title is present to confirm successful login
	        assert driver.getTitle().contains("Home | Salesforce") : "Login failed for user: " + username;
	    }

	    @DataProvider(name = "loginData")
	    public Object[][] getData() throws IOException {
	        // Path to the Excel file
	        String filePath = "testdata.xlsx";
	        FileInputStream fis = new FileInputStream(new File(filePath));
	        Workbook workbook = new XSSFWorkbook(fis);

	        // Get the first sheet
	        Sheet sheet = workbook.getSheetAt(0);

	        // Count rows with data
	        int rowCount = sheet.getPhysicalNumberOfRows();
	        // Create a 2D array to store data from Excel
	        Object[][] data = new Object[rowCount - 1][2]; // Subtract header row

	        // Read data from Excel and store in the array
	        for (int i = 1; i < rowCount; i++) {
	            Row row = sheet.getRow(i);
	            data[i - 1][0] = row.getCell(0).getStringCellValue(); // Username
	            data[i - 1][1] = row.getCell(1).getStringCellValue(); // Password
	        }

	        workbook.close();
	        fis.close();

	        return data;
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser session
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    // Helper methods
	    private void waitForElementVisible(By locator) {
	        // Implement your wait logic here
	    }

	    private void waitForTitleContains("String title") {
	        // Implement your wait logic here
	}

}

	private void waitForTitleContains(String string) {
		// TODO Auto-generated method stub
		
	}

	private void waitForElementVisible(By id) {
		// TODO Auto-generated method stub
		
	}

	private void tearDown() {
		// TODO Auto-generated method stub
		
	}
}