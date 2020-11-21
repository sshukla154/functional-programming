package programming.exercise;

import java.util.List;

public class FP01Exercises3 {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

		printCourseContainsAsinListFunctional(courses);

	}

	private static void printCourseContainsAsinListFunctional(List<String> courses) {
		courses.stream()// Stream
				.filter(course -> course.contains("Spring"))
				.forEach(System.out::println);// Method Reference
	}

}
