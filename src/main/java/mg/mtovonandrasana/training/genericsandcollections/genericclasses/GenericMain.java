package mg.mtovonandrasana.training.genericsandcollections.genericclasses;

public class GenericMain {

	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		elephant.setName("El");
		elephant.setSize(120);
		
		Create<Elephant> create = new Create<>();
		create.packCreate(elephant);
		
		Elephant elephant2 = create.emptyCreate();
		
		Integer numPounds = 15_000;
		SizeLimitedCreate<Elephant, Integer> limitedCreate = new SizeLimitedCreate<>(elephant2, numPounds);
	
	}
}
