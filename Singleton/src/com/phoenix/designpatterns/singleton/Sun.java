package com.phoenix.designpatterns.singleton;
/* Author: raja.kumar@stltech.in
 * Creation Date: 17/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

public class Sun {
	//declared private static obj reference
	private static Sun ob;
	
	//private constructor
	private Sun()
	{
		System.out.println("Sun is scorching !");
	}
	
	//getter method
	public static Sun getInstance()
	{
		if(ob==null) 
		ob=new Sun();
		return ob;
	}
	
	//declared method
	void giveLight()
	{
		System.out.println("Sun is emitting excruciating light !");
	}

}
