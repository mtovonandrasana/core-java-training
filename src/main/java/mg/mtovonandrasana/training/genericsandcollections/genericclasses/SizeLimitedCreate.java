package mg.mtovonandrasana.training.genericsandcollections.genericclasses;
/**
 * Generic classes aren't limited to having a single type parameter.
 * 
 * @author MTovonandrasana
 *
 */
public class SizeLimitedCreate<T, U> {

	private T contents;
	private U sizeLimit;
	
	public SizeLimitedCreate(T contents, U sizeLimit){
		this.contents = contents;
		this.sizeLimit = sizeLimit;
	}
}
