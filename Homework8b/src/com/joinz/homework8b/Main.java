package com.joinz.homework8b;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("a.txt");
		Random rnd = new Random();
		int[][] mas = new int[5][10];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rnd.nextInt(10);
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		arrayToFile(mas, file);

	}

	/**
	 * Method writes array to file.
	 * @param array [] [] int
	 * @param file File
	 */
	public static void arrayToFile(int[][] array, File file) {
		String text = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j == 0) {
					text += "{ ";
				}
				text += array[i][j];
				if (j == array[i].length-1 ) {
					text += " }";
				} else {
					text += ", ";
				}
			}
			text += System.lineSeparator();
		}
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.print(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
