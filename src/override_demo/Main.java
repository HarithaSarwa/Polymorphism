package override_demo;

public class Main {
	public static void main(String[] args) {
		MobileV2 v2= new MobileV2();
		v2.calling();
		v2.gaming();
		v2.messaging();
		v2.displayMenu();
		System.out.println(v2.hashCode());
		v2.socialApps();
		v2.videoCalling();
		
		MobileV1 v1 = new MobileV2();
		v1.calling();
		v1.displayMenu();
		
	}
}
