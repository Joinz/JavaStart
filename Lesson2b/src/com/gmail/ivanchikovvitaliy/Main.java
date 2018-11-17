package com.gmail.ivanchikovvitaliy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input fuilPrice and press Enter");
		double fuilPrice = sc.nextDouble();

		double fuil = 8;
		

		System.out.println("Input distance (km) and press Enter");
		int distance = sc.nextInt();
		double totalSum;

		totalSum = fuilPrice * (fuil / 100) * distance * 2;
		System.out.println(totalSum + " UAH");
		
		sc.close();

	}

}
