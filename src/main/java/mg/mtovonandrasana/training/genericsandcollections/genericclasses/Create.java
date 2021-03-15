package mg.mtovonandrasana.training.genericsandcollections.genericclasses;

/**
 * A type parameter can be named anything you want.<br>
 * The convention is to use single uppercase  letters to make it obvious <br>
 * that they aren't real class.
 * <h3>The following are common to use:</h3>
 * - E for an element<br>
 * - K for map key <br>
 * - V for a map value <br>
 * - N for a number <br>
 * - T for a generic data type <br>
 * - S,U,V and so forth for multiple generic types<br>
 * 
 * <p>Generic classes become useful when the class used as the type parameter can have
 * 	absolutely nothing to do with each other.
 * </p>
 * @author MTovonandrasana
 *
 * @param <T>
 */
public class Create<T> {

	private T contents;
	
	public T emptyCreate() {
		return contents;
	}
	
	public void packCreate(T contents) {
		this.contents = contents;
	}
}
