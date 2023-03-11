package listdemo;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>bookSet = new HashSet<>();//treeset null not accepted
		bookSet.add("Java in nutshell");    //hashset null only  1 is accepted
		bookSet.add("Java complete reference ");
		bookSet.add("Thinking in java");
		bookSet.add("Java in 21 days");
		bookSet.add("Java for dummy");
		bookSet.add(null);
		bookSet.add(null);
		
		
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("Java in nutshell"));
		
		bookSet.add("Thinking in java");
		System.out.println(bookSet.size());
		
		for(String book : bookSet) {
			System.out.println(book);
		}
		
		Iterator<String> iter = bookSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
