package oopExam;

/*Phone,Pager, Wakitoki are the Hierarchical inheritance
 * Iphone1,Iphone2,Iphone4,Iphone5 ,Iphone6,ConfiguredIphone6 and Applewatch  are the Multilevel inheritance
 * Iphone3 is the Single inheritance
 */

public class TestPhone {

	public static void main(String[] args) {
		Iphone1 ip1 = new Iphone1();
		ip1.iphon1Info();
		ip1.appleWatch();
		ip1.interfaceInfo();
		ip1.call();
		ip1.message();
		ip1.camara();
		ip1.youtubeInfo();
		ip1.pager();
		ip1.wakitoki();

		System.out.println("\n-----------------AppleWatch-----------------------------");
		// AppleWatch appleWatch = new Applewatch();// we can't instantiate an Abstract
		// Class
		AppleWatch appleWatch = new Iphone1();// Abstract class can instantiate following way
		appleWatch.appleWatch();
		System.out.println("\n-----------------Phone-----------------------------");
		// Phone phone = new phone();//Interface can't instantiate
		Phone phone = new Iphone1();// Interface can instantiate following way
		phone.interfaceInfo();
		phone.call();
		phone.message();
		phone.camara();
		phone.battery();// default method
		phone.wireless();// default method
		phone.pager();
		phone.wakitoki();
		System.out.println("\n-----------------Getter and Setter method-----------------------------");
		ip1.setUser('M');
		ip1.setMadeInUSA(false);
		System.out.println("I bought this phone in 2000, the price was $750, user's sex :" + ip1.getUser()
				+ ". Is it made in USA ? :" + ip1.isMadeInUSA());
		System.out.println("\n-----------------Iphone6-----------------------------");
		Iphone6 ip6 = new Iphone6();
		ip6.compass();
		ip6.email();
		ip6.materials(200, 300);
		Iphone6.materials(100, 280, 500);// Static method must be called by its Class
		ip6.materials(300, 400, 450, 700); // Final method
		ip6.materials(250, 450, "600");

	}

}
