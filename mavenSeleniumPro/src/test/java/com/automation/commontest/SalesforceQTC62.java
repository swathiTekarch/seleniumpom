package com.automation.commontest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SalesforceQTC62 {

	public static void main(String[] args) {
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
        
        WebElement homeTab = driver.findElement(By.xpath("//a[contains(@title,'Home Tab')]"));
        homeTab.click();
        
        WebElement postLink = driver.findElement(By.linkText("Post"));
        postLink.click();
        WebElement postFrame = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Area')]"));
        driver.switchTo().frame(postFrame);

        // Step 6: Enter text in the post text area
        WebElement postTextArea = driver.findElement(By.xpath("//body"));
        postTextArea.sendKeys("Hello.");
        String iframe = null;
		driver.switchTo().frame(iframe);
        
	
        // Step 3: Click on "Share" button
        WebElement shareButton = driver.findElement(By.xpath("//input[@value='Share']"));
        shareButton.click();
        driver.close();

	}

}
