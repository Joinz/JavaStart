package com.joinz.homework5Ha;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[][] arr = { {1, 2, 3}, {1, 2, 3}, {1, 2, 3} };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println(System.lineSeparator());
		
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				temp = arr[i][j];
				arr[i][j] = arr[arr.length - (i+1)][i];
				arr[arr.length - (i+1)][i] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
