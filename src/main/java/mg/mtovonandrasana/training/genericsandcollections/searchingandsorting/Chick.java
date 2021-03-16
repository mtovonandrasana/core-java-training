package mg.mtovonandrasana.training.genericsandcollections.searchingandsorting;

public class Chick implements Comparable<Chick>{

    public final String name;
	
	public Chick(String name) {
		this.name = name;
	}
	
	private Chick() {
		this.name = "Ducky";
	}

	@Override
	public int compareTo(Chick o) {
		return this.name.compareTo(o.name);
	}
}
