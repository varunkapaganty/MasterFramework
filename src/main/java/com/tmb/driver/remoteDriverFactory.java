package com.tmb.driver;

import org.openqa.selenium.WebDriver;

import com.tmd.config.configFactory;

public final class remoteDriverFactory {
private remoteDriverFactory() {}
	
	public static WebDriver getDriver()
	{
		WebDriver driver = null;
		String browserRemoteModeType = configFactory.getConfig().browserRemoteMode().toString();
		switch(browserRemoteModeType)
		{
		case "SELENIUM":
			
			break;
		case "SELENOID":
			
			break;
		case "BROWSER_STACK":
			
			break;
		default:
			driver = null;
			break;
		}
		return driver;
	}

}
