package com.joinz.lesson7c;

public class Main {

	public static void main(String[] args) {
		
		String result = String.format("%.2f",  Math.PI);
		
		
		System.out.println(result);
		
		System.out.println(doubleToString(Math.PI, 32));
		
	}

	public static String doubleToString(double number, int n) {
		String result = String.format("%." + n + "f", number);
		return result;
	}
	
}
