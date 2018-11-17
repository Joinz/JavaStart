package com.joinz.homework3d;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input sides of triangle");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		if (((a + b) > c) && ((b + c) > a) && ((a + c) > b)) {
			System.out.println("Triangle exist");
		} else {
			System.out.println("Triangle does not exist");
		}
		
		sc.close();
	}

}
