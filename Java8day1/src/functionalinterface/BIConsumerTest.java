package functionalinterface;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class BIConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String,String> map = new HashMap<>();
		map.put("ola", "o");
		map.put("Hello", "n");
		map.put("Chao", "C");
		map.forEach((k,v) ->
		System.out.println(k+ " and "+v)); //BiConsumer takes 2 input prints 2 output
		BiConsumer <String,String> bi=(k,v) ->
			System.out.println(k+" For "+v);
			map.forEach(bi);
		
		
		
	}

}
