package com.adp.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Itemlisthandler extends Baseclass {

	Elementhandler eh = new Elementhandler();
	Actions act;

	public void click(WebDriver driver, String elementKey) {
		act = new Actions(driver);
		act.moveToElement(eh.findingElement(elementKey)).click().perform();
	}

	public void clickAndHold(WebDriver driver, String elementKey) {
		act = new Actions(driver);
		act.moveToElement(eh.findingElement(elementKey)).clickAndHold().perform();
	}

	public void contextClick(WebDriver driver, String elementKey) {
		act = new Actions(driver);
		act.moveToElement(eh.findingElement(elementKey)).contextClick().perform();
	}

	public void doubleClick(WebDriver driver, String elementKey) {
		act = new Actions(driver);
		act.moveToElement(eh.findingElement(elementKey)).doubleClick().perform();
	}

	public void dragAndDrop(WebDriver driver, String elementKeySrc, String elementKeyDest) {
		act = new Actions(driver);
		act.dragAndDrop(eh.findingElement(elementKeySrc), eh.findingElement(elementKeyDest)).perform();
	}

	public void dragAndDropBy(WebDriver driver, String elementKeySrc, int x, int y) {
		act = new Actions(driver);
		act.dragAndDropBy(eh.findingElement(elementKeySrc), x, y).perform();
	}

	public void moveToElement(WebDriver driver, String elementKey) {
		act = new Actions(driver);
		act.moveToElement(eh.findingElement(elementKey)).perform();
	}

	public void moveByOffset(WebDriver driver, int x, int y) {
		act = new Actions(driver);
		act.moveByOffset(x, y).perform();

	}

	public void moveToElementByOffset(WebDriver driver, String elementKey, int x, int y) {
		act = new Actions(driver);
		act.moveToElement(eh.findingElement(elementKey), x, y).perform();
		
		
	}
	

}
