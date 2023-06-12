package cgg.LocalDate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalDate t=LocalDate.of(2014, Month.JUNE, 2);
		System.out.println("Telanagan:"+t);
		
		System.out.println("Tommorrow's Date:"+date.plusDays(1));
		
		System.out.println("Last Month: "+date.minusMonths(-1));
		
		System.out.println("is leap year ? :"+date.isLeapYear());
		System.out.println("Move to 3oth day of the month: "+date.withDayOfMonth(30));
		System.out.println("date with year: "+date.withDayOfYear(160));
		
		

	}

}
