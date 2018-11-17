package com.joinz.homework3Hc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 4-digit number");
		int number = sc.nextInt();
		int n1 = number / 1000;
		int n2 = number % 1000 / 100;
		int n3 = number % 100 / 10;
		int n4 = number % 10;
		
		if ((n1 + n2) == (n3 + n4)) {
			System.out.println("It is lucky number!=)");
		} else {
			System.out.println("It is not a lucky number =(");
		}
		sc.close();
	}

}
