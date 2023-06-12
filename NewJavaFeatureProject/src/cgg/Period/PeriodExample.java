package cgg.Period;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class PeriodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate start = LocalDate.of(2014, Month.JUNE, 2);
		LocalDate end = LocalDate.now();
		Period period = start.until(end);
		
		System.out.println("Days : "+period.get(ChronoUnit.DAYS));
		System.out.println("Months: "+period.get(ChronoUnit.MONTHS));
		System.out.println("Years : "+period.get(ChronoUnit.YEARS));
		
		
		System.out.println("--------------------------------------------");
		
		LocalDate initialDate = LocalDate.now();
		LocalDate finalDate = initialDate.plus(Period.ofDays(5));
		int days=period.between(initialDate, finalDate).getDays();
		System.out.println(days+" days");

		
		
		
		System.out.println("------------------------------------------------");
		
		long between = ChronoUnit.DAYS.between(initialDate, finalDate);
		System.out.println(between+ " days");
		
		
		LocalDate today = LocalDate.now();
		LocalDate bod = LocalDate.of(2001, Month.MARCH, 2);
		Period p=Period.between(bod,today);
		long between2 = ChronoUnit.DAYS.between(bod,today);
		
		
		System.out.println("You are "+p.getYears()+" years"+p.getMonths()+" months, and"+p.getDays()+" days old("+between2+"Days Total)");
	
		//to calculate next birthDay
		
		LocalDate nextBod = bod.withYear(today.getYear());
	//if your birth day has already add 1 in the year
		if(nextBod.isBefore(today)|| nextBod.isEqual(today)) {
			
			nextBod=nextBod.plusYears(1);
			
			
		}
		
		p=Period.between(today,nextBod);
	between2=ChronoUnit.DAYS.between(today,nextBod);
		System.out.println("There are "+p.getMonths()+" months, and"+p.getDays()+" days until your next birthday.("+between2+"total)");
	
		
		LocalTime initial= LocalTime.of(6, 30,0);
		LocalTime final1 = initial.plus(Duration.ofSeconds(30));
		
		Long seconds=Duration.between(initial,final1).getSeconds();
		System.out.println(seconds);
		
		long between3=ChronoUnit.SECONDS.between(initial, final1);
		System.out.println(between3);
		
		
		//Date and Time formatting 
		
		DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		LocalDate currentDate=LocalDate.now();
		System.out.println(currentDate.format(formatter));
		
		System.out.println("------------------------------------------------------------------------");

		DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		LocalTime currentTime=LocalTime.now();
		System.out.println(currentTime.format(formatter1));
		
		
	System.out.println("--------------------------------------------------------");
	
	DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	String text="12/03/2001";
	LocalDate date = LocalDate.parse(text,formatter3);
	System.out.println(date);
	
	System.out.println("-----------------------------------------------------------");
	
	DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("HH-mm-ss");
	String time="12-40-20";
	LocalTime newTime=LocalTime.parse(time,formatter4);
	System.out.println(newTime);
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
