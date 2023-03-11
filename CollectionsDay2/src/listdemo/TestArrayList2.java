package listdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> colors = new ArrayList<>();
//		colors.add(new Object());
//		colors.add(new Double("10.10"));
		
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add(null);
		colors.add(null);
		colors.add(null);
		
		String str = colors.get(3);
		System.out.println(str);
		System.out.println(colors.size());
		
//		for( String colors : color) {
//			
//			System.out.println(color);
//		}
		
		}
		
	}


