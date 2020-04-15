package override_demo;

public class MobileV2 extends MobileV1{
	public void videoCalling() {
		System.out.println("Video calling from v2");
	}
	public void socialApps() {
		System.out.println("Social n/w ing from v2");
	}
	public void gaming() {
		System.out.println("Gaming from v2");
	}
	@Override // annotation support
	public void displayMenu() {
		//super.displayMenu();
		System.out.println("Menu2 in V2 is upgraded to GRID view ");
	}
}
