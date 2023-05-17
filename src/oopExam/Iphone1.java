package oopExam;

/*Yes,we can make a relation of Iphone1 with Phone Interface with implements keyword and AppleWatch Abstract class with extends keyword
1)  Can you make a relation of Iphone1 with Phone Interface and AppleWatch Abstract class. [Complete the code after answering above]. [points: 30] . 

 */
/*Regular class: can declare and initialize variables
 *can declare a default constructor and multiple parameterize constructors
 * can implemented and initialize methods
 * can implement Static method but not default method
 * can be instantiated
 * Abstract Class:
 * can declare and initialize variables
 * can declare a default constructor and multiple parameterize constructors
 * abstract method must contain abstract keyword
 * can declare Static method but not Default method
 * can't instantiate by creating an Object
 * can instantiate with the help of Regular Class
 * Interface:
 * its a blueprint of a class
 * Variables only initialize , can't declare
 * variable must be static
 * doesn't allow any types of constructor
 *  Contains abstract method ,non abstract method , static method and default methods 
 *  can't instantiate by creating an object
 *  can instantiate by the help of Regular class
 */

public class Iphone1 extends AppleWatch implements Phone {
	public int price;
	public String info;
	private char user;
	private boolean madeInUSA;

	public Iphone1() {
		System.out.println("Default constructor of Iphone1");
	}

	public Iphone1(int price, String info, char user, boolean madeInUSA) {
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;
		System.out.println("Price :" + price + "Info :" + info + "Users :" + user + "Made in USA :" + madeInUSA);
	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camara() {
		// TODO Auto-generated method stub

	}

	public void iphon1Info() {
		System.out.println("/*Regular class: can declare and initialize variables\r\n"
				+ " *can declare a default constructor and multiple parameterize constructors\r\n"
				+ " * can implemented and initialize methods\r\n"
				+ " * can implement Static method but not default method\r\n" + " * can be instantiated\r\n"
				+ " * Abstract Class:\r\n" + " * can declare and initialize variables\r\n"
				+ " * can declare a default constructor and multiple parameterize constructors\r\n"
				+ " * abstract method must contain abstract keyword\r\n"
				+ " * can declare Static method but not Default method\r\n"
				+ " * can't instantiate by creating an Object\r\n"
				+ " * can instantiate with the help of Regular Class\r\n" + " * Interface:\r\n"
				+ " * its a blueprint of a class\r\n" + " * Variables only initialize , can't declare\r\n"
				+ " * variable must be static\r\n" + " * doesn't allow any types of constructor\r\n"
				+ " *  Contains abstract method ,non abstract method , static method and default methods \r\n"
				+ " *  can't instantiate by creating an object\r\n"
				+ " *  can instantiate by the help of Regular class");
	}

	public void youtubeInfo() {
		System.out.println("Youtube is one of the most popular app to watch videos");
	}

	@Override
	public void pager() {
		// TODO Auto-generated method stub

	}

	@Override
	public void wakitoki() {
		// TODO Auto-generated method stub

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

}
