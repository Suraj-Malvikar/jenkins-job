package com.UtilsLayer;

import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class FrameMethods extends BaseClass {

	public static void FrameUsingIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void FrameUsingId(String id) {
		driver.switchTo().frame(id);
	}

	public static void FrameUsingName(String name) {
		driver.switchTo().frame(name);
	}

	public static void FrameUsingWebElement(WebElement wb) {
		driver.switchTo().frame(wb);
	}

	public static void parentframe() {
		driver.switchTo().parentFrame();
	}

	public static void topFrame() {
		driver.switchTo().defaultContent();
	}

}
