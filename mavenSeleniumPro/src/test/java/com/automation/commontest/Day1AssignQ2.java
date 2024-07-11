package com.automation.commontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1AssignQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
     
     

        // Open "https://www.selenium.dev/"
        driver.get("https://www.selenium.dev/");

        // Find and click on the "Downloads" link
        WebElement downloadsLink = driver.findElement(By.linkText("Downloads"));
        downloadsLink.click();

        // Verify the title of the page
        String expectedTitle = "Downloads | Selenium";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification successful!");
        } else {
            System.out.println("Title verification failed. Actual title: " + actualTitle);
        }

        // Close the browser
        driver.close();
    }

	}

