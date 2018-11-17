package com.joinz.lesson6a;

public class Main {

	public static void main(String[] args) {

		int d = 5;
		int e = 6;
		int f = getSumm(d, e) + 5 + getSumm(5, 3, 4);
		System.out.println(f);
		
		int[][] array = new int[][] { { 1, 2, 4 }, { 3, 6, 7 }, { 8, 9, 10 } };
		printArray(array);
		System.out.println(factorial(5));
	}

	/**
	 * Calculate sum two integer values.
	 * 
	 * @param a <code>int</code> first integer value
	 * @param b <code>int</code> second integer value
	 * @return integer value. Sum first and second values.
	 * @author Joinz
	 */
	public static int getSumm(int a, int b) {
		int summ = a + b;
		return summ;
	}
	public static int getSumm(int a, int b, int c) {
		int summ = a + b + c;
		return summ;
	}

	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
