package programming.functional;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03FunctionalInterfaces2 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);
		numbers.stream().forEach(number -> System.out.print(number + " "));
		System.out.println();
		/*
		 * Predicate<T> - Represents a predicate (boolean-valued function) of one
		 * argument.
		 */
		Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
		System.out.println("isEvenPredicate : " + isEvenPredicate.test(15));

		/*
		 * Function<T,R> - Represents a function that accepts one argument and produces
		 * a result.
		 */
		Function<Integer, Integer> squareFunction = x -> x * x;
		System.out.println("squareFunction : " + squareFunction.apply(18));

		/*
		 * Consumer<T> - Represents an operation that accepts a single input argument
		 * and returns no result.
		 */
		Consumer<Integer> consumerExample = x -> System.out.println();
		System.out.print("consumerExample : ");
		consumerExample.accept(98);

		/*
		 * BinaryOperator<T> - Represents an operation upon two operands of the same
		 * type, producing a result of the same type as the operands.
		 */
		BinaryOperator<Integer> sumBinaryOperator = (number1, number2) -> number1 + number2;
		System.out.println("sumBinaryOperator : " + sumBinaryOperator.apply(123, 321));

		/* Supplier<T> - Represents a supplier of results. */
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt();
		};
		System.out.println("randomIntegerSupplier : " + randomIntegerSupplier.get());

		/*
		 * UnaryOperator<T> - Represents an operation on a single operand that produces
		 * a result of the same type as its operand.
		 */
		UnaryOperator<Integer> unaryOperatorExample = (number) -> {
			Random random = new Random();
			return random.nextInt(50) + number;
		};
		System.out.println("unaryOperatorExample : " + unaryOperatorExample.apply(10));

		/*
		 * BiPredicate<T,U> - Represents a predicate (boolean-valued function) of two
		 * arguments.
		 */
		BiPredicate<Integer, Integer> biPredicateExample = (number1, number2) -> {
			return number1 > number2;
		};
		System.out.println("BiPredicate Example : " + biPredicateExample.test(20, 102));
		/*
		 * BiFunction<T,U,R> - Represents a function that accepts two arguments and
		 * produces a result.
		 */
		BiFunction<Integer, Integer, Integer> biFunctionExample = (number1, number2) -> {
			return number1 + number2;
		};
		System.out.println("biFunctionExample : " + biFunctionExample.apply(10, 20));

		/*
		 * BiConsumer<T,U> - Represents an operation that accepts two input arguments
		 * and returns no result.
		 */
		BiConsumer<String, String> biConsumerExample = (string1, string2) -> {
			System.out.println(string1 + " " + string2);
		};
		System.out.print("biConsumerExample : ");
		biConsumerExample.accept("Hello", "World !!!");

		/*
		 * IntBinaryOperator - Represents an operation upon two int-valued operands and
		 * producing an int-valued result.
		 */
		IntBinaryOperator intBinaryOperatorExample = (number1, number2) -> {
			return number1 * number2;
		};
		System.out.println("intBinaryOperatorExample : " + intBinaryOperatorExample.applyAsInt(300, 500));

		/*
		 * IntConsumer - Represents an operation that accepts a single int-valued
		 * argument and returns no result.
		 */
		IntConsumer intConsumerExample = (number) -> {
			Random random = new Random();
			System.out.println(random.nextInt(25) * number);
		};
		System.out.print("intConsumerExample : ");
		intConsumerExample.accept(500);
		/*
		 * IntFunction<R> - Represents a function that accepts an int-valued argument
		 * and produces a result.
		 */
		IntFunction<Integer> intFunctionExample = (number) -> {
			return number * (new Random().nextInt(10));
		};
		System.out.println("intFunctionExample : " + intFunctionExample.apply(500));

		/*
		 * IntPredicate - Represents a predicate (boolean-valued function) of one
		 * int-valued argument.
		 */
		IntPredicate intPredicateExample = (number) -> {
			return number > 50;
		};
		System.out.println("intPredicateExample : " + intPredicateExample.test(500));
		/*
		 * 
		 * /* IntSupplier - Represents a supplier of int-valued results.
		 */

		IntSupplier intSupplierExample = () -> {
			return new Random().nextInt(25) * 3;
		};
		System.out.println("intSupplierExample : " + intSupplierExample.getAsInt());
		/*
		 * /* IntToDoubleFunction - Represents a function that accepts an int-valued
		 * argument and produces a double-valued result.
		 */
		IntToDoubleFunction intToDoubleFunctionExample = (number) -> {
			return number;
		};
		System.out.println("intToDoubleFunctionExample : " + intToDoubleFunctionExample.applyAsDouble(15));
		/*
		 * 
		 * /* IntToLongFunction - Represents a function that accepts an int-valued
		 * argument and produces a long-valued result.
		 */
		IntToLongFunction intToLongFunctionExample = (number) -> {
			return number;
		};
		System.out.println("intToLongFunctionExample : " + intToLongFunctionExample.applyAsLong(15));
		/*
		 * IntUnaryOperator - Represents an operation on a single int-valued operand
		 * that produces an int-valued result.
		 */

		IntUnaryOperator intUnaryOperatorExample = (number) -> {
			return number;
		};
		System.out.println("intUnaryOperatorExample : " + intUnaryOperatorExample.applyAsInt(15));
	}
}
