package com.joinz.homework6d;


public class Main {

	public static void main(String[] args) {
		int[] mas = { 3, 10, 5, 3, 7 };
		System.out.println(findElement(mas, 7));
	}
	/**
	 * Finding the element in massive.
	 * @param array int[]
	 * @param a int
	 * @return <b>index</b> of found element or <b>-1</b>.
	 */
	static int findElement(int[] array, int a) {
		int ret = -1;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == a) {
				ret = i+1;
			}
		}
		return ret;
	}
}
