package com.tmd.config.converters;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import com.tmd.enums.BrowserType;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {

	@Override
	public BrowserType convert(Method method, String browserName) {
		// TODO Auto-generated method stub
		Map<String, BrowserType> stringBrowserTypeMap = Map.
			      of("CHROME", BrowserType.CHROME,
			         "FIREFOX", BrowserType.FIREFOX);

	    return stringBrowserTypeMap
			      .getOrDefault(browserName.toUpperCase(), BrowserType.CHROME);
		
		//return BrowserType.valueOf(browserName.toUpperCase());
	}
	
	

}
