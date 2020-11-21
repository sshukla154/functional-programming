package programming;

import java.util.List;

public class FP01Exercises2 {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

		printAllCoursesinListFunctional(courses);

	}

	private static void printAllCoursesinListFunctional(List<String> courses) {
		courses.stream()// Stream
				.forEach(System.out::println);// Method Reference
	}

}
