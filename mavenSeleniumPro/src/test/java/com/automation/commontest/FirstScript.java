/**
 * 
 */
package com.automation.commontest;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This my first scription of selenium
 */
public class FirstScript {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// detected browser type
		String browserType="Chrome";
		  String userAgent= httpRequest.getHeader("user-agent");
		
		if(browserType.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			///
		}
		if(browserType.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			//
		}
		if(browserType.equals("safari")) {
			WebDriverManager.safaridriver();
			
		}
		if(browserType.equals("FF")) {
			WebDriverManager.firefoxdriver().setup();
		}

	}

}
