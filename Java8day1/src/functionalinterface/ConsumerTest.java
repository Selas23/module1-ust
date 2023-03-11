package functionalinterface;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Consumer will accept input but can`t return will only print
		List<String> string = Arrays.asList("Andhra Pradesh", "telangana", "Tamilnadu", "Kerala", "Karnataka");
		Consumer<String> consumer = (str) -> {
			System.out.println(str);
		};
		consumer.accept("I am doing great");

		for (String str : string) {

			consumer.accept(str);

		}
	}

	public static void printString(List<String> string, Consumer<String> c) {
		for (String str : string) {
			c.accept(str);
		}
	}
}
