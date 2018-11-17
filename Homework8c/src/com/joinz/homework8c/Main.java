package com.joinz.homework8c;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File folder = new File(".");

	}

	/**
	 * Реализуйте метод который выведет на экран список всех каталогов которые
	 * «лежат» в каталоге который будет параметром этого метода.
	 **/
	public static void allFolders(File file) {
		if (file.isDirectory()) {
			
		} else {
			System.out.println("It's not folder!");
		}
	}
}
