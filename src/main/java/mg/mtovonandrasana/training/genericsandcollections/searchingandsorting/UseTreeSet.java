package mg.mtovonandrasana.training.genericsandcollections.searchingandsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UseTreeSet {

	static class Makis {
		int id;
	}
	
	public static void main (String... args) {
		Set<Chick> chicks = new TreeSet<>();
		chicks.add(new Chick("Ducky duck")); // Duck Implement Comparable<T>
		
		Set<Makis> makis = new TreeSet<>((m1,m2) -> Integer.compare(m1.id, m2.id)); // use Comparator
		makis.add(new Makis());
		
		//TODO: Using method reference
		
		/**
		 * There are four type of method references: <br>
		 *  - Static methods (DuckerHelper::compareByName)
		 *  - Instance methods on a particular instance
		 *  - Instance methods on an instance to be determined at runtime
		 *  - Constructors
		 */
		Set<Duck> ducksSortedByName = new TreeSet<>(DuckHelper::compareByName);
		ducksSortedByName.add(new Duck());
		Set<Duck> ducksSortedByWeight = new TreeSet<>(DuckHelper::compareByWeight);
		ducksSortedByWeight.add(new Duck());
		
		/**
		 * Consumer is a functional interface which  takes a single parameter 
		 * of any type and has a  void  return type.  
		 */
		Consumer<List<Integer>> methofRef2 = Collections::sort;
		Consumer<List<Integer>> lamda2 = l -> Collections.sort(l);
		
		String string = "abc";
		/**
		 *  Predicate  is a functional interface that takes a 
		 *  single parameter of any type and returns a  boolean.
		 */
		Predicate<String> predicateMethoRef = string::startsWith;
		Predicate<String> predicateLambda = s -> string.startsWith(s);
		
		Predicate<String> predicateMR = String::isEmpty;
		Predicate<String> predicateLmD = s -> s.isEmpty();
		
		/**
		 * Supplier is a functional interface that doesn’t take any parameters and returns any type.
		 */
		Supplier<ArrayList<Integer>> supplierMR = ArrayList::new;
		Supplier<ArrayList<Integer>> supplierLmd = () -> new ArrayList();
		
		
		//TODO: Removing conditionally (removeIf): method signature => boolean removeIf(Predicate<? super E> filter)
		
		List<String> list = new ArrayList<>();
		list.add("Duck");
		list.add("Chick");
		list.removeIf(s -> s.startsWith("C")); //remove Chick
		
		//TODO: Updating All Elements (replaceAll): signature => void replaceAll(UnaryOperator<E> o)
		/**
		 * It use a UnaryOperator, which takes one parameter and returns a value of the same type.
		 */
		
		List<Integer> integers = Arrays.asList(1,2,3,4);
		integers.replaceAll(i -> i*i); // [1,4,9,16]
		
		//TODO: Looping through a Collection
		/**
		 * Traditional way
		 */
		List<String> cats = Arrays.asList("Annie","Ripley");
		for (String cat : cats) {
			System.out.println(cat);
		}
		
		/**
		 * With lambda
		 */
		cats.forEach(c-> System.out.println(c)); 
		//OR
		cats.forEach(System.out::println);
		
	}
}
