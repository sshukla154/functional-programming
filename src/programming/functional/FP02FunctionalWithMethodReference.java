package programming.functional;

import java.util.List;

public class FP02FunctionalWithMethodReference {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		System.out.println("Sum : " + addListFunctional(numbers));

	}

	private static int addListFunctional(List<Integer> numbers) {
		return numbers.stream()// Stream
				.reduce(0, Integer::sum);// Method Reference
	}

}
