package com.automation.commontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class salesforceTC061 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("swathi@dm.com");
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("flowers@24");
        WebElement loginButton = driver.findElement(By.id("Login"));
        loginButton.click();
        
//        WebElement userMenu = driver.findElement(By.xpath("//div[contains(@class, 'user-menu')]/button"));
//        userMenu.click();
        WebElement userMenu = driver.findElement(By.id("userNav"));
        userMenu.click();
        WebElement myProfileOption = driver.findElement(By.xpath("//a[contains(@title, 'My Profile')]"));
        myProfileOption.click();

        // Switch to the new window that opens for My Profile
        // Assuming My Profile opens in a new window or frame, switch to it if necessary

        // Click on the "Edit Profile" button
        WebElement editProfileButton = driver.findElement(By.cssSelector("a.contactInfoLaunch.editLink"));
        editProfileButton.click();
       Thread.sleep(5000);

        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);

        
       for (String windowHandle : driver.getWindowHandles()) {
       driver.switchTo().window(windowHandle);
       }


       // Step 4: Check for the edit button next to contact text and click it
     WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement editButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@title,'Edit Profile')]")));
    editButton.click();

     // Step 5: Switch to the new window/tab (if applicable)
    for (String windowHandle : driver.getWindowHandles()) {
    driver.switchTo().window(windowHandle);
}
      WebElement aboutTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@title,'About Tab')]")));
       aboutTab.click();

    // Step 7: Enter <Lastname> in the input field (replace with actual locator and value)
     WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
     lastNameInput.clear();
    lastNameInput.sendKeys("S"); 

    // Step 8: Click on save all button
    WebElement saveButton = driver.findElement(By.xpath("//input[@value='Save All']"));
    saveButton.click();

// Optional: Add validations/assertions if needed

// Close the browser
      driver.close();
        
     

	}
	}

