package programming.functional;

import java.util.function.Predicate;

import java.util.List;

public class FP04CustomClass {

	public static void main(String[] args) {

		List<Course> courses = List.of(//
				new Course("Spring", "Framework", 93, 123342), //
				new Course("Spring Boot", "Framework", 98, 234432), //
				new Course("API", "Microservices", 96, 123342), //
				new Course("Microservices", "Microservices", 98, 13241), //
				new Course("Full Stack", "Full Stack", 99, 46745), //
				new Course("AWS", "Cloud", 91, 875889), //
				new Course("Azuru", "Cloud", 99, 17653), //
				new Course("Docker", "DevOps", 92, 65456), //
				new Course("Kubernetes", "DevOps", 91, 134431)//
		);

		// allMatch, nonMatch, anyMatch
		Predicate<Course> reviewGreaterThan95Predicate = course -> course.getReviewScore() > 95;
		Predicate<Course> reviewGreaterThan90Predicate = course -> course.getReviewScore() > 90;
		Predicate<Course> reviewLessThan90Predicate = course -> course.getReviewScore() < 90;

		System.out.println("allMatch---'");
		System.out.println(courses.stream().allMatch(reviewGreaterThan95Predicate));
		System.out.println(courses.stream().allMatch(reviewGreaterThan90Predicate));
		System.out.println(courses.stream().allMatch(reviewLessThan90Predicate));

		System.out.println("noneMatch---'");
		System.out.println(courses.stream().noneMatch(reviewGreaterThan95Predicate));
		System.out.println(courses.stream().noneMatch(reviewGreaterThan90Predicate));
		System.out.println(courses.stream().noneMatch(reviewLessThan90Predicate));

		System.out.println("anymatch---'");
		System.out.println(courses.stream().anyMatch(reviewGreaterThan95Predicate));
		System.out.println(courses.stream().anyMatch(reviewGreaterThan90Predicate));
		System.out.println(courses.stream().anyMatch(reviewLessThan90Predicate));

	}

}
