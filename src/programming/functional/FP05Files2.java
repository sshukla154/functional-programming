package programming.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FP05Files2 {

	public static void main(String[] args) throws IOException {

		Files.list(Paths.get(".")).forEach(System.out::println);
		System.out.println();
		// Filtering only directory
		Files.list(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);

	}

}
