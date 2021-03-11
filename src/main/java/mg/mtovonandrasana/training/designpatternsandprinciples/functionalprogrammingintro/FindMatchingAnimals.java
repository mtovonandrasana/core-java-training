package mg.mtovonandrasana.training.designpatternsandprinciples.functionalprogrammingintro;

import java.util.function.Predicate;

public class FindMatchingAnimals {

	private static void print(Animal animal, CheckTrait trait) {
		if(trait.test(animal)) {
			System.out.println(animal);
		}
	}
	
	private static void printWithPredicate(Animal animal, Predicate<Animal> trait) {
		if(trait.test(animal)) {
			System.out.println(animal);
		}
	}
	
	public static void main(String... args) {
		print(new Animal("Kangoro", true, false), Animal::canHop);
		printWithPredicate(new Animal("Fish", false, true), Animal::canSwim);
	}
}
