package override_demo_objectclass;

public class Player {
	private int id;
	private String name;
	public Player() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}
	@Override
	public boolean equals(Object o) {
		Player p=(Player)o;
		if (p.id==this.id) {
			return true;
		}else {
			return false;
		}
	}
	
}
