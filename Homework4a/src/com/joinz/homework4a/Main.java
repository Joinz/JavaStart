package com.joinz.homework4a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input quantity of lines");
		int lines = sc.nextInt();
		int h = 5;
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= lines; j++) {
				if (j % 2 == 0) {
					System.out.print("+++");
				} else {
					System.out.print("***");
				}
			}
			System.out.println();
		}

	}

}
