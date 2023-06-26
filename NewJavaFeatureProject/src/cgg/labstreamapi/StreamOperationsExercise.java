package cgg.labstreamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Create a class StreamOperationsExercise as below
//- Create a List of Players, as a static variable, with some player objects
//
//Define following static methods and provide the implementation using Java 8 streams API as given below
//
//- displayPlayers
//	Display the names of all players
//
//- displayPlayersForCountry(String country)
//	Display the name of players whose highest score is more than 100 and belong to a particular country
//	
//- getPlayerNames
//	Return a LinkedList containing names of all Players, whose have scored more than 5000 runs, sorted in descending order of names
//
//- getAverageRunsByCountry(String country)
//	Return the average runs scored by players from a particular Country
//
//- getPlayerNamesSorted
//	Return a list with names of Players sorted as per country and then by matchesPlayed(descending)
//
//- getPlayerCountry
//	return a map with the PlayerName and CountryName of all players who have played more than 200 matches
//
//- getMaxRunsPlayer
//	Return the player who has scored maximum runs
//
//- findPlayer(String name, String country)
//	Search and return the player for a given name and country 
//
//- checkHighScorerByCountry(String country)
//  	Find whether there is any player in the given country who has scored more than 10000 runs. Return a boolean. 
//
//
//Execute the above methods in the main method.
public class StreamOperationsExercise {
	private static ArrayList<player> list=new ArrayList<player>();
	static {
		Country c1=new Country(1,"India");
		Country c2=new Country(2,"Pakistan");
		Country c3=new Country(3,"England");
		list.add(new player("Virat",12,523,126,c1));
		list.add(new player("Virat2",44,587,226, c2));
		list.add(new player("Virat3",17,610,123,c3));
		list.add(new player("Virat4",52,58,186,c1));
		list.add(new player("Virat5",10,54,129,c1));
	}
	
	static void displayPlayers() {
		Stream<player> stream = list.stream();
		stream.forEach(System.out::println);
	}
	static void displayPlayersForCountry(String country) {
		Stream<player> filter = list.stream().filter(s->s.getCountry().getCountry().equals(country) && s.getHighestScore()>100);
		filter.forEach(System.out::println);
	}
	static void getPlayerNames() {
		 LinkedList<String> collect = list.stream().filter(s->s.getRuns()>500).map(n->n.getPlayerName()).collect(Collectors.toCollection(LinkedList::new));
		Collections.sort(collect,(a,b)->b.compareTo(a));
		collect.forEach(System.out::println);
	}
	static void getAverageRunsByCountry(String country) {
	 OptionalDouble average = list.stream().filter(s->s.getCountry().getCountry().equals(country)).mapToInt(n->n.getRuns()).average();
	System.out.println(average.getAsDouble());
	}
	static void getPlayerNamesSorted() {
		Comparator<player> comparing = Comparator.comparing(player::getRuns).reversed();
		
		Stream<player> sorted = list.stream().sorted(Comparator.comparing((player s)->s.getCountry().getCountry()).thenComparing(comparing));
		
		sorted.forEach(System.out::println);
	}
	static void getPlayerCountry() {
		Map<String, String> collect = list.stream().collect(Collectors.toMap( n->n.getPlayerName(),s->s.getCountry().getCountry()));
		collect.forEach((k,v)->System.out.println("keys: "+k+"\t values: "+v));
	}
	
	static void getMaxRunsPlayer() {
		
	OptionalInt max = list.stream().mapToInt(s->s.getRuns()).max();
	Stream<player> filter = list.stream().filter(s->s.getRuns()==max.getAsInt());
	
	filter.forEach(System.out::println);
	}
	static void findPlayer(String name, String country) {
		Stream<String> map = list.stream().filter(s->s.getPlayerName()==name &&s.getCountry().getCountry()==country).map(s->s.getPlayerName());
		map.forEach(System.out::println);
	}
	static void checkHighScorerByCountry(String country) {
		Stream<String> map = list.stream().filter(s->s.getCountry().getCountry()==country && s.getHighestScore()>1000).map(n->n.getPlayerName());
		map.forEach(System.out::println);
	}
	public static void main(String[] args) {
		System.out.println("------------------------displayPlayers()-------------------------------");
		StreamOperationsExercise.displayPlayers();
		System.out.println("----------------------------displayPlayersForCountry(\"india\")-------------------------------------");
		StreamOperationsExercise.displayPlayersForCountry("India");
		System.out.println("--------------------------getPlayerNames();------------------------------------------------------");
		StreamOperationsExercise.getPlayerNames();
		System.out.println("----------------------------------getAverageRunsByCountry(\"India\")----------------------------------------------------------");
		StreamOperationsExercise.getAverageRunsByCountry("India");
		System.out.println("------------------------------------------ getPlayerNamesSorted()--------------------------------------------------");
		StreamOperationsExercise.getPlayerNamesSorted();
		System.out.println("-------------------------------getPlayerCountry();-----------------------------------------------------");
		StreamOperationsExercise.getPlayerCountry();
		System.out.println("--------------------------------getMaxRunsPlayer()---------------------------------------");
		StreamOperationsExercise.getMaxRunsPlayer();
		System.out.println("---------------------------------findPlayer(\"Virat\", \"India\");---------------------------------");
		StreamOperationsExercise.findPlayer("Virat", "India");
		System.out.println("-----------------------------------checkHighScorerByCountry(\"india\");-------------------------------------------------------");
		StreamOperationsExercise.checkHighScorerByCountry("India");
		
	}

}
 