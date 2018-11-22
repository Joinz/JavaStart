package com.joinz.homework1a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Input 5-digit number");
		if (sc.hasNextInt()) {
			number = sc.nextInt();

			if ((number / 10000) >= 1) {
				if ((number / 10000 <= 9)) {
					int char1 = number / 10000;
					String ch1 = char1 + "\n";
					int char2 = number % 10000 / 1000;
					String ch2 = char2 + "\n";
					int char3 = number % 1000 / 100;
					String ch3 = char3 + "\n";
					int char4 = number % 100 / 10;
					String ch4 = char4 + "\n";
					int char5 = number % 10;
					String ch5 = char5 + "\n";

					String result = ch1 + ch2 + ch3 + ch4 + ch5;
					System.out.println(result);
				} else {
					System.out.println("You entered more than 5 digits");
				}
			} else {
				System.out.println("You entered less than 5 digits");
			}
		} else {
			System.out.println("You did not enter an integer");
		}

		sc.close();
	}

}
