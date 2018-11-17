package com.joinz.lesson5c;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int[] pay = new int[12];
		Random rnd = new Random();
		
		for (int i = 0; i < pay.length; i++) {
			pay[i] = rnd.nextInt(15000) + 15000;
		}
		System.out.println(Arrays.toString(pay));
		
		int sum = 0;
		for (int i = 0; i < pay.length; i++) {
			sum += pay[i];
		}
		System.out.println("Average = " + sum/12);
		
	}

}
