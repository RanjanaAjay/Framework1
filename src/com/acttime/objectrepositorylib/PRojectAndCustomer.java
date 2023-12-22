package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PRojectAndCustomer {

	
	@FindBy(xpath="//input[@value='Create New Customer']")
	private WebElement cerateCustomerBtn;
	
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement sucMsg;
	
	
	public WebElement getSucMsg() {
		return sucMsg;
	}


	public void nvigateCreateNewCustomerPage(){
		cerateCustomerBtn.click();
	}
	
}
