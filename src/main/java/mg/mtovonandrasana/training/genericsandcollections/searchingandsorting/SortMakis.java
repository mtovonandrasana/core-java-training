package mg.mtovonandrasana.training.genericsandcollections.searchingandsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMakis {
	static class Maki {
		int id;
	}
	
	public static void main(String[] args) {
		List<Maki> makis = new ArrayList<>();
		makis.add(new Maki());
		
//		Collections.sort(makis); // Not compile (Implement Comparable to Maki )
		// Or
		Collections.sort(makis, (r1,r2) -> r1.id -r2.id); //Use Comparator
		
		/****
		 * Collections.sort() and Collections.binarySearch() 
		 * allow you to pass in a Comparator object when you don’t want to use the natural order. 
		 * ***/
		List<String> names = Arrays.asList("Toto","Zaza");
		int index = Collections.binarySearch(names, "Zaza", Comparator.reverseOrder());
		System.out.println(index);
		
	}

}
