package programming.functional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*
In this we can see the MIGHT BE BEHAVIOUR of Functional programming - NOT EXACT IMPLEMENTATION
- The Functional representation of square of even elements
- Internally extracting the input parameter of filter(), map() and forEach() 
	filter() : Predicate functional interface as return type. test() as default method of boolean return type. 
	map() : Function functional interface as return type). apply() as default method of Integer return type.
	forEach() : Consumer functional interface as return type). accept() as default method of void return type.
*/

public class FP03FunctionalInterfaces {

	public static void main(String[] args) {

		List<Integer> number = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);

		System.out.println("Output of normal functional programming : ");
		
		/* STEP 1: The Functional representation of square of even elements */
		number.stream().filter(x -> x % 2 == 0) // Lambda expression is passed as parameter in filter()
				.map(x -> x * x) // Lambda expression is passed as parameter in map()
				.forEach(System.out::println); // Method is passed as parameter in forEach()

		System.out.println("Output when lambda and method is extracted as local variable : ");
		/*
		 * STEP 2 (Simplifying above Step 1) : extracting out local variables from each
		 * function ie: filter(), map(), forEach()
		 */

		Predicate<? super Integer> isEvenPredicate = x -> x % 2 == 0;
		Function<? super Integer, ? extends Integer> squareMapperFunction = x -> x * x;
		Consumer<Integer> action = System.out::println;

		number.stream().filter(isEvenPredicate) // Lambda expression is passed as parameter in filter()
				.map(squareMapperFunction) // Lambda expression is passed as parameter in map()
				.forEach(action); // Method is passed as parameter in forEach();

		System.out.println("Output when return type is simplified by removing ? : ");
		/*
		 * STEP 3 (Simplifying Step 2) : Removing ? from above local variables
		 */

		Predicate<Integer> isEvenPredicate_1 = x -> x % 2 == 0;
		Function<Integer, Integer> squareMapperFunction_1 = x -> x * x;
		Consumer<Integer> action_1 = System.out::println;

		number.stream().filter(isEvenPredicate_1) // Lambda expression is passed as parameter in filter()
				.map(squareMapperFunction_1) // Lambda expression is passed as parameter in map()
				.forEach(action_1); // Method is passed as parameter in forEach();

		System.out.println("Output when Predicate, Function and Consume default method is over-riddden : ");
		/*
		 * STEP 4 (Simplifying Step 3) : When assigning to local variable what is
		 * internally happening something as below
		 */

		Predicate<Integer> isEvenPredicate_2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer x) {
				return (x % 2 == 0);
			}
		};
		Function<Integer, Integer> squareMapperFunction_2 = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer x) {
				return x * x;
			}
		};
		Consumer<Integer> action_2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer x) {
				System.out.println(x);
			}
		};

		number.stream().filter(isEvenPredicate_2) // Lambda expression is passed as parameter in filter()
				.map(squareMapperFunction_2) // Lambda expression is passed as parameter in map()
				.forEach(action_2); // Method is passed as parameter in forEach();

	}
}
