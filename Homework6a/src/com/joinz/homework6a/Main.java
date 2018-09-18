package com.joinz.homework6a;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] mas = new int[10];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rnd.nextInt(50);
		}
		System.out.println(Arrays.toString(mas));
		System.out.println("Max integer is " + max(mas));
		
	}

	/**
	 * Search maximum integer of massive integers.
	 * 
	 * @param array <code>int[]</code> which need to search.
	 * @return Maximum integer value.
	 */
	public static int max(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max <= array[i]) {
				max = array[i];
			}
		}
		return max;
	}
}
