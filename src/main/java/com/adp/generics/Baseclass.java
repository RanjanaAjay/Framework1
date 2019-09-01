package com.adp.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


//baseclass definiation
public class Baseclass {
	Allvariablesatuse adp = new Allvariablesatuse();

	@BeforeSuite
	public void launch() throws IOException {
		System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/chromedriver");
	//	adp.driver=new ChromeDriver();
		init();
		extentReport();
	}
	
	// launch the application
		@BeforeTest
		public void enterUrl() throws IOException {
			System.out.println(adp.browserProperties.getProperty("url"));
			
			adp.driver.get(adp.browserProperties.getProperty("url"));
		}
		
		
		
		
		@AfterTest
		public void closeAllOpenObjects() {
			adp.driver.close();
			
		}
		
		
		
		

	public void init() throws IOException {
		try {
			// here object prop file instance is created
			adp.object = new Properties();
			adp.object.load(new FileInputStream(
					"/home/tyss/Desktop/ranjana/framework/projectframework/src/main/resources/allfileshere/object.properties"));
			// here browser prop file instance is created
			
			adp.browserProperties = new Properties();
			adp.browserProperties.load(new FileInputStream(
					"/home/tyss/Desktop/ranjana/framework/projectframework/src/main/resources/allfileshere/browserdetails.properties"));
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	

	public void extentReport() {
			
		adp.extent=new ExtentReports();
		adp.htmlReporter = new ExtentHtmlReporter(new File("G:\\Ranjana\\Programming\\repo1\\adpproject\\src\\test\\resources\\reports\\extent.html"));
	adp.extent.attachReporter(adp.htmlReporter);
	adp.test=adp.extent.createTest("adpautomation testing");
//	ExtentReports extent=adp.extent;
	adp.htmlReporter.config().setDocumentTitle("ranjana extent report");
	adp.htmlReporter.config().setReportName("testing");
	adp.htmlReporter.config().setTheme(Theme.DARK);
	adp.extent.attachReporter(adp.htmlReporter);
	
	adp.extent.setSystemInfo("hostname", "ADP");
	adp.extent.setSystemInfo("tester name", "ranjana");
	adp.extent.setSystemInfo("project", "ADP");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}































