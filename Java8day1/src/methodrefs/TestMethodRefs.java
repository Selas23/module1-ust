package methodrefs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

interface Formula {

	public void m1();
}

class Some {
	public static void m2() {
		System.out.println("from m2...");
	}
}

class Other {
	Other() {
		System.out.println("from other constructor");
	}

	void m2(String str) {
		System.out.println();
	}
}

public class TestMethodRefs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formula f = Some::m2; // method references in java8, instance method static method
		f.m1();

		f = Other::new;
		//Consumer <String> c= Other::m2; //21line static keyword
		
		//Other o = new Other();
		
		List <String> list = Arrays.asList("one","two","three");
		list.stream().forEach(System.out::println); //instance method reference
		List <Integer> intList =  Arrays.asList(12,13,1233,33);
		//intList.stream().reduce(Math::max);
		Optional <Integer> num = intList.stream().reduce(Math::max); //static method reference
		System.out.println(num.get());
		
	}

}
