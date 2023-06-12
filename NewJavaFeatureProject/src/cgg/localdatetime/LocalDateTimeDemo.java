package cgg.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime dt= LocalDateTime.now();
		System.out.println("current date time :"+dt);
		
		LocalDateTime of = LocalDateTime.of(2020, 3, 24, 12, 56);
		System.out.println("with of method : "+of);
		
		System.out.println("next week : "+dt.plusWeeks(01));
		
		System.out.println("lastweek : "+dt.minusWeeks(01));
		
		System.out.println("with methods "+dt.withYear(2020));
	}

}
