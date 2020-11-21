package programming.exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Exercises11 {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker",
				"Java", "Kubernetes");
		System.out.println("List<Stirng> By length : " + listByLength(courses));

	}

	private static List<String> listByLength(List<String> courses) {
		return courses.stream().sorted(Comparator.comparing(x -> x.length()))// Filter - To get Odd numbers
				.collect(Collectors.toList());// Reduce - to have aggregation
	}
}
