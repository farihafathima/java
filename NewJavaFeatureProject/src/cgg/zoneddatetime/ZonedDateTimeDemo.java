package cgg.zoneddatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime zt = ZonedDateTime.now();
		
		ZonedDateTime zonedtime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		
		System.out.println("time in india : "+zt);
		System.out.println("time in paris : "+zonedtime);
		
		ZonedDateTime of = ZonedDateTime.of(2023, 05, 12, 4, 30, 20, 23456, ZoneId.of("America/Chicago"));
		
		System.out.println("Time in america : "+of);
	}

}
