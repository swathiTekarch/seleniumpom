package com.automation.commontest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Day4SeleniumQ5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
     
		driver.get("https://login.salesforce.com");
		WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("swathi@dm.com");
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("flowers@24");
        passwordInput.clear();
        WebElement loginButton = driver.findElement(By.id("Login"));
        loginButton.click();
        WebElement errorMessage = driver.findElement(By.id("error"));
        if (errorMessage.isDisplayed() && errorMessage.getText().equals("Please enter your password.")) {
            System.out.println("Error message displayed: 'Please enter your password.'");
        } else {
            System.out.println("Error message not displayed or incorrect.");
        }
	}

}

