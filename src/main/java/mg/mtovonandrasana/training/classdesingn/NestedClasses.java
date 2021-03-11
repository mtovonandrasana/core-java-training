package mg.mtovonandrasana.training.classdesingn;

/**
 * There are four types of nested classes:
 * <p>
 * <u>
 * 	<li>A member inner class is a class defined at the same level as instance variables. It is not static. </li>
 * 	<li>A local inner class is defined within a method.</li>
 * 	<li>An anonymous inner class is a special case of a local inner class that does not have a name.</li>
 * 	<li>A static nested class is a static class that is defined at the same level as static variables</li>
 * </u>
 * </p>
 * @author MTovonandrasana
 *
 */
public class NestedClasses {

	private String greeting = "Hi";
	
	/**
	 * Member inner classes have the following properties:
	 * <p> -> Can be declared public, private or protected or use default access</p>
	 * <p> -> Can extend any class and implement interfaces</p>
	 * <p> -> Can be abstract or final</p>
	 * <p> -> Cannot declare static fields or methods</p>
	 * <p> -> Can access members of the outer class including private members
	 * 
	 * @author MTovonandrasana
	 *
	 */
	protected class InnerClass {
		public int repeat = 3;
		public void go() {
			for(int i = 0; i<repeat; i++) {
				System.out.println(greeting + " N°" +i);
			}
		}
	}
	
	public void callInner() {
		InnerClass innerClass = new InnerClass();
		innerClass.go();
	}
	
	/**
	 * <p>
	 * The rule that all methods in an interface are public still applies.<br>
	 * A class that implements the interface must define that method as public.<br>
	 * The interface itself does not to be public, though. Just like any inner class
	 * an inner interface can be private.
	 * </p>
	 * @author MTovonandrasana
	 *
	 */
	private interface Secret {
		public void shh();
	}
	
	class DontTell implements Secret {
		public void shh() {
			System.out.println("SHHHHHHHH!");
		}
	}
	
//	TODO: 
	//*************************Local Inner Class**********************//
	
	private int time = 12;
	
	public void calculate() {
		final int startTime = 10;
		
		/**
		 * Local inner classes have the following properties:<br>
		 * -> They do not have an access specifier. <br>
		 * -> They cannot be declared static and cannot declare static fields or methods. <br>
		 * -> They have access to all fields and methods of the enclosing class. <br>
		 * -> They do not have access to loval variables of a method unless <br>
		 * those variables are final or effectively final.
		 * @author MTovonandrasana
		 *
		 */
		class Inner {
			public void addTime() {
				System.out.println(time + startTime);
			}
		}
		
		Inner inner = new Inner();
		inner.addTime();
	}
// TODO:
	
	//*****************Anonymous inner class***********************//
	
	abstract class ReadTodayOnly {
		abstract String checkBooks();
		
	}
	
	/**
	 * An anonymous inner class is a local inner class that does not have a name.<br>
	 * It is declared and instantiated all in one statement using the new keyword.<br>
	 * Anonymous inner class are required to extend an existing class or implement an existing interface.<br>
	 * 
	 * @author MTovonandrasana
	 *
	 */
	public String readBook() {
		/**
		 * Anonymous inner class
		 */
		ReadTodayOnly readTodayOnly = new ReadTodayOnly() {
			
			@Override
			String checkBooks() {
				return "Design and analyse of Algorithm";
			}
		};
		
		return readTodayOnly.checkBooks();
	}
	
// TODO:
//	TODO: Static Nested Classes
	/**
	 * A static nested class is a static class defined at the member level.<br>
	 * It can be instantiated without an object of the enclosing class, <br>
	 * so it can't access the instance variables without an explicit object of the enclosing class.
	 * @author MTovonandrasana
	 *
	 */
	static class Nested {
		private int price = 12;
	}
//TODO:

	public static void main(String... args) {
		NestedClasses nestedClasses = new NestedClasses();
		nestedClasses.callInner();
		//Another way to access the inner class		
		InnerClass innerClass = nestedClasses.new InnerClass();
		innerClass.go();
		// Case of private interface
		DontTell dontTell = nestedClasses.new DontTell();
		dontTell.shh();
		// Local Inner Class
		nestedClasses.calculate();
		System.out.println(nestedClasses.readBook());
		
		//Static Nested class
		Nested nested = new Nested();
		System.out.println(nested.price);
	}
	
	
}
