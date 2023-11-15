package com.tmb.driver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class msedgeManager {
	private msedgeManager() {}
	
	public static WebDriver getDriver() {
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriverManager.edgedriver().setup();
		return new EdgeDriver(edgeOptions);
	}
}
