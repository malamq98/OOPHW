package oopExam;

public class Iphone2 extends Iphone1 {
	public char useOfIphone2 = 'M';

	public Iphone2() {
		super(); // use super method from parent class
		System.out.println("Default constructor of Iphone2");
	}

	public Iphone2(char useOfIphone2) {
		this.useOfIphone2 = useOfIphone2;
		System.out.println("Maxium number of users are :" + useOfIphone2);
	}

	public void iPhone2Info() {
		super.info = "Iphone1"; // use super key word to call variable from parent class
		super.price = 1500;

		System.out.println("i am the implemented method of Iphone2 class");
	}

	public void iphone2Info(char useOfIphone2) {
		this.useOfIphone2 = useOfIphone2;
		System.out.println("Maxium number of users are :" + useOfIphone2);
	}

	public void dropBox() {
		System.out.println("Dropbox app is free to download .");
	}

}
