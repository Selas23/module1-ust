package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalList {

	public static void main(String[] args) {

		List<String> string = Arrays.asList("Andhra Pradesh", "telangana", "Tamilnadu", "Kerala", "Karnataka");

		Function<String, Integer> f = (str) -> {//LENGTH
			return str.length();
		};

		Function<String, String> f1 = (str) -> {//UPPERCASE
			return str.toUpperCase();
		};

		Function<String, String> f2 = (str) -> {//LOWERCASE
			return str.toLowerCase();
		};

		Function<String, String> f3 = (str) -> {//REVERSE

			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			return sb.toString();

		};

		printLength(string, f);
		printUpper(string, f1);
		printLower(string, f2);
		printReverse(string, f3);
	}

	public static void printLength(List<String> string, Function<String, Integer> fRef) {

		for (String str : string) {
			System.out.println(fRef.apply(str));
		}
	}

	public static void printUpper(List<String> string, Function<String, String> fRef1) {

		for (String str : string) {
			System.out.println(fRef1.apply(str));
		}
	}

	public static void printLower(List<String> string, Function<String, String> fRef2) {

		for (String str : string) {
			System.out.println(fRef2.apply(str));
		}
	}

	public static void printReverse(List<String> string, Function<String, String> fRef3) {

		for (String str : string) {
			System.out.println(fRef3.apply(str));
		}
	}

}
