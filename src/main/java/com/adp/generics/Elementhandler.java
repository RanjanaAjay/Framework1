package com.adp.generics;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


//utils class here or common methods
// Elementhandler class used to identify the elements takes arguments
public class Elementhandler extends Baseclass{

// define it in the root class
WebDriver driver=adp.driver;


//method to find single element with args as locator and locator value	
public WebElement findingElement(String elementkey) // element key is passed here from properties file
	{
	String elementvalue=adp.object.getProperty(elementkey);
		String[] locator = elementvalue.split("-");
	
		//Allvariablesatuse obj = new Allvariablesatuse();
		
		By byClassObject = null;

		try {
			if (locator[0].equalsIgnoreCase("id")) {
				byClassObject = By.id(locator[1]);
			} else if (locator[0].equalsIgnoreCase("name")) {
				byClassObject = By.name(locator[1]);
			} else if (locator[0].equalsIgnoreCase("class")) {
				byClassObject = By.className(locator[1]);
			} else if (locator[0].equalsIgnoreCase("tagname")) {
				byClassObject = By.tagName(locator[1]);
			} else if (locator[0].equalsIgnoreCase("cssSelector")) {
				byClassObject = By.cssSelector(locator[1]);
			} else if (locator[0].equalsIgnoreCase("linktext")) {
				byClassObject = By.linkText(locator[1]);
			} else if (locator[0].equalsIgnoreCase("partiallinktext")) {
				byClassObject = By.partialLinkText(locator[1]);
			} else if (locator[0].equalsIgnoreCase("xpath")) {
				byClassObject = By.xpath(locator[1]);
			} else {
				System.out.println("invalid args");
				return null;
			}
	} catch (NoSuchElementException e) {
		e.printStackTrace();
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		return driver.findElement(byClassObject);
	}

//method to returns list of elements 
public List<WebElement> findingElements(String elementkey) {
	String elementvalue=adp.object.getProperty(elementkey);
		String[] locator = elementvalue.split("-");
		//Allvariablesatuse obj = new Allvariablesatuse();---this is not required if u extend the class
		

		By byClassObject = null;
		try {
			if (locator[0].equalsIgnoreCase("id")) {
				byClassObject = By.id(locator[1]);
			} else if (locator[0].equalsIgnoreCase("name")) {
				byClassObject = By.name(locator[1]);
			} else if (locator[0].equalsIgnoreCase("class")) {
				byClassObject = By.className(locator[1]);
			} else if (locator[0].equalsIgnoreCase("tagname")) {
				byClassObject = By.tagName(locator[1]);
			} else if (locator[0].equalsIgnoreCase("cssSelector")) {
				byClassObject = By.cssSelector(locator[1]);
			} else if (locator[0].equalsIgnoreCase("linktext")) {
				byClassObject = By.linkText(locator[1]);
			} else if (locator[0].equalsIgnoreCase("partiallinktext")) {
				byClassObject = By.partialLinkText(locator[1]);
			} else if (locator[0].equalsIgnoreCase("xpath")) {
				byClassObject = By.xpath(locator[1]);
			} else {
				System.out.println("invalid args");
				return null;
			}
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			}
			catch (NullPointerException e) {
				e.printStackTrace();
			}
		return driver.findElements(byClassObject);
	}
	
public void setData(String elementkey,String data) {
	findingElement(adp.object.getProperty(elementkey)).sendKeys(data);
//	WebElement ele;
//	ele.

}

public void click(String elementkey) {
	findingElement(adp.object.getProperty(elementkey)).click();
}
	
public String getText(String elementkey) {
	return findingElement(adp.object.getProperty(elementkey)).getText();
}
	
public String getAtrribute(String elementkey,String attribute) {
	return findingElement(adp.object.getProperty(elementkey)).getAttribute(attribute);
}
	
public String getTagName(String elementkey) {
	return findingElement(adp.object.getProperty(elementkey)).getTagName();
}	
public void clear(String elementkey) {
	findingElement(adp.object.getProperty(elementkey)).clear();
}
public boolean isDisplayed(String elementkey) {
	return findingElement(adp.object.getProperty(elementkey)).isDisplayed();
}
public boolean isEnabled(String elementkey) {
		return findingElement(adp.object.getProperty(elementkey)).isEnabled();
}
public boolean isSelected(String elementkey) {
	return findingElement(adp.object.getProperty(elementkey)).isSelected();
}
public void submit(String elementkey) {
	findingElement(elementkey).submit();
}
public String tooltip(String elementkey) {
	return findingElement(adp.object.getProperty(elementkey)).getAttribute("title");
}
}
