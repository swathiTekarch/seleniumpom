package com.automation.commontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


	public class Day1Assignment {
	    public static void main(String[] args) {
	     
	    	WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.google.com");

	        WebElement aboutLink = driver.findElement(By.linkText("About"));
	        aboutLink.click();

	        String expectedTitle = "Google - About Google, Our Culture & Company News";
	        String actualTitle = driver.getTitle();
	        if (expectedTitle.equals(actualTitle)) {
	            System.out.println("Title verification successful");
	        } else {
	            System.out.println("Title verification failed. Expected title: " + expectedTitle + ". Actual title: " + actualTitle);
	        }

	        // Close the browser
	        driver.close();
	    }
	}

