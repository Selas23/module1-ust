package userdefinedobjects;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class FrequencyHashMapTest {

	public static void main(String[] args) {
		int i = 0;
		int count = 0;
		String str = new String(
				"This class consists exclusively of static methods that operate on or return collections . It contains polymorphic algorithms that operate on collections , \"wrappers\" , which return a new collection backed by a specified collection , and a few other odds and ends . The methods of this class all throw a NullPointerException if the collections or class objects provided to them are null . The documentation for the polymorphic algorithms contained in this class generally includes a brief description of the implementation . Such descriptions should be regarded as implementation notes , rather than parts of the specification . Implementors should feel free to substitute other algorithms , so long as the specification itself is adhered to . ( For example , the algorithm used by sort does not have to be a mergesort , but it does have to be stable . ) The \"destructive\" algorithms contained in this class , that is , the algorithms that modify the collection on which they operate, are specified to throw UnsupportedOperationException if the collection does not support the appropriate mutation primitive(s) , such as the set method . These algorithms may , but are not required to , throw this exception if an invocation would have no effect on the collection . For example , invoking the sort method on an unmodifiable list that is already sorted may or may not throw UnsupportedOperationException .");
		String str1 =str.toLowerCase();
		String words[] = str1.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		System.out.println(words.length);

//	   HashMap <String,Collection> dataMap = new HashMap<>();
//		
//		dataMap.put("words", words);
//		
//		Collection<words> list = dataMap.get("empList");
//		Iterator<Employee> iter = list.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}

		for (String word : words) {

			Integer in = map.get(word);

			if (in == null) {

				map.put(word, 1);
			} else
				map.put(word, in + 1);
		}
		System.out.println(map);
		
	}
}
