package com.joinz.homework5a;

public class Main {

	public static void main(String[] args) {
		int [] mas = { 0, 5, 2, 4, 7, 1, 3, 19 };
		int c = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 != 0) {
				c++;
			}
		}
		System.out.println(c);
		c = 0;
		for (int i : mas) {
			if (i % 2 != 0) {
				c++;
			}
		}
		System.out.println(c);
	}

}
