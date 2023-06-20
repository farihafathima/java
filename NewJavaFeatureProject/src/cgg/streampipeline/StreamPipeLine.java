package cgg.streampipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipeLine {

	public static void main(String[] args) {
		Stream<String> onceModifiedStream = Stream.of("abcd","efgh","hujki").skip(1);
		onceModifiedStream.forEach(System.out::println);
		System.out.println("-------------------------------------------------------");
		
		Stream<String> stream = Stream.of("abcd1","efgh1","hujki1");
		Stream<String> twiceModifiedStream = stream.map(e->e.substring(0,3));
		twiceModifiedStream.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------");
		
		List<String> list = Arrays.asList("abc1","abc2","abc3");
		long count = list.stream().skip(1).map(e->e.substring(0,3)).sorted().count();
		System.out.println(count);
		
		

	}

}
