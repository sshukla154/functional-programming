package programming.exercise;

import java.util.List;

public class FP02Exercises9 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		System.out.println("Sum : " + printAllOddNumbersinListFunctional(numbers));

	}

	private static Integer printAllOddNumbersinListFunctional(List<Integer> numbers) {
		return numbers.stream()// Stream
				.filter(number -> number % 2 != 0)// Filter - To get Odd numbers
				.reduce(0, (aggregator, nextNumber) -> (aggregator + nextNumber));// Reduce - to have aggregation
	}
}
