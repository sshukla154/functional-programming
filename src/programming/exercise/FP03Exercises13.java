package programming.exercise;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP03Exercises13 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		System.out.println("2x : " + mapAndCreatingNewList(numbers, x -> x * x));
		System.out.println("3x : " + mapAndCreatingNewList(numbers, x -> x * x * x));
		System.out.println("4x : " + mapAndCreatingNewList(numbers, x -> x * x * x * x));
		System.out.println("5x : " + mapAndCreatingNewList(numbers, x -> x * x * x * x * x));
		System.out.println("6x : " + mapAndCreatingNewList(numbers, x -> x * x * x * x * x * x));
	}

	private static List<Integer> mapAndCreatingNewList(List<Integer> numbers,
			Function<? super Integer, ? extends Integer> mappingFunction) {
		return numbers.stream().map(mappingFunction).collect(Collectors.toList());
	}

}
