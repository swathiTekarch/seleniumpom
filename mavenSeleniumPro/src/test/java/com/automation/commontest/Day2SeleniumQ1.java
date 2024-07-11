package com.automation.commontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2SeleniumQ1 {
    public static void main(String[] args) throws InterruptedException {


	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");

    // Select radio button "Honda" and validate it selected
    WebElement hondaRadio = driver.findElement(By.id("hondaradio"));
    hondaRadio.click();
    if (hondaRadio.isSelected()) {
        System.out.println("Honda radio button is selected");
    } else {
        System.out.println("Honda radio button is not selected");
    }
   // Check the functionality of the radio button
    WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
    bmwRadio.click();
    if (bmwRadio.isSelected()) {
        System.out.println("BMW radio button is selected");
    } else {
    	
        System.out.println("BMW radio button is not selected");
    }
    // Select "BMW" and "Honda" and make sure they are the only selected items
    hondaRadio.click();
    if (hondaRadio.isSelected() && !bmwRadio.isSelected()) {
        System.out.println("Honda radio button is selected and BMW is not selected");
    }
    //Click the hide button and verify "Hide/Show Example" text box is hidden
    WebElement hideButton = driver.findElement(By.id("hide-textbox"));
    hideButton.click();
    WebElement textBox = driver.findElement(By.id("displayed-text"));
    if (!textBox.isDisplayed()) {
        System.out.println("Text box is hidden");
    }
    // Click on Disable button and verify "Enabled/Disabled field" textbox is disabled
    WebElement disableButton = driver.findElement(By.id("disable"));
    disableButton.click();
    WebElement textField = driver.findElement(By.id("name"));
    if (!textField.isEnabled()) {
        System.out.println("Text field is disabled");
        
      // Forward, backward, and refresh
        driver.navigate().forward();
        
        Thread.sleep(3000); 
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        
        
        driver.close();
    }
	}
    

}
