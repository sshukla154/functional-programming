package programming.functional;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*reduce(), distinct(), sorted(), sorted(comparator()), sorted(comparator(comparing())), collect(Collectors.toList())*/

public class FP02Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(01, 10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		System.out.println("Sum (Reduce Example) : ");
		addListFunctional(numbers);

		System.out.println("Distinct List<Integer> : ");
		distinctListFunctional(numbers);
		System.out.println("Sort List<Integer> (Ascending Order) : ");
		sortedListFunctional(numbers);
		System.out.println("Sort List<Integer> (Natural Order) : ");
		naturalSortedListFunctional(numbers);
		System.out.println("Sort List<Integer> (Descending Order): ");
		reverseSortedListFunctional(numbers);
		System.out.println("Distinct Sort List<Integer> (Descending Order): ");
		distinctSortedListFunctional(numbers);

		System.out.println("Double the list (Collectors Example): ");
		doubleList(numbers);

		List<String> courses = List.of("API", "Spring", "Spring Boot", "Java", "API", "MicroServices", "AWS", "PCF",
				"Azure", "Docker", "Java", "Kubernetes");

		System.out.println("Distinct List<String> : ");
		distinctStringListFunctional(courses);
		System.out.println("Sort List<String> (Ascending Order) : ");
		sortedStringListFunctional(courses);
		System.out.println("Sort List<String> (Natural Order) : ");
		naturalSortedStringListFunctional(courses);
		System.out.println("Sort List<String> (Descending Order): ");
		reverseSortedStringListFunctional(courses);
		System.out.println("Distinct Sort List<String> (Descending Order): ");
		distinctSortedStringListFunctional(courses);
		System.out.println("Sort List<String> By String Length (Ascending Order): ");
		distinctSortedByLengthOfStringListFunctional(courses);

	}

	private static int sum(int aggregate, int nextNumber) {
		// System.out.println(aggregate + ", " + nextNumber);
		return aggregate + nextNumber;
	}

	private static void addListFunctional(List<Integer> numbers) {
		System.out.println(numbers.stream()// Stream
				.reduce(0, FP02Functional::sum));// reduce the list from 0 to last value using sum() into single value
	}

	private static void distinctListFunctional(List<Integer> numbers) {
		numbers.stream()// Stream
				.distinct()// Distinct - Will get the distinct list
				.forEach(System.out::println);
		System.out.println();
	}

	private static void sortedListFunctional(List<Integer> numbers) {
		numbers.stream()// Stream
				.sorted()// Distinct - Will get the distinct list
				.forEach(System.out::println);
		System.out.println();
	}

	private static void naturalSortedListFunctional(List<Integer> numbers) {
		numbers.stream()// Stream
				.sorted(Comparator.naturalOrder())// Distinct - Will get the distinct list
				.forEach(System.out::println);
		System.out.println();
	}

	private static void reverseSortedListFunctional(List<Integer> numbers) {
		numbers.stream()// Stream
				.sorted(Comparator.reverseOrder())// Distinct - Will get the distinct list
				.forEach(System.out::println);
		System.out.println();
	}

	private static void distinctSortedListFunctional(List<Integer> numbers) {
		numbers.stream()// Stream
				.distinct()// Distinct - Will get the distinct list
				.sorted()// Sorted - Will sort the distinct list
				.forEach(System.out::println);
	}

	private static void distinctStringListFunctional(List<String> courses) {
		courses.stream().distinct().forEach(System.out::println);
		System.out.println();
	}

	private static void sortedStringListFunctional(List<String> courses) {
		courses.stream().sorted().forEach(System.out::println);
		System.out.println();
	}

	private static void naturalSortedStringListFunctional(List<String> courses) {
		courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		System.out.println();
	}

	private static void reverseSortedStringListFunctional(List<String> courses) {
		courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println();
	}

	private static void distinctSortedStringListFunctional(List<String> courses) {
		courses.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println();
	}

	private static void distinctSortedByLengthOfStringListFunctional(List<String> courses) {
		courses.stream().distinct().sorted(Comparator.comparing(x -> x.length())).forEach(System.out::println);
	}

	private static void doubleList(List<Integer> numbers) {
		System.out.println(numbers.stream().map(number -> number * number).collect(Collectors.toList()));
	}
}
