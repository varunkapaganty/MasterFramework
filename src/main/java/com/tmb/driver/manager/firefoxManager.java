package com.tmb.driver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class firefoxManager {
	private firefoxManager() {}
	
	public static WebDriver getDriver() {
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}
}
