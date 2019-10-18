package com.exercise16strings.app;

public class StringsTunned {

	public static String[] Tunea(String[] cads) {
		for(int i=0; i<cads.length; i++) {
			cads[i] = cads[i].trim();
			cads[i] = cads[i].toLowerCase();
			cads[i] = cads[i].replace('a', 'o');
			cads[i] = cads[i].replace('e', 'o');
			cads[i] = cads[i].replace('i', 'o');
			cads[i] = cads[i].replace('o', 'o');
			cads[i] = cads[i].replace('u', 'o');
		}
		
		return cads;
	}
	
	public static double mediaVector(int[] myArray) {
		int sum=0;
		for(int i=0; i<myArray.length; i++) {
			sum+= myArray[i];
		}
		return sum/myArray.length;
	}

}
