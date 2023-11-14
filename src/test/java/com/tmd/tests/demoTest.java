package com.tmd.tests;

import org.testng.annotations.Test;

import com.tmd.config.configFactory;

public class demoTest {

	//local, remote(selenium,seleniod, browserstack):chrome and firefox
	@Test
	public void testLogin(){
		//frameworkConfig config = ConfigCache.getOrCreate(frameworkConfig.class);
		System.out.println(configFactory.getConfig().browser());
		
	}
	
}
