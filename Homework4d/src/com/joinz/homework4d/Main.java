package com.joinz.homework4d;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input height");
		int h = sc.nextInt();
		System.out.println("Input width");
		int w = sc.nextInt();
		
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if ((j == 1) ||  (j == w) || (i == 1) || (i == h)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
