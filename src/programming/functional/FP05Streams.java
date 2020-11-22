package programming.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FP05Streams {

	public static void main(String[] args) {

		/* List converted into Stream has return type of "ReferencePipeline" */
		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		System.out.println(numbers.stream());
		System.out.println("Stream Sum : " + numbers.stream().reduce(0, (x, y) -> x + y));
		numbers.stream().max(Integer::compare);
		numbers.stream().min(Integer::compare);
		System.out.println();
		/*
		 * Stream directly created using of() which has return type of
		 * "ReferencePipeline"
		 */
		Stream<Integer> streamOf = Stream.of(10, 11, 20, 22, 30, 33, 40, 44, 50, 55);
		System.out.println(streamOf);
		System.out.println("Stream Sum : " + streamOf.reduce(0, (x, y) -> x + y));
		numbers.stream().max(Integer::compare);
		numbers.stream().min(Integer::compare);
		System.out.println();
		/*
		 * Stream created from INT ARRAY has specific return type ------ PREFFERED
		 * APPROACH
		 */
		int[] numberArray = { 10, 11, 20, 22, 30, 33, 40, 44, 50, 55 };
		System.out.println("Observe return type : " + Arrays.stream(numberArray));
		System.out.println("Stream Sum : " + Arrays.stream(numberArray).sum());
		System.out.println("Stream Average : " + Arrays.stream(numberArray).average());
		System.out.println("Stream Min : " + Arrays.stream(numberArray).min());
		System.out.println("Stream Max : " + Arrays.stream(numberArray).max());

	}

}
