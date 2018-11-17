package com.joinz.lesson4c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inpurt max h");
		int h = sc.nextInt();
		
		for (int i = 1; i <= h; i++ ) {
			for (int j = 1; j <= h + 1; j++) {
				if (j >= h + 1 - i) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
