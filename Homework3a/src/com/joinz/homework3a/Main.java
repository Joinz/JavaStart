package com.joinz.homework3a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input integer number");
		int a = sc.nextInt();
		System.out.println("Input integer number");
		int b = sc.nextInt();
		System.out.println("Input integer number");
		int c = sc.nextInt();
		System.out.println("Input integer number");
		int d = sc.nextInt();
		
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}
		
		System.out.println("Max = " + max);
		
		sc.close();

	}

}
