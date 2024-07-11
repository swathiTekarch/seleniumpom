package com.automation.commontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1AssignQ3 {
    public static void main(String[] args) {
        // Set path to the ChromeDriver executable
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();

  

        // Open "https://www.selenium.dev/"
        driver.get("https://www.selenium.dev/");

        // Find the element containing the text "Selenium automates browsers. That's it!"
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Selenium automates browsers. That\\'s it!')]"));

        // Print the text of the element
        System.out.println("Text of the element: " + element.getText());
        driver.close();

}
}