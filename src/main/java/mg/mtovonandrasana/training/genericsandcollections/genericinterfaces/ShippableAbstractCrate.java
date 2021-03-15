package mg.mtovonandrasana.training.genericsandcollections.genericinterfaces;

/**
 * THe following concrete class allows the caller to specify the type of the generic.
 * @author MTovonandrasana
 *
 * @param <U>
 */
public class ShippableAbstractCrate<U> implements Shippable<U> {

	@Override
	public void ship(U t) {
		// TODO Auto-generated method stub
		
	}

}
