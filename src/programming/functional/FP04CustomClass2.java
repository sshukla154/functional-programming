package programming.functional;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP04CustomClass2 {

	public static void main(String[] args) {

		List<Course> courses = List.of(//
				new Course("Spring", "Framework", 93, 123342), //
				new Course("Spring Boot", "Framework", 98, 234432), //
				new Course("API", "Microservices", 96, 123342), //
				new Course("Microservices", "Microservices", 98, 13241), //
				new Course("Full Stack", "Full Stack", 99, 46745), //
				new Course("AWS", "Cloud", 91, 875889), //
				new Course("Azuru", "Cloud", 99, 17653), //
				new Course("Docker", "DevOps", 99, 65456), //
				new Course("Kubernetes", "DevOps", 91, 134431)//
		);

		Comparator<Course> ascSortByNoOfStudents = Comparator.comparing(Course::getNoOfStudents);
		System.out.println("ASC Sort by noOfStudents : "
				+ courses.stream().sorted(ascSortByNoOfStudents).collect(Collectors.toList()));

		Comparator<Course> descSortByNoOfStudents = Comparator.comparing(Course::getNoOfStudents).reversed();
		System.out.println("DESC Sort by noOfStudents : "
				+ courses.stream().sorted(descSortByNoOfStudents).collect(Collectors.toList()));

		/*
		 * First compared by noOfStudents and if found equal then compared by
		 * noOfReviews
		 */
		Comparator<Course> comparatorByNoOfStudentAndNoOfReviews = Comparator.comparing(Course::getNoOfStudents)
				.thenComparing(Course::getReviewScore);
		System.out.println("ASC Sort by noOfStudents and noOfReview : "
				+ courses.stream().sorted(comparatorByNoOfStudentAndNoOfReviews).collect(Collectors.toList()));

		/*
		 * Above we have compared() using comparing but it is always proffered to use
		 * comparingInt(), comparingDouble() or comparingLong() as below. Re-writting
		 * the above as
		 */

		Comparator<Course> ascSortByNoOfStudents_1 = Comparator.comparingInt(Course::getNoOfStudents);
		Comparator<Course> descSortByNoOfStudents_1 = Comparator.comparingInt(Course::getNoOfStudents).reversed();
		Comparator<Course> comparatorByNoOfStudentAndNoOfReviews_1 = Comparator.comparingInt(Course::getNoOfStudents)
				.thenComparingInt(Course::getReviewScore);

		System.out.println("ASC sort : "
				+ courses.stream().sorted(ascSortByNoOfStudents_1).collect(Collectors.toList()));
		System.out.println("DESC Sort : "
				+ courses.stream().sorted(descSortByNoOfStudents_1).collect(Collectors.toList()));
		System.out.println("ASC Sort by noOfStudents and noOfReview : "
				+ courses.stream().sorted(comparatorByNoOfStudentAndNoOfReviews_1).collect(Collectors.toList()));
	}

}
