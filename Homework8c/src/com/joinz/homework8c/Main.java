package com.joinz.homework8c;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File folder = new File(".");

	}

	/**
	 * ���������� ����� ������� ������� �� ����� ������ ���� ��������� �������
	 * ������ � �������� ������� ����� ���������� ����� ������.
	 **/
	public static void allFolders(File file) {
		if (file.isDirectory()) {
			
		} else {
			System.out.println("It's not folder!");
		}
	}
}
