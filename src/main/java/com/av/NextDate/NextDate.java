package com.av.NextDate;

import java.time.Year;
import java.util.Scanner;

public class NextDate {
	private int date;
	private int month,year;

	public String dateShower1(int date,int month,int year)
	{
		Scanner scanner=new Scanner(System.in);
		int[] monthDays=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		int newDate,newMonth,newYear,noOfDays;
		System.out.println("Enter the Date,Month,Year:");
		this.date=date;
		this.month=month;
		this.year=year;
		
		if(year<=2000 || year>2022)
		{
			return "invalid year";
			
		}
		
		if(month<=0 || month>12)
		{
			return "invalid month";
			
		}
		
		noOfDays=monthDays[month-1];
		if(date<=0 || date>noOfDays)
		{
			return "invalid date";
			
		}
		
		if(month==2)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					noOfDays=29;
				}
			}
			else
			{
				if(year%4==0)
				{
					noOfDays=29;
				}
			}
		}
		newDate=date+1;
		newMonth=month;
		newYear=year;
		if(newDate>noOfDays)
		{
			newDate=1;
			newMonth++;
		}
		if(newMonth>12)
		{
			newMonth=1;
			newYear++;
			
			
		}
		System.out.println("given date is: "+date+"/"+month+"/"+year);
		System.out.println("next Date is:"+newDate+"/"+newMonth+"/"+newYear);
		return "next Date is:"+newDate+"/"+newMonth+"/"+newYear;
	}

	

	
	
	
	
	

}
