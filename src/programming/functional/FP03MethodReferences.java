package programming.functional;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/*
 * 1. Method references as Instance Method
 * 2. Method references as Static Method
 * 3. Method references as Constructor reference
 */

public class FP03MethodReferences {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		System.out.println("Approach 1 (Instance Reference toUpperCase() of String) :"
				+ courses.stream().map(course -> course.toUpperCase()).collect(Collectors.toList()));
		System.out.println("Approach 2-i (Static references - User defined toUpperCase()) :"
				+ courses.stream().map(FP03MethodReferences::toUpperCase).collect(Collectors.toList()));
		System.out.println("Approach 2-ii (Static references - String class toUpperCase()) :"
				+ courses.stream().map(String::toUpperCase).collect(Collectors.toList()));

		// Method references as Constructor reference
		Supplier<String> supplier = String::new;

	}

	private static String toUpperCase(String inputString) {
		return inputString.toUpperCase();
	}
}
