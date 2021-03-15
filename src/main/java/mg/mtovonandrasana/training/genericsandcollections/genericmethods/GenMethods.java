package mg.mtovonandrasana.training.genericsandcollections.genericmethods;

import mg.mtovonandrasana.training.genericsandcollections.genericclasses.Create;

/**
 * This is often useful for {@code static} methods since they aren't part 
 * <br>of an instance that can declare the type.
 * @author MTovonandrasana
 *
 */
public class GenMethods {

	/**
	 * Here, the method uses a generic parameter.
	 * <br> The method parameter is the generic type T.
	 * <br> The return type is a {@code Create<T>}
	 * @param <T>
	 * @param t
	 * @return
	 */
	public static <T> Create<T> ship(T t){
		System.out.println("Preparing " +t);
		return new Create<T>();
		
	}
	
	public static <T> void sink(T t) {
		// Not used
	}
	
	public static <T> T indentity(T t) {
		return t;
	}
}