package com.phoenix.designpatterns.singleton;
/* Author: raja.kumar@stltech.in
 * Creation Date: 17/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

public class Earth {
	 
	//object reference
	private static Earth ob;
	
	//private default constructor
	private Earth()
	{
		System.out.println("Earth is knelt down !");
	}

	//getter method
	public static Earth getInstance()
	{
		if(ob==null)
		   ob=new Earth();
		
		return ob;
	}
	
	//declared method
	void createLife()
	{
		System.out.println("Earth is breeding many lives !");
	}
	
}

