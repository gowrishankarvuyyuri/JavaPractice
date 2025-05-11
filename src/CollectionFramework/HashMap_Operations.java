package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap_Operations {

	public static void main(String[] args) {
		
		//declarations
		/*
		HashMap hashmp = new HashMap();
		Map map = new HashMap();
		HashMap<String, String> hashmap = new HashMap<>();
		Map<String, Integer> map = Map.of("Gowri", 25, "Shankar", 30);
		Map<String, Integer> map = new HashMap<>(Map.of("Gowri", 25, "Shankar", 30));
		*/
		Map<Integer, Character> map = new HashMap<>();
		
		//adding 
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		map.put(2, 'D');
		map.put(4, 'E');
		
		System.out.println(map);
		
		//removing through key
		map.remove(4);
		System.out.println(map);
		
		//accessing value at desired key
		System.out.println(map.get(3));
		
		//return all values and keys and key-value pairs
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		//printing
		for(Integer I : map.keySet()) {
			System.out.print(I + "=" + map.get(I));
			System.out.println();
		}
		
		//through iterator
		Iterator<Entry<Integer, Character>> itr =map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer, Character> entry = itr.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		System.out.println(map.size());
		
	}

}
