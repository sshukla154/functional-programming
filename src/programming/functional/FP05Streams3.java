package programming.functional;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class FP05Streams3 {

	public static void main(String[] args) {

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);

		// 0 because output is out of range of Integer: So we will get the output and
		// map it to BigInteger
		System.out.println(IntStream.rangeClosed(1, 50).reduce(1, (x, y) -> x * y));

		System.out.println(IntStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,
				BigInteger::multiply));

	}

}
