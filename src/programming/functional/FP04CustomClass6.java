package programming.functional;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FP04CustomClass6 {

	public static void main(String[] args) {

		List<Course> courses = List.of(//
				new Course("Spring", "Framework", 98, 123342), //
				new Course("Spring Boot", "Framework", 95, 234432), //
				new Course("API", "Microservices", 97, 123342), //
				new Course("Microservices", "Microservices", 98, 13241), //
				new Course("Full Stack", "Full Stack", 99, 46745), //
				new Course("AWS", "Cloud", 91, 875889), //
				new Course("Azuru", "Cloud", 99, 17653), //
				new Course("Docker", "DevOps", 99, 65456), //
				new Course("Kubernetes", "DevOps", 91, 134431)//
		);
		// Group-By Category
		System.out.println(courses.stream().collect(Collectors.groupingBy(course -> course.getCategory())));

		// Count of each course
		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));

		// Highest review in specific category -- Static Approach
		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,
				Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));

		// Highest review in specific category -- Instance Approach
		System.out.println(courses.stream().collect(Collectors.groupingBy(course -> course.getCategory(),
				Collectors.maxBy(Comparator.comparing(course -> course.getReviewScore())))));

		// Group-By Category and get only name in result
		System.out.println(courses.stream().collect(Collectors.groupingBy(course -> course.getCategory(),
				Collectors.mapping(Course::getName, Collectors.toList()))));

	}

}
