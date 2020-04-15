package override_demo_objectclass;

public class PlayerMain {

	public static void main(String[] args) {
		Player p1 = new Player(100, "Sachin");
		System.out.println(p1);
		// output:
		//override_demo_objectclass.Player@2a139a55
		
		//System.out.println(p.toString());
		// output:
		//override_demo_objectclass.Player@2a139a55
		Player p2 = new Player(101, "Sachin");
		System.out.println(p2);
		if(p1.equals(p2)) {
			System.out.println("Both are same ");
		}else {
			System.out.println("Both are different");
		}
	}

}
