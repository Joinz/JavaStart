package com.joinz.homework3a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input any 4 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
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
		System.out.println(max);
		
		sc.close();
	}
}
