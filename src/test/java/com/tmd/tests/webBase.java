package com.tmd.tests;

import org.testng.annotations.BeforeMethod;

import com.tmb.driver.Driver;

public class webBase {
	
	@BeforeMethod
	public void setup() {
		Driver.initDriver();
	}

}
