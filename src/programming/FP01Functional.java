package programming;

import com.sun.tools.javac.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		printAllNumbersinListFunctional(numbers);

	}

	private static void print(Integer number) {
		System.out.println(number);
	}

	private static void printAllNumbersinListFunctional_01(List<Integer> numbers) {
		// Convert the number into stream of elements

		System.out.println("Non-Static method reference---");
		// Method reference for non-static method
		numbers.stream().forEach(number -> print(number));

		System.out.println();

		System.out.println("Static method reference---");
		// Method reference for static method
		numbers.stream().forEach(FP01Functional::print);

		System.out.println();

		System.out.println("Static method reference---");
		// Method reference for static method
		numbers.stream().forEach(System.out::println);
	}

	/*
	 * 1. Converting number into stream 2. Applying method reference over each
	 * number of stream
	 */
	private static void printAllNumbersinListFunctional(List<Integer> numbers) {
		numbers.stream()// Stream
				.forEach(System.out::println);// Method Reference
	}

}
