package com.joinz.homework3Hd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 6-digit number");
		int n = sc.nextInt();
		int n1 = n / 100000;
		int n2 = n % 100000 / 10000;
		int n3 = n % 10000 / 1000;
		int n4 = n % 1000 / 100;
		int n5 = n % 100 / 10;
		int n6 = n % 10;
		if ((n / 100000 > 9) || (n / 100000 == 0)) {
			System.out.println("Wrong number!");
		}else if (n1 == n6 && n2 == n5 && n3 == n4) {
			System.out.println("It is palendrom!");
		} else {
			System.out.println("It isn't palendrom");
		}
		
		sc.close();
	}

}
