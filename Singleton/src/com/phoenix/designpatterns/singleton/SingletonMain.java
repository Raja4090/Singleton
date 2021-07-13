package com.phoenix.designpatterns.singleton;
/* Author: raja.kumar@stltech.in
 * Creation Date: 17/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

import com.phoenix.designpatterns.singleton.Earth;
public class SingletonMain {
    public static void main(String[]args)
    {
    	System.out.println("Earth Details===>");
    	Earth obj1;
    	obj1=Earth.getInstance();
    	obj1.createLife();
    	
    	
    	System.out.println("\n\nSun Details===>");
    	Sun obj2=Sun.getInstance();
    	obj2.giveLight();
    	
    	
    	System.out.println("\n\nPrime Minister Details===>");
    	PrimeMinister obj3=PrimeMinister.newInstance();
    	obj3.serveNation();
    	
    	
    	System.out.println("\n\nPresident Details===>");
    	President obj4=President.getInstance();
    	obj4.representNation();
    	
    }
}
