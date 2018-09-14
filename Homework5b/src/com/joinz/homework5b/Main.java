package com.joinz.homework5b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input massive size");
		int[] mas = new int[sc.nextInt()];
		System.out.println(Arrays.toString(mas));

		for (int i = 0; i < mas.length; i++) {
			System.out.println("Input " + (i + 1) + "-th number");
			mas[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(mas));

		sc.close();
	}

}
