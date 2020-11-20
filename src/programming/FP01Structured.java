package programming;

import com.sun.tools.javac.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		
		printAllNumbersinListStructured(List.of(10, 20, 54, 123,87, 31, 01, 10, 65, 23));
	}

	private static void printAllNumbersinListStructured(List<Integer> numbers) {
		for(Integer number : numbers) {
			System.out.println(number);
		}
	}
	
}
