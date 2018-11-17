package com.joinz.homework5Hb;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] mas = { 4, 5, 10, 1, 5 };
		int temp;
		
		for (int i = 0; i < mas.length/2; i++) {
			temp = mas[i];
			mas[i] = mas[mas.length - (i+1)];
			mas[mas.length - (i+1)] = temp;
		}
		
		System.out.println(Arrays.toString(mas));
	}

}
