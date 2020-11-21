package programming;

import java.util.List;

public class FP01Exercises6 {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker",
				"Java", "Kubernetes");

		printCourseWithLengthAtleastFourListFunctional(courses);

	}

	private static void printCourseWithLengthAtleastFourListFunctional(List<String> courses) {
		courses.stream()// Stream
				.map(course -> course.length())// Lambda
				.forEach(System.out::println);// Method Reference
	}

}
