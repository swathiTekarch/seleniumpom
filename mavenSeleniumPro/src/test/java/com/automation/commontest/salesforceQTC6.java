package com.automation.commontest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 *  teset
 */

public class salesforceQTC6 {

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
            WebElement userMenuDropdown = driver.findElement(By.xpath("//div[contains(@class, 'userProfileCardTriggerRoot')]/span"));
            userMenuDropdown.click();

            // Find and click the "My Profile" option in the dropdown
            WebElement myProfileOption = driver.findElement(By.xpath("//a[@title='My Profile']"));
            myProfileOption.click();

            // Wait for the profile page to load
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.titleContains("Profile"));

            // Example: Print a success message
            System.out.println("Successfully navigated to My Profile page.");
         // Perform further actions on the profile page if needed

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            Thread.sleep(5000);
        } finally {
            // Close the browser session
            driver.quit();
        }
}
}