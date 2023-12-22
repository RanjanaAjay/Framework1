package com.acttime.customertest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.acttime.genericlib.BaseClass;
import com.acttime.genericlib.FileUtils;
import com.acttime.objectrepositorylib.CreateNewCustomer;
import com.acttime.objectrepositorylib.Home;
import com.acttime.objectrepositorylib.OpenTask;
import com.acttime.objectrepositorylib.PRojectAndCustomer;

public class CustomerTest extends BaseClass{
	
	
	@Test
	public void cerateCustomerTest() throws Throwable{
		//read test data 
		FileUtils lib = new FileUtils();
		String customerNAme = lib.getExcelData("Sheet1", 1, 2);
		//step 2 : navigate to Task PAge
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.navigateToTaskPage();
		//step 3 : click on "Project & cust " libnk
		OpenTask op = PageFactory.initElements(driver, OpenTask.class);
		op.navigateToProjectAndCustPage();
		//step 4 : click on "create new Customer"
		PRojectAndCustomer pandc = PageFactory.initElements(driver, PRojectAndCustomer.class);
		pandc.nvigateCreateNewCustomerPage();
		//step 5: create Customer
		CreateNewCustomer createCust = PageFactory.initElements(driver, CreateNewCustomer.class);
		createCust.createCustomer(customerNAme);
		
        //verify
		String actmsg = pandc.getSucMsg().getText();
		String expmsg = "successfully created.";
		boolean stat = actmsg.contains(expmsg);
		Assert.assertTrue(stat);
	}

}









