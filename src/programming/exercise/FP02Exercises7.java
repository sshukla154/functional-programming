package programming.exercise;

import java.util.List;

public class FP02Exercises7 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		System.out.println("Sum : " + printSumAfterSquareOfListFunctional(numbers));

	}

	private static Integer printSumAfterSquareOfListFunctional(List<Integer> numbers) {
		return numbers.stream()// Stream
				.map(number -> number * number)// Map - for square
				.reduce(0, (x, y) -> x + y);// Reduce - for aggregating

	}

}
