package programming.exercise;

import java.util.List;

public class FP02Exercises8 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		System.out.println("Sum : " + printSumAfterCubesOfListFunctional(numbers));

	}

	private static int printSumAfterCubesOfListFunctional(List<Integer> numbers) {
		return numbers.stream()// Stream
				.map(number -> number * number * number)// map - to find cube
				.reduce(0, (aggregator, nextNumber) -> aggregator + nextNumber);// Method
																				// Reference
	}

}
