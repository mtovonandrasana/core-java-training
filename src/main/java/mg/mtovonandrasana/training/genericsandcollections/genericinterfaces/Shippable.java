package mg.mtovonandrasana.training.genericsandcollections.genericinterfaces;

/**
 * Just like a class, an interface can declare a formal type parameter.<br>
 * There are three ways a class can approach implementing this interface.<br>
 * - The first is to specify the generic type in the class.<br>
 * - The next is to create a generic class.<br>
 * - The final way is to not use the generic at all.<br>
 * 
 * <p>Here are some things that you can't do with generics. <br> 
 * (And bu "can't", we mean without resorting to contortions like passing in class object.)</p>
 * - <i>Call the constructor</i>. {@code new T()} is not allowed because at runtime it would be {@code Object()}.<br>
 * - Create an <i><strong>array of that static type.</strong></i> This one is the most annoying,<br>
 * 	  because you'd be creating an array of <strong>Objects</strong> <br>
 * - <i>Call</i> {@code instanceof}. This is not allowed because at runtime<br>
 *     {@code List<Integer>} and {@code List<String>} look the same to Java thanks to erasure.<br>
 * - <i>Use a primitive type as a generic type parameter</i>. This isn't a big deal because you <br>
 *      can use the wrapper class instead. If you want an {@code int}, just use {@code Integer}.<br>
 * - <i>Create a static variable as a generic type parameter. </i> This is not allowed because <br>
 *       the type is linked to the instance of the class.<br>
 *  <p></p>     
 *       
 * @author MTovonandrasana
 *
 * @param <T>
 */
public interface Shippable<T> {

	void ship(T t);
}
