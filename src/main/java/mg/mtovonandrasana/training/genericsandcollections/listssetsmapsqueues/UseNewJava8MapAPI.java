package mg.mtovonandrasana.training.genericsandcollections.listssetsmapsqueues;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * Java 8 added a number of new methods on the Map interface.
 * <br> merge(),  computeIfPresent(), computeIfAbsent(), etc.
 * @author MTovonandrasana
 *
 */
public class UseNewJava8MapAPI {

	//TODO: Update element in Map
	/**
	 * Replace the existing value unconditionally
	 */
	public static void updateValueUnconditionally() {
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour"); // Jenny = Bus Tour
		favorites.put("Jenny", "Tram"); //Jenny = Tram
	}
	 
	/**
	 * Using putIfAbsent()
	 */
	
	public static void updateMapValueUsingPutIfAbsent() {
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour"); 
		favorites.put("Tom", null); 
		
		
		favorites.putIfAbsent("Jenny", "Tram");
		favorites.putIfAbsent("Sam", "Tram");
		favorites.putIfAbsent("Tom", "Tram");
		
		System.out.println(favorites); // Jenny = Bus Tour, Sam = Tram, Tom = Tram
	}
	
	/**
	 * Merge => merge()
	 */
	
	public static void updateMapByMerge() {
		BinaryOperator<String> mapper = (v1,v2) -> v1.length() > v2.length() ? v1 : v2;
		
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour"); 
		favorites.put("Tom", "Tram");
		favorites.put("Sam", null); 
		
		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		String tom = favorites.merge("Tom", "Skyride", mapper);
		String sam = favorites.merge("Sam", "Skyride", mapper);
		
		System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour, Sam = Skyride}
		System.out.println(jenny);     // Bus Tour
		System.out.println(tom);       // Skyride
		System.out.println(sam);       // Skyride
		
		
		/****************************************************************/
		BinaryOperator<String> mapper2 = (v1,v2) -> null;
		Map<String, String> favorites2 = new HashMap<>();
		favorites2.put("Jenny", "Bus Tour");
		favorites2.put("Tom", "Bus Tour");
		
		favorites2.merge("Jenny", "Skyride", mapper2);
		favorites2.merge("Sam", "Skyride", mapper2);
		
		/**
		 * Tom was left alone since there was no merge() call for that key. 
		 * Sam was added since that key was not in the original list. 
		 * Jenny was removed because the mapping function returned null.
		 */
		System.out.println(favorites2); // {Tom=Bus Tour, Sam=Skyride}
		
		
		
	}
	
	public static void upbdateByComputeIfPresent() {
		
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 1);
		BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
		counts.computeIfPresent("Jenny", mapper);
		counts.computeIfPresent("Sam", (k,v) -> v+1); // return null
		
		System.out.println(counts); // {Jenny=2}
		
	}
	
	public static void updateByComputeIfAbsent() {
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 15);
		counts.put("Tom", null);
		/**
		 * a Function is used instead of a BiFunction. Only the key is passed as input. 
		 */
		Function<String, Integer> mapper = k -> 1;
		
		counts.computeIfAbsent("Jenny", mapper); // 15
		counts.computeIfAbsent("Sam", mapper); // 1
		counts.computeIfAbsent("Tom", mapper); // 1
		System.out.println(counts); // {Tom=1, Jenny=15, Sam=1}
		
		/**
		 * If the mapping function is called and returns null, the key is removed from the map for computeIfPresent().
		 *  For computeIfAbsent(), the key is never added to the map in the first place.
		 */
		Map<String, Integer> countsNull = new HashMap<>();
		countsNull.put("Jenny", 1);
		countsNull.computeIfPresent("Jenny", (k, v) -> null);
		countsNull.computeIfAbsent("Sam", k -> null);
		System.out.println(countsNull); // {}
	}
	
	
	public static void main(String... strings) {
		updateMapByMerge();
		updateByComputeIfAbsent();
	}
}
