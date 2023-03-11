package listdemo;

import java.util.ArrayDeque;
import java.util.Iterator;

public class TestArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque <String> queue = new ArrayDeque<>();
		queue.addLast("first");
		queue.addLast("second");
		queue.addLast("third");
		queue.addLast("fourth");
		queue.addLast("fifth");
		
		System.out.println(queue);
		System.out.println(queue.size());
		
		String element = queue.getFirst();//both getfirst and peek fetches 1st element but does not remove it from list
		System.out.println(element);
		String element1 = queue.peek();
		System.out.println(element1);
		queue.poll();
		System.out.println(queue);
		
		Iterator <String> iter = queue.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
				
	}

}
