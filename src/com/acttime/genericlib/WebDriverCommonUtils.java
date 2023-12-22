package com.acttime.genericlib;

import java.util.concurrent.TimeUnit;

public class WebDriverCommonUtils {
	
	public void waitForPageToLoad(){
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
