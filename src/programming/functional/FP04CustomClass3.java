package programming.functional;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP04CustomClass3 {

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

		/* using LIMIT utility */
		Comparator<Course> ascSortByNoOfStudents = Comparator.comparing(Course::getNoOfStudents);
		System.out.println("Only 5 courses : "
				+ courses.stream().sorted(ascSortByNoOfStudents).limit(5).collect(Collectors.toList()));

		/* using LIMIT and SKIP utility */
		System.out.println("Skip first 2 courses from 5 : "
				+ courses.stream().sorted(ascSortByNoOfStudents).limit(5).skip(2).collect(Collectors.toList()));
		System.out.println("Skip first 2 courses then give 5 : "
				+ courses.stream().sorted(ascSortByNoOfStudents).skip(2).limit(5).collect(Collectors.toList()));

		/* using takeWhile() utility */
		System.out.println(courses);
		/*
		 * when the criteria (course.getReviewScore() >= 95) is met, give all the
		 * previous elements
		 */
		System.out.println(
				courses.stream().takeWhile(course -> course.getReviewScore() >= 95).collect(Collectors.toList()));

		/*
		 * when the criteria (course.getReviewScore() >= 95) is met, give all the
		 * elements after that
		 */
		System.out.println(
				courses.stream().dropWhile(course -> course.getReviewScore() >= 95).collect(Collectors.toList()));

	}

}
