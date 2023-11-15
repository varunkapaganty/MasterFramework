package com.tmb.driver;

import org.openqa.selenium.WebDriver;

public class Driver {
	
	public static void initDriver() {
		WebDriver driver = localDriverFactory.getDriver();
		driver.get("https://google.com");
	}

}
