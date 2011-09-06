package oop2;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar cal;
		
		int year;
		int month;
		int day;
		
		int hour;
		int minute;
		int second;
		
		String ampm;
		String[] weekDay;
		
		// Calendar 클래스의 객체를 얻어오기
		cal = Calendar.getInstance();
		
		year = cal.get(cal.YEAR);	
		
		System.out.println("오늘은 " + year + "년 ");
	}

}
























