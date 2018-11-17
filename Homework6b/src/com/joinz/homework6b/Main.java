package com.joinz.homework6b;

public class Main {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		String c = " blabla";
		System.out.println(conc(a, b, c));
	}
	/**
	 * Returns concatenated sum of (<b>int a</b> + <b>double b</b>) with <b>String c</b>.
	 * @param a int
	 * @param b double
	 * @param c String
	 * @return concatenated sum of <b>int a</b> and <b>double b</b> with <b>String c</b>
	 */
	public static String conc(int a, double b, String c) {
		double d = a + b;
		String e = d + c;
		return e;
	}
}
