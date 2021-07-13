package com.phoenix.designpatterns.singleton;
/* Author: raja.kumar@stltech.in
 * Creation Date: 17/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

public class PrimeMinister {
    
	//object reference
	private static PrimeMinister ob;
	
	//private default constructor
	private PrimeMinister()
	{
		System.out.println("Prime minister is juggernaut for the country !");
	}
	
	//declared method
	public static PrimeMinister newInstance()
	{
		if(ob==null)
		 ob=new PrimeMinister();
		
		return ob;
	}
	
	//declared method
	void serveNation()
	{
		System.out.println("Prime Minister serves the country !");
	}
}
