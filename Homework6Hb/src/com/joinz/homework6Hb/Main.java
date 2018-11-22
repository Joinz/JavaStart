package com.joinz.homework6Hb;


public class Main {
	public static void main (String[] args) {
		int n = 999;
		System.out.println("Max palyndrome using numbers '" + n + "' is " + getPalyndrome(n));
//		System.out.println(checkPalyndrome(999));
//		System.out.println(checkPalyndrome(11011));
//		System.out.println(checkPalyndrome(9009));
//		System.out.println(checkPalyndrome(0220));
	}
	
	public static int getPalyndrome(int n) {
		int number = -1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (checkPalyndrome(i*j)) {
					if (number <= i * j) {
						number = i*j;
					}
				}
			}
		}
		return number;
	}
	
	public static boolean checkPalyndrome(int n) {
		String s = String.valueOf(n);
		char[] array = s.toCharArray();
		int c = 0;
		for (int i = 0; i < array.length/2; i++) {
			if (array[i] == array[array.length-1-i]) {
				c++;
				if (c == array.length/2) {
					return true;
				}
			}
		}
		return false;
	}
	
}
