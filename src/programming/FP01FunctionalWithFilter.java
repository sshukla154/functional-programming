package programming;

import com.sun.tools.javac.util.List;

public class FP01FunctionalWithFilter {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		printAllEvenNumbersinListFunctional(numbers);
	}

	private static boolean isEven(Integer number) {
		return (number % 2 == 0);
	}

	private static void printAllEvenNumbersinListFunctional(List<Integer> numbers) {
		numbers.stream().filter(FP01FunctionalWithFilter::isEven)// Filter - Only allow even numbers
				.forEach(System.out::println);// Method reference
	}

}
