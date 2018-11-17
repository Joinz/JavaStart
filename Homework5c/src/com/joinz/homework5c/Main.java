package com.joinz.homework5c;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n = 15;
		int[] mas = new int[n];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rnd.nextInt(10);
		}
		System.out.println(Arrays.toString(mas));
		
		int[] mas2 = Arrays.copyOfRange(mas, 0, n * 2);
		System.out.println(Arrays.toString(mas2));
		
		for (int i = 0; i < n; i++) {
			mas2[i + n] = mas[i] * 2;
		}
		System.out.println(Arrays.toString(mas2));
	}

}
