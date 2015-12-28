package com.mcnc.yuga.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.mcnc.yuga.mm.Week;

/**
 * @author sambathkakda
 *
 */
public final class DateUtils{
	
	static String formatDate = "yyyy-MM-dd";
	static String formatDateTime = "yyyy-MM-dd hh:mm:ss";
	
	/**
	 * @param date1
	 * @param date2
	 * @param timeUnit
	 * @return
	 */
	public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
	    long diffInMillies = date2.getTime() - date1.getTime();
	    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS) + 1;
	}
	
	/**
	 * @param date
	 * @return
	 */
	public static Week getThisWeek(Date date){

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		Calendar first = (Calendar) cal.clone();
	    first.add(Calendar.DAY_OF_WEEK, 
	              first.getFirstDayOfWeek() - first.get(Calendar.DAY_OF_WEEK));

	    // and add six days to the end date
	    Calendar last = (Calendar) first.clone();
	    last.add(Calendar.DAY_OF_YEAR, 6);
	    
	    
		return new Week(first.getTime(), last.getTime());
	}
	
	/**
	 * @param date
	 * @return
	 */
	public static Date getFirstDayOfWeek(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
		return cal.getTime();
	}
	
	/**
	 * @param date
	 * @return
	 */
	public static Date getLastDayOfWeek(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		return cal.getTime();		
	}
	
	/**
	 * @param date
	 * @return
	 */
	public static String format(Date date){
		
		DateFormat formatter = new SimpleDateFormat(formatDate);
		return formatter.format(date);
	}
	
	/**
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date format(String date) throws ParseException{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		return formatter.parse(date);
	}
	
	/**
	 * @return
	 */
	public static int getCurrentYear(){
		return Calendar.getInstance().get(Calendar.YEAR);
	}
	
	/**
	 * @param d
	 * @return
	 */
	public static Date getFirstDayOfYear(Date d){
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		return cal.getTime();
	}
	
	/**
	 * 
	 * @return
	 */
	public static Date getFirstDayOfCurrentMonth(){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);
		return cal.getTime();
	}
	
	/**
	 * get previous month
	 * @return month
	 */
	public static Date getPreviousMonth(){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -1);
		cal.set(Calendar.DATE, 1);
		return cal.getTime();
	}
	
	/**
	 * get year
	 * @return month
	 */
	public static int getYear(Date d){
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		return cal.get(Calendar.YEAR);
	}
	
	
	
}
