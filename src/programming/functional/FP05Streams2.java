package programming.functional;

import java.util.stream.IntStream;

public class FP05Streams2 {

	public static void main(String[] args) {

		// To have a list of range - Doesn't includes the last value
		IntStream range = IntStream.range(1, 10);
		System.out.print("Range : ");
		range.forEach(number -> System.out.print(number + " "));
		System.out.println();

		// To have a list of range - Includes the last value too
		IntStream rangeClosed = IntStream.rangeClosed(1, 10);
		System.out.print("Range closed : ");
		rangeClosed.forEach(number -> System.out.print(number + " "));
		System.out.println();

		/*
		 * Using some ALOGRITHM for generating the list eg: some odd or even or specific
		 * range values
		 * 
		 * In this we will create a stream starting from 15, each with a gap of +2 and
		 * upto 10 numbers
		 */

		IntStream iterateStream = IntStream.iterate(15, num -> num + 2).limit(10);
		System.out.print("IterateStream : ");
		iterateStream.forEach(number -> System.out.print(number + " "));
		System.out.println();
		
		//

	}

}
