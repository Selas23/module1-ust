package functionalinterface;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> string = Arrays.asList("Andhra Pradesh", "telangana", "Tamilnadu", "Kerala", "Karnataka");
		
		Predicate <String> p = (String str) -> {//round bracket for String and String is optional
			return str.length() >10;
		};
		
		for(String str:string) {
			System.out.println(p.test(str));//apply() for string and test() for boolean
		}
	}
		public static void longString(List <String> strings, Predicate <String> p) {
			for(String str : strings) {
				System.out.println(p.test(str));
			}
		}
		
	}


