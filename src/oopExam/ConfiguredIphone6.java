package oopExam;

public class ConfiguredIphone6 extends Iphone6 {

	@Override
	public int materials(int ramPrice, int camaraPrice) {
		int total1 = ramPrice + camaraPrice + 1000;
		return total1;
	}

	@Override
	public int materials(int ramPrice, int camaraPrice, String processorPrice) {
		int total2 = ramPrice + camaraPrice + Integer.parseInt(processorPrice) + 3000;
		return total2;
	}
	/*
	 * @Override public static void materilas(int ramPrice,int camaraPrice) { int
	 * total3 =ramPrice+camaraPrice+100; System.out.println("Addition:" + total3); }
	 * //Static and Final type method can't be Override
	 * 
	 * //public default void materials(); // default method only allows in Interface
	 * 
	 * @Override // public final int materials(int ramPrice,int camaraPrice) { int
	 * total4 = ramPrice+camaraPrice; return total4; }
	 */

}
