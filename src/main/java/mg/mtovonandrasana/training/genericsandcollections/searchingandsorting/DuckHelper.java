package mg.mtovonandrasana.training.genericsandcollections.searchingandsorting;

import java.util.Objects;




public class DuckHelper {
	
	private DuckHelper() {}

	public static final int compareByWeight(Duck duck1, Duck duck2) {
		return duck1.getWeight().compareTo(duck2.getWeight());
	}
	
	public static final int compareByName(Duck duck1, Duck duck2) {
		return Objects.nonNull(duck1.getName())
				&&Objects.nonNull(duck2.getName())
				? duck1.getName().compareTo(duck2.getName()):
					0;
	}
}
