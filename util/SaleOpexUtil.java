package com.mcnc.yuga.util;

import java.util.List;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.mcnc.yuga.dto.Project;
import com.mcnc.yuga.helper.key.GPType;

/**
* The SaleOpex is an application that
* use for filtering SaleOpex by Month and Year.
*
* @author  Kimsour Son
* @Email sonkimsour@gmail.com, sonkimsour@mcnc.co.kr
* @version 2.0
* @since 04-12-2014 
*/

public abstract class SaleOpexUtil {
	
	/*
	 * Filter OpexCharge by month and by year
	 * @Param Project, gpType
	 * @Return Map
	 */
	public static Map<Integer, Map<Integer, Double>> getOpexChargeFilter(Project project, Map<Integer, Map<String, Double>> gpType) throws Exception{

		Calendar startDate = Calendar.getInstance();
		Calendar endDate = Calendar.getInstance();
		startDate.setTime(project.getStartDate());
		endDate.setTime(project.getEndDate());
		
		Map<Integer, Map<Integer, Double>> saleOpexByYear = null;
		int totalDays = getCountDays(startDate.getTime(), endDate.getTime());
		
		if(startDate.get(Calendar.YEAR) == endDate.get(Calendar.YEAR)){
			
			saleOpexByYear = new HashMap<Integer, Map<Integer, Double>>();
			saleOpexByYear.put(startDate.get(Calendar.YEAR),getOpexFilterByMonth(startDate, endDate, totalDays, getTotalOpex(project, gpType, startDate.get(Calendar.YEAR))));
			
			return saleOpexByYear;
			
		}else if(startDate.get(Calendar.YEAR) < endDate.get(Calendar.YEAR)){
			
			saleOpexByYear = new HashMap<Integer, Map<Integer, Double>>();
			Calendar nextYear = Calendar.getInstance();
			Calendar thisYear = Calendar.getInstance();
			int daysOfYear = 0;
			
			for(int i = startDate.get(Calendar.YEAR); i <= endDate.get(Calendar.YEAR); i++ ){
				if(i < endDate.get(Calendar.YEAR)){			
					
					thisYear.setTime(startDate.getTime());
					nextYear.set(i + 1, 0, 1);
					daysOfYear = getCountDays(thisYear.getTime(), nextYear.getTime());
					
					double saleOpex = (daysOfYear * getTotalOpex(project, gpType, i)) / totalDays;
					saleOpexByYear.put(i, getOpexFilterByMonth(thisYear, nextYear, daysOfYear, saleOpex));
					thisYear.setTime(nextYear.getTime());
					
				}else if(i == endDate.get(Calendar.YEAR)){		
					
					thisYear.set(endDate.get(Calendar.YEAR), 0, 1);
					daysOfYear = getCountDays(thisYear.getTime(), endDate.getTime());
					double saleOpex = (daysOfYear * getTotalOpex(project, gpType, i)) / totalDays;
					saleOpexByYear.put(i, getOpexFilterByMonth(thisYear, endDate, daysOfYear, saleOpex));
				}
			}
			return saleOpexByYear;
		} // end if
		return null;
	}
	
