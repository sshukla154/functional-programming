package programming.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP06Streams4 {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "SpringBoot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");

		System.out.println(courses);
		System.out.println(courses.stream().collect(Collectors.joining()));
		System.out.println(courses.stream().collect(Collectors.joining(",")));
		System.out.println(courses.stream().collect(Collectors.joining(", ")));

		@SuppressWarnings("unused")
		String[] stringSplit = "Spring".split("");// {"S","p","r","i","n","g"}

		/*
		 * When we use spit over string (as above), we get array of string in which each
		 * char/string is placed in one ""
		 * 
		 * EG: {"S","p","r","i","n","g"}
		 * 
		 * And in below syso, we have a list in which each index (ie. String eg: Spring,
		 * spring boot etc...) is spited using split() which converts into String[] (eg:
		 * into {"S","p","r","i","n","g"}, {"s","p","r","i","n","g","b","o","o","t"})
		 * That means the output of complete out is List of String[] at it index.
		 * 
		 */
		System.out.println(courses.stream().map(course -> course.split("")).collect(Collectors.toList()));

		// Using flatMap(Arrays::stream) before collection will give the complete List
		// into one single string
		System.out.println(
				courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList()));

		// To get the distinct characters
		System.out.println(courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).distinct()
				.collect(Collectors.toList()));

		/*
		 * Map each element of course 1 to course2.
		 * 
		 * Eg: List1 = A1, B1, C1, D1, E1
		 * 
		 * List2 = A2, B2, C2, D2, E2
		 * 
		 * Output = [A1, A2], [A1, B2], [A1, C2], [A1, D2], [A1, E2],
		 * 			[B1, A2], [B1, B2], [B1, C2], [B1, D2], [B1, E2],
		 * 			[C1, A2], [C1, B2], [C1, C2], [C1, D2], [C1, E2], 
		 * 			[D1, A2], [D1, B2], [D1, C2], [D1, D2], [D1, E2],
		 * 			[E1, A2], [E1, B2], [E1, C2], [E1, D2], [E1, E2]
		 * 
		 */

		List<String> listString1 = List.of("A1", "B1", "C1", "D1", "E1");
		List<String> listString2 = List.of("A2", "B2", "C2", "D2", "E2");

		List<List<String>> collectComplete = listString1.stream()//
				.flatMap(//
						list1 -> listString2//
								.stream().//
								map(list2 -> List.of(list1, list2))//
				)//
				.collect(Collectors.toList());//

		System.out.println(collectComplete);

		List<String> listString3 = List.of("A", "B", "C", "D", "E");
		List<String> listString4 = List.of("A", "B", "C", "D", "E");
		List<List<String>> collectSameElements = listString3.stream()//
				.flatMap(//
						list1 -> listString4//
								.stream().//
								map(list2 -> List.of(list1, list2))//
				)//
				.filter(list -> list.get(0).equals(list.get(1)))
				.collect(Collectors.toList());//

		System.out.println(collectSameElements);

		List<List<String>> collectDifferentElements = listString3.stream()//
				.flatMap(//
						list1 -> listString4//
								.stream().//
								map(list2 -> List.of(list1, list2))//
				)//
				.filter(list -> !list.get(0).equals(list.get(1)))
				.collect(Collectors.toList());//
		System.out.println(collectDifferentElements);

		List<String> listString5 = List.of("AAA", "BFKJ", "CC", "4321D", "11E");
		List<String> listString6 = List.of("ABC", "ADB", "CC", "4312D", "ESFDGS");
		
		List<List<String>> collectSamelengthElements = listString5.stream()//
				.flatMap(//
						list1 -> listString6//
								.stream()//
								.filter(list2->list2.length()==list1.length())//
								.map(list2 -> List.of(list1, list2))//
				)//
				.filter(list -> !list.get(0).equals(list.get(1)))
				.collect(Collectors.toList());//
		System.out.println(collectSamelengthElements);
	}

}
