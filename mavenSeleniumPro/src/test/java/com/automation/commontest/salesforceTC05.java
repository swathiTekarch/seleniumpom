package com.automation.commontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class salesforceTC05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("swathi@dm.com");
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("flowers@24");
        WebElement loginButton = driver.findElement(By.id("Login"));
        loginButton.click();
        
        try {
            // Find and click the user menu dropdown to open it
            WebElement userMenuDropdown = driver.findElement(By.id(""));
            userMenuDropdown.click();

            // Find and click the "Login" link inside the dropdown
            WebElement loginLink = driver.findElement(By.id("Login"));
            loginLink.click();

            // Wait for the login page to load
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

            // Find the username input field and enter username
            WebElement usernameField = driver.findElement(By.id("username"));
            CharSequence username;
			usernameField.sendKeys("swathi@dm.com");

            // Find the password input field and enter password
            WebElement passwordField = driver.findElement(By.id("password"));
            CharSequence password;
			passwordField.sendKeys("flowers@24");
         // Find and click the login button
            WebElement loginButton1 = driver.findElement(By.id("Login"));
            loginButton1.click();

            // Wait for the home page to load after login
            wait.until(ExpectedConditions.titleContains("Home | Salesforce"));

            // Example: Print a success message
            System.out.println("Successfully logged in to Salesforce.");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            // Close the browser session
            driver.quit();

	}

}
}