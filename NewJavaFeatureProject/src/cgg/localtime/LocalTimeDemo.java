package cgg.localtime;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime time=LocalTime.now();
		
		System.out.println("current time: "+time);
		
		LocalTime of = LocalTime.of(5, 12, 30);
		System.out.println("with off :"+of);
		
		System.out.println("Next hour: "+time.plusHours(1));
		System.out.println("Next hour: "+time.minusHours(1));
		System.out.println("Next hour: "+time.isAfter(of));
		System.out.println(time.withMinute(45));

	}

}
