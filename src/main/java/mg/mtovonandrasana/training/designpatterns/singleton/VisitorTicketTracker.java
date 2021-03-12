package mg.mtovonandrasana.training.designpatterns.singleton;

public class VisitorTicketTracker {

	private static VisitorTicketTracker instance;
	private VisitorTicketTracker() {}
	
	/**
	 * Lazy Instantiation to Singletons <br>
	 * Lazy instantiation reduces memory usage and improves performance when an application starts up.
	 * @return
	 */
	public static VisitorTicketTracker getInstanceNotThreadSafe() {
		if(instance == null) {
 			instance = new VisitorTicketTracker(); // NOT THREAD-SAFE : Two thread could call this method at the same time, 
 												   //					resulting in two objects being created. 
		}
		return instance;
	}
	
	/**
	 * The method is synchronized, which means only one thread will be allowed in the method at a time, <br>
	 * ensuring that only one object is created. <br>
	 * 
	 *  Every single call to this method will require synchronization, this can be costly and can impact performance.
	 * @return
	 */
	public static synchronized VisitorTicketTracker getInstance() {
		if(instance == null) {
 			instance = new VisitorTicketTracker(); // THREAD-SAFE : Thread safe is the property of an object that guarantees  
 				System.out.println();								   //					safe execution by multiple threads at the same time. 
		}
		return instance;
	}
	
	/**
	 * Double-checked locking, a design pattern in which we first test if synchronization 
	 * is needed before actually acquiring any locks.
	 * @return
	 */
	public static VisitorTicketTracker getInstanceDoubleCheckedLocking() {
		if(instance == null) {
			synchronized (VisitorTicketTracker.class) {
				if(instance == null) {
					instance = new VisitorTicketTracker();
				}
			}
		}
		
		return instance;
	}
	
	// Data access methods
	// ...
}
