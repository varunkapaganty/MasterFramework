package com.tmd.config.converters;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import com.tmd.enums.BrowserRemoteModeType;

public class StringToRemoteModeBrowserTypeConverter implements Converter<BrowserRemoteModeType>{
	public BrowserRemoteModeType convert(Method method, String browserRemoteMode) {
		// TODO Auto-generated method stub
		Map<String, BrowserRemoteModeType> stringBrowserRemoteMode = Map.
			      of("selenoid", BrowserRemoteModeType.SELENOID,
			         "selenium", BrowserRemoteModeType.SELENIUM,
			         "browser_stack", BrowserRemoteModeType.BROWSER_STACK);

	    return stringBrowserRemoteMode
			      .getOrDefault(browserRemoteMode.toUpperCase(), BrowserRemoteModeType.SELENIUM);
	}
}
