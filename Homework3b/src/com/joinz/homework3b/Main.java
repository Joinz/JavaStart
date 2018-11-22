package com.joinz.homework3b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input flat number");
		int flatNumber = sc.nextInt() - 1;
		int floors = 9;
		int porches = 4;
		int flatsOnFloor = 4;
		int flatsInPorch = flatsOnFloor * floors;
		int porch = flatNumber / flatsInPorch + 1;
		int floor = flatNumber % flatsInPorch / 4 + 1;
		if ((flatNumber >= 0) && (flatNumber < flatsInPorch * porches)) {
			System.out.println("It is " + porch + " porch, " + floor + " floor");
		} else {
			System.out.println("404");
			System.out.println("404 WTF!!!");
		}

		sc.close();
	}

}
