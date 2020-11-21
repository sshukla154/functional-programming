package programming.functional;

import java.util.List;
import java.util.function.Predicate;

public class FP04CustomClass5 {

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

		Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
		//sum()
		System.out.println(courses//
				.stream()//
				.filter(reviewScoreGreaterThan95Predicate)//
				.mapToInt(Course::getNoOfStudents)//
				.sum());
		//average()  
		System.out.println(courses//
				.stream()//
				.filter(reviewScoreGreaterThan95Predicate)//
				.mapToInt(Course::getNoOfStudents)//
				.average());
		//count()
		System.out.println(courses//
				.stream()//
				.filter(reviewScoreGreaterThan95Predicate)//
				.mapToInt(Course::getNoOfStudents)//
				.count());
		//max()
		System.out.println(courses//
				.stream()//
				.filter(reviewScoreGreaterThan95Predicate)//
				.mapToInt(Course::getNoOfStudents)//
				.max());
		//min()
		System.out.println(courses//
				.stream()//
				.filter(reviewScoreGreaterThan95Predicate)//
				.mapToInt(Course::getNoOfStudents)//
				.min());
	}

}
