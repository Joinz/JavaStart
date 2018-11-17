package com.joinz.lesson3a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input a");
		int a = sc.nextInt();
		System.out.println("Input b");
		int b = sc.nextInt();
		System.out.println("Input c");
		int c = sc.nextInt();
		int max;

		if (a > b) {
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else if (b > c) {
			max = b;
		} else {
			max = c;
		}
		System.out.println(max);
		
		max = a;
		
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		System.out.println(max);
		
		int day = sc.nextInt();
		switch (day) {
			case 2: System.out.println("monday");
			break;
			case 3: System.out.println("tuesday");
			break;
		}

		sc.close();
	}

}
