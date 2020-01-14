package com.cts.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		/*Date date=new Date(0);
		//Date date=new Date(0);
		//System.out.println(date);
		int day=date.getDay();
		switch(day)
		{
		case 0 : System.out.println("Sunday");
		break;
		case 1 : System.out.println("Monday");
		break;
		case 2 : System.out.println("Tuesday");
		break;
		case 3 : System.out.println("Wednesday");
		break;
		case 4 : System.out.println("Thursday");
		break;
		case 5 : System.out.println("Friday");
		break;
		case 6 : System.out.println("Satruray");
		break;
		default : System.out.println("Error");
		break;
		
		}*/
		
		/*//Example 1
		TodayDate today=new TodayDate();
		today.display();*/
		
		/*//Example 2
		TodayDate today=new TodayDate();
		today.display();*/
		
		//Example 3 //Example4
//		TodayDate today=new TodayDate();
//		today.display();
		
		//Example 12
//		ZoneTest zonet=new ZoneTest();
//		zonet.display();
		
		//Example15
//		MonthTest m=new MonthTest();
//		m.display();
		
		//Example 16
//		ZoneOffset zone=new ZoneOffset();
//		zone.display();
		
		//Example19
		Test test=new Test();
		test.display();
		
		
		
}
}
//Example 1 - How to get today's date in Java 8
//class TodayDate
//{
//	LocalDate date=LocalDate.now();
//	public  void display() {
//	System.out.println("today's date is :"+date);
//	}
//}

//Example 2 - How to get current day, month and year in Java 8
//class TodayDate
//{
//	LocalDate date=LocalDate.now();
//	int day=date.getDayOfMonth();
//	int month=date.getMonthValue();
//	int year=date.getYear();
//	public  void display() {
//	   System.out.println("Year :" +year+ "Month :" +month+ "day :" +day);
//		}
//}

//Example 3 - How to get a particular date in Java 8
//class TodayDate
//{
//	LocalDate date=LocalDate.of(1997, 8, 07);
//	public  void display() {
//	System.out.println("  :"+date);
//	}
//}


//Example 4 - How to check if two dates are equal in Java 8
//class TodayDate
//{
//	LocalDate today=LocalDate.now();
//	LocalDate birthday=LocalDate.of(1997, 8, 30);
//	public  void display() {
//		if(birthday.equals(today))
//		{
//			System.out.println("dates equal" +birthday);
//		}
//		else
//		{
//			System.out.println("Dates are not Equal");
//		}
//	}
//}


//Example 5 - How to check for recurring events e.g. birthday in Java 8
//class TodayDate
//{
//	LocalDate today=LocalDate.now();
//	LocalDate next=today.plus(1, ChronoUnit.WEEKS);//How to find Date after 1 week
//	LocalTime current1=LocalTime.now();//For current time
//  LocalTime newTime=current1.plusHours(2);//to add 2 hours
//	LocalDate birthday=LocalDate.of(1985, 8, 18);
//	MonthDay birth=MonthDay.of(birthday.getMonthValue(), birthday.getDayOfMonth());
//	MonthDay current=MonthDay.from(today);
//	public  void display() {
//		System.out.println("Today's date is :"+today);
//		System.out.println("1 week Later date is :"+next);
//		System.out.println("Current time is :"+current1);
//		System.out.println("New  time is :"+newTime);
		
//		if(birth.equals(current))
//		{
//			System.out.println("equal");
//		}
//		else
//		{
//			System.out.println("Dates are not Equal");
//		}
//	}
//	}

//Example 12 - Dealing with time zones in Java 8
//class ZoneTest
//{
//	ZoneId zoneId=ZoneId.of("Europe/Paris.");
//	
//	LocalDateTime localDateTime=LocalDateTime.now();
//	ZonedDateTime zonedDateTime=ZonedDateTime.of(localDateTime, zoneId);
//	public  void display()
//	{
//		System.out.println("Date and Time in chennai :"+zonedDateTime);
//	}
//}

//Example15
//class MonthTest
//{
//	LocalDate myBirthday=LocalDate.of(2020, 8, 30);
//	LocalDate today =LocalDate.now();
//	Period months=Period.between(today, myBirthday);
//	public void display()
//	{
//		System.out.println("months left"+months.getMonths());
//	}
//}

//Example16
//class ZoneOffset
//{
//	LocalDateTime localdatetime=LocalDateTime.of(2020, 8, 30, 12, 05, 01);
//	ZoneOffset zoneOffset=ZoneOffset.of("+05:30");
//	OffsetDateTime offsetdatetime=OffsetDateTime.of(localdatetime, zoneOffset);
//	public void display()
//	{
//		System.out.println("Local DateTime Zone :"+offsetDateTime);
//	}
//}

//Example 19
class Test
{
	String date="20160819";
	
	LocalDate formatted=LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
	public void display()
	{
		System.out.printf("The format of %s is %s \t%n",date,formatted);
		
	}
}
	