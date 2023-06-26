package cgg.labfunctionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//1. In the class LambdaExercise, create following static variables
//1. countries of type List<String>
//2. countryCapitals of type Map<String, String>  
//
//In a static block, initialize countries and countryCapitals with some values
//
//Define following static methods and provide the implementation as given below
//
//- displayCountries
//- Iterate through the List and display the list using forEach(Consumer) method
//
//- displayCountryCapitals
//- Iterate through the Map and display the map using forEach(BiConsumer) method
//
//- sortCountriesByName
//- Sort the List using Comparator(Lambda Exp). Sort in the reverse alphabetical order
//
//- sortCountriesBylength
//- Sort the List using Comparator, in descending order of number of characters in the country name.
//If the number of characters are same for a country, it should be sorted alphabetically
//(Use Comparator's static/default methods)
//
//- removeCountry(String name)
//- remove the countries whose name is greater than 6 characters
//
//
//Execute the methods and display the results in main method 

public class CountryCapitals {
	
	 private	static List<String> list=new ArrayList<String>();
	private static Map<String, String> map=new HashMap<>();
		
		static {
			list.add("Hyderabad");
			list.add("Mumbai");
			list.add("Banglore");
			list.add("Kolkatta");
			
			map.put("Telangana", "Hyderabad");
			map.put("Maharashtra", "Munbai");
			map.put("Karnataka", "Banglore");
			map.put("Kolkatta", "West Bengal");
			
		}
		
		static void displayCountries() {
			list.forEach(i->System.out.println(i));
			list.forEach(System.out::println);
		}
		
		static void  displayCountryCapitals() {
			
			map.forEach((k,v)->System.out.println("Countries: "+k+"\tCapitals: "+v));

		}
		static void sortCountriesByName() {
			Collections.sort(list,(a,b)->b.compareTo(a));
			list.forEach(System.out::println);
		}
		static void sortCountriesByLength() {
			
			Comparator<String> comp1=(a,b)->b.length()-a.length();
			Comparator<String> comp2=(a,b)->a.compareTo(b);
			
			Collections.sort(list,comp1.thenComparing(comp2));
			list.forEach(System.out::println);
			
		}
		static void removeCountry(String name) {
			
			list.remove(name);
			list.forEach(System.out::println);
			
		}

	public static void main(String[] args) {
		
		CountryCapitals.displayCountries();
		System.out.println("---------------------------------------------------------------------------");
		CountryCapitals.displayCountryCapitals();
		System.out.println("-----------------------------------------------------------------------------");
		CountryCapitals.sortCountriesByName();
		System.out.println("-----------------------------------------------------------------------------");
		CountryCapitals.sortCountriesByLength();
		System.out.println("------------------------------------------------------------------------------");
		CountryCapitals.removeCountry("Hyderabad");
		

	}

}
