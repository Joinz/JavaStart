package com.joinz.lesson4a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int number = 1;
//
//		while (number <= 10) {
//			System.out.println(number);
//			number = number + 1;
//		}

//		do {
//			System.out.println(number);
//			number++;
//		} while (number <= 10);

//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}

//		for (; number <= 10;) {
//			System.out.println(number);
//			number++;
//		}

		for (int i = 1; i <= 20; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("SpamEgg");
			} else if (i % 3 == 0) {
				System.out.println("Spam");
			} else if ((i % 5 == 0)) {
				System.out.println("Egg");
			} else {
				System.out.println(i);
			}

		}

		sc.close();
	}

}