	/*
	 * Filter OpexCharge by month
	 * @Param startDate, endDate, totalDays, yearSaleOpex
	 * @Return Map
	 */
	private static Map<Integer, Double> getOpexFilterByMonth(Calendar startMonth, Calendar endMonth, int totalDays, double yearSaleOpex) {
		Map<Integer, Double> monthSaleOpex = new HashMap<Integer, Double>();
		DateFormatSymbols dateFormatSystembos = new DateFormatSymbols();
		String[] dateNames = dateFormatSystembos.getMonths();
		
		if(startMonth.get(Calendar.YEAR) == endMonth.get(Calendar.YEAR)) {
			if(startMonth.get(Calendar.MONTH) == endMonth.get(Calendar.MONTH)){
				
				monthSaleOpex.put(startMonth.get(Calendar.MONTH), yearSaleOpex);
				return monthSaleOpex;
				
			}else if(startMonth.get(Calendar.MONTH) < endMonth.get(Calendar.MONTH)) {
				
				Calendar thisMonth = Calendar.getInstance();
				thisMonth.setTime(startMonth.getTime());
				List<Integer> months = new ArrayList<Integer>();
				double firstOpex = 0.00d;
				double lastOpex = 0.00d;
				
				for(int i = thisMonth.get(Calendar.MONTH); i <= endMonth.get(Calendar.MONTH); i++){
					if( i < endMonth.get(Calendar.MONTH)) {
						if(thisMonth.get(Calendar.DAY_OF_MONTH) > 1) {
							
							int days = (startMonth.getMaximum(Calendar.DAY_OF_MONTH) - startMonth.get(Calendar.DAY_OF_MONTH)) + 1;
							firstOpex = (days * yearSaleOpex) / totalDays;
							monthSaleOpex.put(startMonth.get(Calendar.MONTH), firstOpex);
							
						}else {
							
							months.add(thisMonth.get(Calendar.MONTH));
							thisMonth.set(thisMonth.get(Calendar.YEAR), i + 1, 1);
							
						}
					}else if(i == endMonth.get(Calendar.MONTH)) {
						if(endMonth.get(Calendar.DAY_OF_MONTH) < endMonth.getMaximum(Calendar.DAY_OF_MONTH)){
							
							int days = endMonth.get(Calendar.DAY_OF_MONTH);
							lastOpex = (days * yearSaleOpex) / totalDays;
							monthSaleOpex.put(endMonth.get(Calendar.MONTH), lastOpex);
							
						}else {
							months.add(endMonth.get(Calendar.MONTH));
						}
					}
				}
				
				double monthSaleOpxs = (yearSaleOpex - (firstOpex + lastOpex)) / months.size();
				for(int i = 0; i < months.size(); i++) {
					monthSaleOpex.put(months.get(i), monthSaleOpxs);
				}
				
				return monthSaleOpex;
			}
			return null;
		}else if((startMonth.get(Calendar.YEAR) < endMonth.get(Calendar.YEAR)) && dateNames[endMonth.get(Calendar.MONTH)].equalsIgnoreCase("January")){
			if(startMonth.get(Calendar.DAY_OF_MONTH) > 1) {
				double firstMonthOpex = 0.00d;
				int days = (startMonth.getMaximum(Calendar.DAY_OF_MONTH) - startMonth.get(Calendar.DAY_OF_MONTH)) + 1;
				firstMonthOpex = (days * yearSaleOpex) / totalDays;
				monthSaleOpex.put(startMonth.get(Calendar.MONTH), firstMonthOpex);

				double remainSaleOpex = (yearSaleOpex - firstMonthOpex) / (12 - (startMonth.get(Calendar.MONTH) + 1));
				for(int i = startMonth.get(Calendar.MONTH) + 1; i < 12; i++){
					monthSaleOpex.put(i, remainSaleOpex);
				}
				return monthSaleOpex;
			}else{
				double remainSaleOpex = yearSaleOpex / (12 - startMonth.get(Calendar.MONTH));
				for(int i = startMonth.get(Calendar.MONTH); i < 12; i++){
					monthSaleOpex.put(i, remainSaleOpex);
				}
				return monthSaleOpex;			
			}
		}
		return null;
	}
	
	/*
	 * Calculate OpexCharge by year
	 * @Param Project, gpType, year
	 * @Return double
	 */
	private static double getTotalOpex(Project project, Map<Integer, Map<String, Double>> gpType, Integer year){
		Double gpService = gpType.get(year).get(GPType.SERVICE_REVENUE.getValue());
		Double gpLicense = gpType.get(year).get(GPType.LICENSE_REVENUE.getValue());
		Double gpOutsource = gpType.get(year).get(GPType.VENDER_REVENUE.getValue());
		
		double serviceRevenue= gpService != null ? (project.getSiRevenue() + project.getSmRevenue()) * gpService : 0;
		double licenseRevenue = gpLicense != null ? project.getLicenseRevenue() * gpLicense : 0;
		double outsourcingRevenue = gpOutsource != null ? (project.getOutsourceRevenue() - project.getVendorSolution()) * gpOutsource : 0;
		return (serviceRevenue + licenseRevenue + outsourcingRevenue) / 100;
		
	}
	
	
	/*
	 * Count day from date to date
	 * (1000ms = 1s) x (60s = 1mm) x (60mm = 1h) x (24h = 1day) = 1 days
	 * @Param startDate, endDate
	 * @Return int
	 */
	private static int getCountDays( Date startDate, Date endDate ) {
		
		return (int) ((endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24));
		
	}
}
