package com.tmd.config;

import org.aeonbits.owner.Config;

import com.tmd.config.converters.*;
import com.tmd.enums.BrowserType;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
	"system:properties",
	"system:env",
	"file:${user.dir}/src/test/resources/config.properties"
})
public interface frameworkConfig extends Config{
	
	@DefaultValue("CHROME")
	@ConverterClass(StringToBrowserTypeConverter.class)
	BrowserType browser();
	

}
