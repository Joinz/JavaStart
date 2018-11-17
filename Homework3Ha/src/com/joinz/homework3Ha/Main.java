package com.joinz.homework3Ha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input X");
		double x = sc.nextDouble();
		System.out.println("Input Y");
		double y = sc.nextDouble();
		double radius = 4;
		double area = Math.pow(radius, 2);
		double point = Math.pow(x, 2) + Math.pow(y, 2);
		if (point <= area) {
			System.out.println("Point (" + x + ", " + y + ") belong to a circle");
		} else {
			System.out.println("Point (" + x + ", " + y + ") does not belong to a circle");
		}
		
		sc.close();
	}

}
