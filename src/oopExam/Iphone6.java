package oopExam;

public class Iphone6 extends Iphone5 {

	public void compass() {
		System.out.println("Compass feathures help to find the direction of north,south,east and west. ");
	}

	/*
	 * Method Overloading: same method name ,same parameter but different argument
	 * its also called static polymorphism or early binding method it occurs during
	 * compile time Method Overriding:same method name, same parameter and argument
	 * ,but different logic it's also called dynamic polymorphism or late binding
	 * method it occurs during runtime
	 * 
	 */
	public int materials(int ramPrice, int camaraPrice) {
		int total1 = ramPrice + camaraPrice;
		System.out.println("Addition of total 1:" + total1);
		return total1;
	}

	public int materials(int ramPrice, int camaraPrice, String processorPrice) {
		int total2 = ramPrice + camaraPrice + Integer.parseInt(processorPrice);
		System.out.println("Addition of total 2:" + total2);
		return total2;
	}

	public static void materials(int ramPrice, int camaraPrice, int coverPrice) {
		int total3 = ramPrice + camaraPrice + coverPrice;
		System.out.println("Addition of total 3:" + total3);
	}

	// public default void materials(); // default method only allows in Interface

	public final int materials(int ramPrice, int camaraPrice, int screenPrice, int coverPrice) {
		int total4 = ramPrice + camaraPrice + screenPrice + coverPrice;
		System.out.println("Addition of total 4:" + total4);
		return total4;
	}

}
