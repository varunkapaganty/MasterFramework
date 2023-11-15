package com.tmb.driver;

import org.openqa.selenium.WebDriver;
import com.tmb.driver.manager.chromeManager;
import com.tmb.driver.manager.firefoxManager;
import com.tmb.driver.manager.msedgeManager;
import com.tmd.config.configFactory;

public final class localDriverFactory {
	private localDriverFactory() {}
	
	public static WebDriver getDriver()
	{
		WebDriver driver = null;
		String browserName = configFactory.getConfig().browser().toString();
		switch(browserName)
		{
		case "chrome":
			driver = chromeManager.getDriver();
			break;
		case "msedge":
			driver = msedgeManager.getDriver();
			break;
		case "firefox":
			driver = firefoxManager.getDriver();
			break;
		default:
			driver = null;
			break;
		}
		return driver;
	}
	

}
