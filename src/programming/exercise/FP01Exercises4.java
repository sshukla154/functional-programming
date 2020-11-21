package programming;

import java.util.List;

public class FP01Exercises4 {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker",
				"Java", "Kubernetes");

		printCourseWithLengthAtleastFourListFunctional(courses);

	}

	private static void printCourseWithLengthAtleastFourListFunctional(List<String> courses) {
		courses.stream()// Stream
				.filter(course -> course.length() >= 4)// Lambda
				.forEach(System.out::println);// Method Reference
	}

}
