package com.joinz.homework4Hb;

public class Main {

	public static void main(String[] args) {
		int max = 100;
		for (int i = 2; i <= max; i++) {
			int c = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.println(i);
			}
		}

	}

}
