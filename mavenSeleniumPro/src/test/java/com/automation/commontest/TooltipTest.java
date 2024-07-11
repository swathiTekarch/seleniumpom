package com.automation.commontest;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TooltipTest{
    public static void main(String[] args) {
    	WebDriver driver =null;
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();// WebDriver is an interface
		driver.manage().window().maximize();;
		driver.get("https://www.google.com/");
    }
}
