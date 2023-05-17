package oopExam;

/*
 * Interface is the blueprint of the class
 * Interface is the collection of methods that are declared not implemented
 * Interface can't inherit a regular class or abstract class
 * From java version 1.8 , default and static methods also can create inside interface 
 * Default and static methods are non abstract in nature
 */

public interface Phone extends Pager, Wakitoki {
	/*
	 * In interface we can't declare any variable In interface variable only
	 * initialize
	 */
	public static final int Price = 1000;

	/*
	 * In interface it's not possible to create constructor
	 * 
	 * 
	 */
	public void interfaceInfo();

	public void call();

	public void message();

	public void camara();

	public default void battery() {
		System.out.println("Battery is a non abstract method from Phone interface");
	}

	public default void wireless() {
		System.out.println("Wireless is a non abstract method from Phone interface");
	}

}
