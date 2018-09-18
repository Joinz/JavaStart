package com.joinz.homework6c;

public class Main {

	public static void main(String[] args) {
		int h = 5;
		int w = 4;
		printRectangle(h, w);
	}
	/**
	 * Drawing rectangle with specified width and height.
	 * @param h int height
	 * @param w int width
	 */
	public static void printRectangle(int h, int w ) {
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
