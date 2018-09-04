package com.joinz.homework1b;

public class Main {

	public static void main(String[] args) {

		
		double side1 = 0.3;
		double side2 = 0.4;
		double side3 = 0.5;
		double p = (side1 + side2 + side3) * 0.5;
		double result = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		System.out.println(result);
		

	}

}
