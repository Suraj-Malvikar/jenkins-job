package com.TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.UtilsClass;

public class Demo1 extends BaseClass {

	public static void main(String[] args) {

		BaseClass obj = new BaseClass();
		obj.iniliazation();

		WebElement wb = driver.findElement(By.name("firstname"));

		UtilsClass.enterData(wb, prop.getProperty("username"));

	}

}
