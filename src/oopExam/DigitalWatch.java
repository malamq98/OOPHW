package oopExam;

public interface DigitalWatch {

	public void dwatch();

	public default void digitalWatch() {
		System.out.println("Digital watch is a non abstract method from DigitalWatch interface");
	}
}
