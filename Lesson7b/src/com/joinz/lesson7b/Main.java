package com.joinz.lesson7b;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cl = Calendar.getInstance();
		
		cl.set(1994, Calendar.MARCH, 11);
		Date date = cl.getTime();
		System.out.println(date);
	}

}
