package programming.functional;

import java.util.List;

public class FP02FunctionalWithLambda {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		System.out.println("Sum : " + addListFunctional(numbers));

	}

	private static int addListFunctional(List<Integer> numbers) {
		return numbers.stream()// Stream
				.reduce(0, (aggregate, nextNumber) -> aggregate + nextNumber);// reduce the list from 0 to last value
																				// using sum() into single value
	}

}
