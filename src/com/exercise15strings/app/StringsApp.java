package com.exercise15strings.app;

public class StringsApp {

	public static void main(String[] args) {
		String cad1 = "";
		String cad2 = "";
		cad1 = "We wish to colour the interior of each triangle with one of three colours: red, green or blue .Such a colouring shall be called valid. Here, two triangles are said to be neighbouring if they share an edge.        ";
		
		cad2 = cad1;

		
		System.out.println(cad1.charAt(3));      	 	//Returns pos
		System.out.println(cad1.codePointAt(3));	 	//Returns ascii
		System.out.println(cad1.codePointCount(0, 1));	//Counts from to and returns the count of ASCII
		System.out.println(cad1.codePointBefore(3));
		System.out.println(cad1.compareTo(cad2));
		System.out.println(cad1.equals(cad2));			//Returns if Strings are the same
		System.out.println(cad1.concat(cad2));
		System.out.println(cad1.contains("edge"));
		System.out.println(cad1.valueOf(115));
		System.out.println(cad1.endsWith("edge."));
		System.out.println(cad1.trim() + cad2.trim());	//Remove white spaces
		System.out.println(cad1.indexOf('S'));			//Non greedy
		System.out.println(cad1.lastIndexOf('S'));		//Greedy
		System.out.println(cad1.length());				//Returns the length of the String
		System.out.println(cad1.split("."));
		System.out.println(cad2.toLowerCase());
		System.out.println(cad2.toUpperCase());
		
		
		//Reverse a String
		String reversedString = "";
		for(int i = cad1.length() -1; i>=0; i-- ) {
			reversedString += cad1.charAt(i);
		}
		
		System.out.println(reversedString);
	}

}
