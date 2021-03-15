package mg.mtovonandrasana.training.genericsandcollections.genericmethods;

/**
 * You can call a generic method normally, and the compiler will figure out which one you want.
 * <br>
 * @author MTovonandrasana
 *
 */
public class GenMethodMain {

	public void testGenMethodsCall(String... args) {
		GenMethods.<String>ship("package");
		GenMethods.<String[]>ship(args);
	}
}
