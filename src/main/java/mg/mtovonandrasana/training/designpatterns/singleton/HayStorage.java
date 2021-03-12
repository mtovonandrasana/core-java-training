package mg.mtovonandrasana.training.designpatterns.singleton;

/**
 * The singleton pattern is a creational pattern focused on creating only<br>
 * one instance of an object in memory within an application, sharable by all classes<br>
 * and threads within the application.
 * 
 * The Singleton class is effectively final.
 * 
 * @author MTovonandrasana
 *
 */
public class HayStorage {

	private int quantity = 0;
	
	/**
	 * All constructors in a Singleton class are marked private, <br>
	 * which ensures that no other class is capable of instantiating another version of the class.
	 */
	private HayStorage() {}
	
	/**
	 * We guarantee that the object is only created once within the singleton class using 
	 * the 'final' modifier on the 'static' reference.
	 */
	private static final HayStorage instance = new HayStorage();
	
	/**
	 * Process that wants to use this singleton first calls<br> 
	 * this method and the calls the appropriate public method.
	 * @return Instance of HaySotrage
	 */
	public static HayStorage getInstance() {
		return instance;
	}
	
	public synchronized void addHay(int amount) {
		quantity += amount;
	}
	
	public synchronized boolean removeHay(int amount) {
		if(quantity < amount) return false;
		quantity -= amount;
		return true;
	}
	
	public synchronized int getHayQuantity() {
		return quantity;
	}
}
