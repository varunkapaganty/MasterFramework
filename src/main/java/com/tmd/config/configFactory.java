package com.tmd.config;

import org.aeonbits.owner.ConfigCache;

public final class configFactory {
	
	private configFactory() {}
	
	public static frameworkConfig getConfig() {
		return ConfigCache.getOrCreate(frameworkConfig.class);
	}

}
