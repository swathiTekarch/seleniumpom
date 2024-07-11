package com.automation.commontest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3SeleniumQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Open the student registration page
        driver.get("URL_of_the_registration_page"); // Replace "URL_of_the_registration_page" with the actual URL

        // Find and fill the form fields
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        firstNameInput.sendKeys("Aana");

        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        lastNameInput.sendKeys("John");

        WebElement studentIdInput = driver.findElement(By.id("studentId"));
        studentIdInput.sendKeys("23045");

        WebElement addressInput = driver.findElement(By.id("address"));
        addressInput.sendKeys("xyz");

        WebElement genderDropdown = driver.findElement(By.id("gender"));
        genderDropdown.sendKeys("Female");
        WebElement stateInput = driver.findElement(By.id("state"));
        stateInput.sendKeys("GOA");

        WebElement qualificationInput = driver.findElement(By.id("qualification"));
        qualificationInput.sendKeys("MCA");

        WebElement districtInput = driver.findElement(By.id("district"));
        districtInput.sendKeys("GOA");

        WebElement cityInput = driver.findElement(By.id("city"));
        cityInput.sendKeys("GOA");
        WebElement pincodeInput = driver.findElement(By.id("pincode"));
        pincodeInput.sendKeys("1234");

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("abc@tekarch.com");

        // Submit the form
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        
        driver.close();
    }
	}


