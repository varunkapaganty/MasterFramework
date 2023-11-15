package com.tmb.driver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class chromeManager {
	private chromeManager() {}
	
	public static WebDriver getDriver() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver(chromeOptions);
	}

}
