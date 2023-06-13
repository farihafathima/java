package cgg.labdateproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PrintDuration {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		String acceptedDate = null,acceptedDate1 = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("enter the date in the given formate dd/MM/yyyy");
	    try {
			 acceptedDate=bf.readLine();
			 System.out.println("enter the date in the given formate dd/MM/yyyy");
			 acceptedDate1=bf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    LocalDate date1 = LocalDate.parse(acceptedDate,formatter);
	    LocalDate date2 = LocalDate.parse(acceptedDate1,formatter);
	    Period period=date1.until(date2);
		System.out.println("Days : "+period.get(ChronoUnit.DAYS));
		System.out.println("Months: "+period.get(ChronoUnit.MONTHS));
		System.out.println("Years : "+period.get(ChronoUnit.YEARS));
		
	    
	    
		
		

	}

}
