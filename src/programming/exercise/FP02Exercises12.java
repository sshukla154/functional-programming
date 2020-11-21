package programming.exercise;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class FP02Exercises12 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		System.out.println(numbers.stream().reduce(0, Integer::sum));

		// STEP:1 - get the local variable
		BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
		System.out.println(numbers.stream().reduce(0, sumBinaryOperator));

		BinaryOperator<Integer> sumBinaryOperator_1 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer aggrigator, Integer nextInteger) {
				return aggrigator + nextInteger;
			}
		};

		System.out.println(numbers.stream().reduce(0, sumBinaryOperator_1));

	}

}
