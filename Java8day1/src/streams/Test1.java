package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList();
		list.add("Sun");
		list.add("Moon");
		list.add("Jupiter");
		list.add("Uranus");
		list.add("Plute");
		list.add("Mars");
		list.add("Venus");

		Predicate<String> p = (str) -> {
			return (str.length() > 3 || str.length() < 10);
		};

		long count = list.stream().filter((str) -> str.length() > 3 || str.length() < 10).count();// implicit navigation
		System.out.println(count);
		
		Function <String,String> f = (str) ->{
			return str.toUpperCase();
		};

		List<String> outList = list.stream().map((str) -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(outList);
		
		Consumer <String> c = (str)-> {
			System.out.println(str);
		};
		list.stream().forEach(c);
		//filter or map needs terminal to operator
		
		//list.stream().forEach(System.out::println);//printing data as it is 
		//System.out::println method references
		
						//terminal functions
		list.stream(). //
		filter(p). //
		map(f). //
		forEach(c); //
		
	}
}
