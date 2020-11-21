package programming.exercise;

import java.util.List;

public class FP01Exercises5 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 5, 54, 123, 87, 31, 01, 10, 65, 3);
		printCubeOfOddNumbersinListFunctional(numbers);

	}

	private static void printCubeOfOddNumbersinListFunctional(List<Integer> numbers) {
		numbers.stream()// Stream
				.filter(number -> number % 2 != 0)// Odd
				.map(number -> number * number * number).forEach(System.out::println);// Method Reference
	}

}
