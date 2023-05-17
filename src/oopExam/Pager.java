package oopExam;

public interface Pager {

	public void pager();

	public static void pager1() {
		System.out.println("Pager is a wireless telecommunication device");
	}

	public default void pagerInfo() {
		System.out.println("Al Gross was invented pager in 1921");
	}

}
