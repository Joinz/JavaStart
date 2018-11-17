package com.joinz.lesson5b;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 2, 7, 0, 4 };

		int[] b = Arrays.copyOfRange(a, 1, 4);

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		for (int element : a) {
			System.out.println(element);
		}

	}

}
