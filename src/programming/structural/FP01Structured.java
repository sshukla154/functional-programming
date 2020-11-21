package programming.structural;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		printAllNumbersinListStructured(numbers);
		
		System.out.println("---");

		printAllEvenNumbersinListStructured(numbers);
	}

	private static void printAllNumbersinListStructured(List<Integer> numbers) {
		for (Integer number : numbers) {
			System.out.println(number);
		}
	}

	private static void printAllEvenNumbersinListStructured(List<Integer> numbers) {
		for (Integer number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
	}

}
