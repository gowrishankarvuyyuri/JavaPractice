package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet_Operations {

	public static void main(String[] args) {
		
		//declarations
		/*
		HashSet hashset = new HashSet();
		Set set = new HashSet();
		
		Set<String> set = new HashSet<>();
		HashSet<Integer> hashset = new HashSet<>();
		*/
		Set set = new HashSet(Set.of("Gowri","Shankar"));
		
		//adding
		set.add("Vuyyuri");
		
		//insertion - not possible bcuz random storage
		
		//retreving specific data - not possbile bcuz distributed data in memory
		//but possible through converting
		
		List list = new ArrayList(set);
		System.out.println(list.get(list.size()-2));
		
	}

}
