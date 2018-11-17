package com.joinz.homework4b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number (4<number<16)");
		int n = sc.nextInt();
		int fuck = 1;
		if ((n > 4) && (n < 16)) {
			for (int i = 1; i <= n; i++) {
				fuck *= i;
			}
			System.out.println(fuck);
		} else {
			System.out.println("Wrong number!");
		}
		
		sc.close();
	}

}
