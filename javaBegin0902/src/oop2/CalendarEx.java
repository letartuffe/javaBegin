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
		
		// Calendar Ŭ������ ��ü�� ������
		cal = Calendar.getInstance();
		
		year = cal.get(cal.YEAR);	
		
		System.out.println("������ " + year + "�� ");
	}

}
























