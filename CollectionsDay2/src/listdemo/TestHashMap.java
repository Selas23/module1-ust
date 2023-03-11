package listdemo;

import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> countrycurr = new HashMap<>();
		
		countrycurr.put("IND", "Rupe");
		countrycurr.put("USA", "Dollar");
		countrycurr.put("UK", "Pound");
		countrycurr.put(null, null);
		countrycurr.put(null, null);// only 1 allowed
		
		System.out.println(countrycurr);
		System.out.println(countrycurr.get("IND"));
		
		countrycurr.put("IND", "Rupee");
		System.out.println(countrycurr.size());
		System.out.println(countrycurr.containsKey("UK"));
		System.out.println(countrycurr.containsValue("Dollar"));
		
		// HashMap has 3 views
		// 1. key view
		Set<String>keys = countrycurr.keySet();
		for(String key : keys) {
			System.out.println(key);
		}
		
		//2. values view
		Collection<String> values = countrycurr.values();
		for(String value : values) {
			System.out.println(value);
		}
		//3. key value together - Entryset
		
		Set <Entry <String,String>> entries = countrycurr.entrySet();
		for(Entry <String,String> entry : entries) {
		
			System.out.println(entry);
		}
		}
		
	}


