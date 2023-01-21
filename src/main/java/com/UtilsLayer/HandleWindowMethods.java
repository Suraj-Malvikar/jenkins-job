package com.UtilsLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import com.BaseLayer.BaseClass;

public class HandleWindowMethods extends BaseClass {

	public static ArrayList<String> handleWindows(Set<String> ls) {

		Iterator<String> it = ls.iterator();
		ArrayList<String> arr = new ArrayList<String>();
		
		while (it.hasNext()) 
		{
			arr.add(it.next());
		}
		return arr;
	}


	
	
	
}
