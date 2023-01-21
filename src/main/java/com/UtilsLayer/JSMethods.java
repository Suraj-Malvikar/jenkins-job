package com.UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class JSMethods extends BaseClass {

	public static void scrollUptoElement(WebElement wb) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", wb);
	}

	public static void openbrowser(String url) {
		((JavascriptExecutor) driver).executeScript("window.location='" + url + "';");
	}

	public static String captureTitle() {
		return ((JavascriptExecutor) driver).executeScript("return document.title;").toString();
	}

	public static String captureUrl() {
		return ((JavascriptExecutor) driver).executeScript("return document.URL;").toString();
	}

	// click
	public static void clickonElement(WebElement wb) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", wb);
	}

	// send data
	public static void enterData(WebElement wb, String value) {
		((JavascriptExecutor) driver).executeScript("arguments[0].value='" + value + "';", wb);
	}

	// navigation --- forward, backwordm refree
	public static void moveForward(int forward) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor) driver).executeScript("history.go(+" + forward + ");");
	}

	public static void moveBack(int back) {
		((JavascriptExecutor) driver).executeScript("history.go(-" + back + ");");
	}

	public static void refresh() {
		((JavascriptExecutor) driver).executeScript("history.go(0);");
	}

	// generate custom pop-- alert,confirm promtp

	public static void alertPop(String popText) {
		((JavascriptExecutor) driver).executeScript("alert(" + popText + ");");
	}

	public static void alertConfirrm(String popText) {
		((JavascriptExecutor) driver).executeScript("confirm(" + popText + ");");
	}

	public static void alertPrompt(String popText) {
		((JavascriptExecutor) driver).executeScript("prompt(" + popText + ");");
	}

	// handle drop down
	public static void handleDropdown() {

	}

}
