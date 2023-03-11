package optional;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		
		String str = null; //got instantiated
		String str2 = "hello";
		
		//Optional <String> optional = Optional.of(str); // of is used when the object is not null
		
		//System.out.println(optional.get());
		
		Optional <String> optional2 = Optional.ofNullable(str2);
		if(optional2.isPresent()) // if str2 is passed true condition is executed
			System.out.println("value is present " + optional2.get());
		else					//when str is used else will be executed
			System.out.println("its null" + optional2.orElse("String is not initialised"));
		//System.out.println(optional2.get());
		
	}
	
}
