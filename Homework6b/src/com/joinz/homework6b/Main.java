package com.joinz.homework6b;

public class Main {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		String c = " blabla";
		System.out.println(conc(a, b, c));
	}
	
	public static String conc(int a, double b, String c) {
		double d = a + b;
		String e = d + c;
		return e;
	}
}
