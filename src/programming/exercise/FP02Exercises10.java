package programming.exercise;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Exercises10 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		System.out.println("List with even numbers : " + listOfEvenNumberInListFunctional(numbers));

	}

	private static List<Integer> listOfEvenNumberInListFunctional(List<Integer> numbers) {
		return numbers.stream()// Stream
				.filter(number -> number % 2 == 0)// Filter - To get even numbers
				.collect(Collectors.toList());// Reduce - to have aggregation
	}
}
