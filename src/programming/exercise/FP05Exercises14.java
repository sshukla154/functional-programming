package programming.exercise;

import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FP05Exercises14 {

	public static void main(String[] args) {

		IntUnaryOperator upperLimitOfStream = new IntUnaryOperator() {
			@Override
			public int applyAsInt(int input) {
				return (input + 2);
			}
		};
		System.out.print("10 Even digits from 0 : Approach 1 : ");
		IntStream.iterate(0, upperLimitOfStream).limit(10).forEach(number -> System.out.print(number + " "));
		System.out.println();
		System.out.print("10 Even digits from 2 : Approach 2 : ");
		IntStream.iterate(2, number -> (number + 2)).limit(10).forEach(number -> System.out.print(number + " "));
		System.out.println();
		System.out.print("10 Odd digits from 1 : Approach 2 : ");
		IntStream.iterate(1, number -> (number + 1)).limit(10).forEach(number -> System.out.print(number + " "));
		System.out.println();
		IntUnaryOperator squareOperator = new IntUnaryOperator() {

			@Override
			public int applyAsInt(int inputNumber) {
				return inputNumber * 2;
			}

		};

		System.out.print("Square of First 10 digits from 1 : Approach 1 : ");
		IntStream.iterate(1, squareOperator).limit(10).forEach(number -> System.out.print(number + " "));
		System.out.println();
		System.out.print("Square of First 10 digits from 1 : Approach 2 : ");
		/*
		 * Cannot apply collect() over IntStream() directly, we need to first box it
		 * using boxed()
		 */
		IntStream.iterate(1, num -> num * 2).limit(10).boxed().collect(Collectors.toList())
				.forEach(number -> System.out.print(number + " "));
	}
}
