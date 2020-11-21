package programming.functional;

import java.util.List;
import java.util.function.Predicate;

/*
 * In Step-4 we are passing the behavior/logic/algorithm as an argument 
*/

public class FP03BehaviourParameterization {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(10, 20, 54, 123, 87, 31, 01, 10, 65, 23);

		/* Step-1 : Output for printing even values */
		numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);

		/* Output for printing odd values */
		numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);

		/* Step 2: Re-factor above outputs */

		Predicate<? super Integer> evenPredicate = number -> number % 2 == 0;
		numbers.stream().filter(evenPredicate).forEach(System.out::println);

		Predicate<? super Integer> oddPredicate = number -> number % 2 != 0;
		numbers.stream().filter(oddPredicate).forEach(System.out::println);

		/*
		 * Step 3: Re-factor above outputs and create a method which takes the
		 * List<integer> and typeOfPredicate as parameter
		 */
		filterAndPrint(numbers, evenPredicate);
		filterAndPrint(numbers, oddPredicate);

		/* Step 4: Re-factor the above input parameter in filterAndPrint() */
		filterAndPrint(numbers, number -> number % 2 == 0);
		filterAndPrint(numbers, number -> number % 2 != 0);

	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> evenPredicate) {
		numbers.stream().filter(evenPredicate).forEach(System.out::println);

	}
}