package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> string = Arrays.asList("Andhra Pradesh", "telangana", "Tamilnadu", "Kerala", "Karnataka");
		
		Supplier<String> supplier = () -> {

			return new String("Hola!");
		};
		System.out.println(supplier.get());
	}
}
