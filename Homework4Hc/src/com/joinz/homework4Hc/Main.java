package com.joinz.homework4Hc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input odd number");
		int n = sc.nextInt();
		if (n % 2 != 0) {
			for (int i = 1; i <= n; i++) {
				System.out.print("*");
			}
		} else {
			System.out.println("Wrong number!");
		}
		
		sc.close();
	}

}
