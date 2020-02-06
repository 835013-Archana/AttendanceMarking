package com.cognizant.attendance.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date convertToDate(String date) {
		try {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			format.setLenient(false);
			return format.parse(date); // Converting from string to date
		} catch (ParseException e) {
			System.out.println("Date/Format went Wrong");
		}
		return null; // will not be executed

	}
	public static java.sql.Date convertUtilToSql(java.util.Date utilDate){
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		return sqlDate;
	}
}