package com.joinz.homework1c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("input circle radius");
		double radius = sc.nextDouble();
		double result = 2 * Math.PI * radius;
		System.out.println(result);

		sc.close();
	}

}
