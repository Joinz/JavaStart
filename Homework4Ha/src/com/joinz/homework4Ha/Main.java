package com.joinz.homework4Ha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input max height of flag");
		int h = sc.nextInt();
		
//		for (int i = 1; i < (h*2); i++) {
//			int m = h - Math.abs(h - i);
//			String stars = "*" + m;
//			System.out.println(stars);
//		}
		int m = 1;
		for (int i = 1; i < (h * 2); i++) {
			if (m == (h - Math.abs(h - i))) {
				System.out.println("*");
				m = 1;
			} else {
				System.out.print("*");
				m++;
				i--;
			}
		}
		
		sc.close();
	}

}
