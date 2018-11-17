package com.joinz.homework5Hb;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] mas = { 4, 5, 10, 1, 5 };
		for (int i = 0; i < mas.length; i++) {
			mas[i] = mas[mas.length - (i + 1)];
		}
		System.out.println(Arrays.toString(mas));
	}

}
