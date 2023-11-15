package com.tmd.config.converters;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import com.tmd.enums.RunModeBrowserType;

public class StringToRunModeBrowserTypeConverter implements Converter<RunModeBrowserType> {
	
	public RunModeBrowserType convert(Method method, String runMode) {
		// TODO Auto-generated method stub
		Map<String, RunModeBrowserType> stringRunModeTypeMap = Map.
			      of("remote", RunModeBrowserType.REMOTE,
			         "local", RunModeBrowserType.LOCAL);

	    return stringRunModeTypeMap
			      .getOrDefault(runMode.toUpperCase(), RunModeBrowserType.LOCAL);
	}
}
