package com.UtilsLayer;

import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {

	public static void enterData(WebElement wb, String value) {
		if ((wb.isDisplayed()) && (wb.isEnabled())) {
			wb.sendKeys(value);
		}
	}

	public static void clickonElement(WebElement wb) {
		if ((wb.isDisplayed()) && (wb.isEnabled())) {
			wb.click();
		}
	}

}
