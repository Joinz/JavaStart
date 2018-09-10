package com.joinz.homework3c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input year");
		int year = sc.nextInt();
		
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			System.out.println("It is a leap-year: it has 366 days");
		} else {
			System.out.println("It is not a leap-year: it has 365 days");
		}
	}

}
