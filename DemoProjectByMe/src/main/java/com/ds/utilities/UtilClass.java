package com.ds.utilities;

import org.openqa.selenium.support.PageFactory;

import com.ds.testBase.TestBase;

public class UtilClass extends TestBase{
	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	//get Url
	
	public String getWebPageUrl()
	{
		String url=driver.getCurrentUrl();
		return url;
	}

}
