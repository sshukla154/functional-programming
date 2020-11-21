package programming.exercise;

import java.util.List;

public class FP01Exercises {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		printAllOddNumbersinListFunctional(numbers);

	}

	private static void printAllOddNumbersinListFunctional(List<Integer> numbers) {
		numbers.stream()
				.filter(number -> number%2!=0)// Stream
				.forEach(System.out::println);// Method Reference
	}

}
