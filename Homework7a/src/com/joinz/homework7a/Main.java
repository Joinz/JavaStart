package com.joinz.homework7a;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		
		Calendar cl = Calendar.getInstance();
		date = cl.getTime();
		getMs(date);
	}

	public static int getMs(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cl = Calendar.getInstance();
		Calendar cl1 = Calendar.getInstance();
		cl1.set(Calendar.MONTH, cl.get(Calendar.MONTH) - 1);
		
		System.out.println(sdf.format(cl.getTime()));
		System.out.println(sdf.format(cl1.getTime()));
		return 1;
	}
}
