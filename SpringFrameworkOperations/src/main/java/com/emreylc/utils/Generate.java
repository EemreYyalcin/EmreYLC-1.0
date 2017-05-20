package com.emreylc.utils;

import java.util.Random;

public class Generate {

	private static String alphabet = "0123456789ABCDEFGHJKLMNBVCXZQWERTYUIOPOPOPSSFFHDASDFDNXCXCASADASDAERGSDFSHSA1936746393";

	public static int getInt(){
		  Random r = new Random();
		  return r.nextInt(10000);
	  }
	
	public static String generateString(){
		String temp = "";
		Random r = new Random();
		for(int i = 0;i<25;i++)
		{
		   temp += alphabet.charAt(r.nextInt(10000)%alphabet.length());
		}		
		return temp;
	}
	public static String generateString(int length){
		String temp = "";
		Random r = new Random();
		for(int i = 0;i<length;i++)
		{
			temp += alphabet.charAt(r.nextInt(10000)%alphabet.length());
		}		
		return temp;
	}


}
