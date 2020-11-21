package programming.functional;

import com.sun.tools.javac.util.List;

public class FP01FunctionalWithLambda {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		printAllEvenNumbersinListFunctional(numbers);
	}

	/*
	 * 1. Converting number into stream 2. Applying filter(/Lambda) on each number
	 * of stream 3. After filtering, applying forEach() over each number of stream
	 * using method reference
	 */
	private static void printAllEvenNumbersinListFunctional(List<Integer> numbers) {
		numbers.stream()// Stream
				.filter(number -> (number % 2 == 0))// Lambda - Only allow even numbers
				.forEach(System.out::println);// Method reference
	}

}
