package mg.mtovonandrasana.training.classdesingn;

public class Car {
	
	private int idNumber;
	private Type type;
	private String name;
	private int speed;
	
	enum Type {
		MINIIBUS {

			@Override
			public void printCarType() {
				System.out.println("Fiara fitaterana");
			}
			
		}, W4X4{

			@Override
			public void printCarType() {
				System.out.println("Fiara tsy matahodalana");
			}
			
		}, CAMION{

			@Override
			public void printCarType() {
				System.out.println("Fiara vaventy fitaterana entana");
			}
			
		};
		
		public abstract void printCarType();
	}

	public Car(int idNumber, Type type, String name, int speed) {
		super();
		this.idNumber = idNumber;
		this.type = type;
		this.name = name;
		this.speed = speed;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [idNumber=" + idNumber + ", type=" + type + ", name=" + name + ", speed=" + speed + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Car))
			return false;
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (idNumber != other.idNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
	
}
