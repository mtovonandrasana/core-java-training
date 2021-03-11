package mg.mtovonandrasana.training.classdesingn;

import mg.mtovonandrasana.training.classdesingn.Car.Type;

public class Main {

	public static void main(String... args) {
		Car myCar = new Car(12, Type.W4X4, "Toyota pickup", 260);
		myCar.getType().printCarType();
		System.out.println(myCar.toString());
		
	}
}
