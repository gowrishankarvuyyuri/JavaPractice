package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Operations {

	public static void main(String[] args) {
		
		//declaration
		List list = new ArrayList();
		/*
		ArrayList arraylist = new ArrayList();
		ArrayList <Integer> arraylist1 = new ArrayList<>();
		List<String> names = new ArrayList<>(List.of("Gowri", "Shankar", "Raj"));
		List<String> allowedNames = List.of("Shankar", "Asha", "Priya");
		List <String> list1 = new ArrayList<>();
		ArrayList <Employee> = new ArrayList<>();
		*/
		
		//adding an element
		list.add("5B4");
		list.add("Shankar");
		list.add("Penumantra");
		list.add(2, "Male"); //insertion at middle
		
		//list size
		System.out.println(list.size());
		
		//printing an elements
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		for (Object lst : list) {
			System.out.print(lst + " ");
		}
		System.out.println();
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		//modify element
		list.set(2, "male");
		System.out.println(list);
		
		//remove element
		list.remove(2);
		System.out.println(list);
		
		//remove set of elements from list
		String array[]  = {"Gowri", "Shankar"};
		List newlist = Arrays.asList(array);
		list.removeAll(newlist);
		System.out.println(list);
		
		//clear list
		//list.clear();
		System.out.println(list);
		
		//checks list is empty
		System.out.println(list.isEmpty());
		System.out.println(Collections.max(list));
		list.add("GShankar");
		System.out.println(list);
		List<String> allowedNames = List.of("Shankar", "Asha", "Priya");
		list.addAll(allowedNames);
		Collections.sort(list);
		System.out.println(list);
		
		
		
	}

}
