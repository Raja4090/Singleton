package com.phoenix.designpatterns.singleton;
/* Author: raja.kumar@stltech.in
 * Creation Date: 17/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

public class President {
        
	//declared private static object reference
	private static President ob;
	
	//private default constructor
	private President()
	{
		System.out.println("President is the first person of the country !");
	}
	
	//public getter method
	
	public static President getInstance()
	{
		if(ob==null)
			ob=new President();
		return ob;
	}
	
	//declared method
	void representNation()
	{
		System.out.println("President represents their country !");
	}
}
