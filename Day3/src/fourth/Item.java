package fourth;

public class Item {
	String itemid;
	String name;
	int cost;
	
	 public Item(String itemid, String name, int cost) {
		this.itemid = itemid;
		this.name = name;
		this.cost = cost;
	}

	public void display() {
		System.out.println("Item Id:"+itemid);
		System.out.println("Item Name:"+name);
		System.out.println("Item Cost:"+cost);
	}
}
