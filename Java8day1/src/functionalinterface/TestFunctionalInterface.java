package functionalinterface;

import java.util.function.Function;
import java.util.Arrays;
import java.util.List;

public class TestFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> string = Arrays.asList("Andhra Pradesh","telangana","Tamilnadu","Kerala","Karnataka");
		
//		Function <Sting,Integer>
		
		Function<String, Integer> f = (str) -> {
			return str.length();
		};
		
//		for(String str:string) {
//			System.out.println(f.apply(str));//on multiple strings
//		}
		
		System.out.println(f.apply("Buneos dias"));

		Function<Integer, Integer> f2 = (n) -> {
			return n * n;
		};
		System.out.println(f2.apply(25));
		
		Function <String,String> f3 = (str) -> {
			return str.toLowerCase();
		};
		System.out.println(f3.apply("Kulathoor UST Global"));
	}
}
