package programming.functional;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/*
 * Point-1 : First comparator sort the List than min() or max() is applied
 * Point-2 : Output is Optional (It handles the NPE)
 */

public class FP04CustomClass4 {

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

		Comparator<Course> comparatorByNoOfStudentAndNoOfReviews = Comparator.comparing(Course::getNoOfStudents)
				.thenComparing(Course::getReviewScore);

		System.out.println(courses.stream().max(comparatorByNoOfStudentAndNoOfReviews));
		System.out.println(courses.stream().min(comparatorByNoOfStudentAndNoOfReviews));

		// Example of Optional.empty
		Predicate<Course> reviewLessThan90Predicate = course -> course.getReviewScore() < 90;
		System.out
				.println(courses.stream().filter(reviewLessThan90Predicate).min(comparatorByNoOfStudentAndNoOfReviews));
		// If need to print any value instead of Optional.empty then use orElse()
		System.out.println(courses.stream().filter(reviewLessThan90Predicate).min(comparatorByNoOfStudentAndNoOfReviews)
				.orElse(new Course("DS and ALGO", "Interview Preparation", 99, 1236745)));
		// Find first
		System.out.println(courses.stream().findFirst());
		// Find any
		System.out.println(courses.stream().sorted(comparatorByNoOfStudentAndNoOfReviews).findAny());
	}

}
