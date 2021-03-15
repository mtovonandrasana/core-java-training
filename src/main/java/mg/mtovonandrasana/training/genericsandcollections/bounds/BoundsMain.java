package mg.mtovonandrasana.training.genericsandcollections.bounds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * <h3>Unbounded wildcard</h3>  (<i>Immutable</i>)
 *  syntax  => '?'<br>
 *  example => {@code List<?> l = new ArrayList<String>();}<br>
 *  <h3>Wildcard with an upper bound</h3>  (<i>Immutable</i>)
 *  syntax  => '{@code ? extends type}' <br>
 *  example => {@code List<? extends Exception> l = new ArrayList<RuntimeException>();}<br>
 *  <h3>Wildcard with a lower bound</h3>
 *  syntax  => '{@code ? super type}' <br>
 *  exemple => {@code List<?  super Exception> l = new ArrayList<Object>();}<br>
 *  
 * @author MTovonandrasana
 *
 */
public class BoundsMain {

	public static void main(String... args) {
		List<String> keywords = new ArrayList<>();
		keywords.add("Key 1");
		printList(keywords); // Why ? => List<String> cannot be assigned to List<Object>.
	}						// Solution use '?' instead (List<?> aListOfAnything).
	
	public static void printList(List<?> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
//	List<Number> numbers = new LinkedList<Integer>(); DOES NOT COMPILE
	List<? extends Number> numbers = new LinkedList<Integer>();
	
//	Example
	public static long total(List<? extends Number> numbers) {
		long count = 0;
		for (Number number : numbers) {
			count += number.longValue();
		}
		return count;
	}
	
}
