package com.crm.JavaUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender {

	

	public static String startDate() {
		 Date date = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		String currentDate = sim.format(date);
		return currentDate;
	}
		
	public static String afterDate()
	{
		 Date date = new Date();
			SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
			String currentDate = sim.format(date);
	
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 82);
		String afterDate = sim.format(cal.getTime());
		return afterDate;
	}
	
	
	}

