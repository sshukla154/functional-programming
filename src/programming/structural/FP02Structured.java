package programming.structural;

import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		int sum = addListStructured(numbers);
		System.out.println("Sum : " + sum);
	}

	private static int addListStructured(List<Integer> numbers) {
		int sum = 0;
		for (Integer number : numbers) {
			sum += number;
		}
		return sum;
	}

}
