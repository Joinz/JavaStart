package com.joinz.homework1a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input 5-digit number");
		int number = sc.nextInt();

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

	}

}
