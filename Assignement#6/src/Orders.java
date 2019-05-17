import java.util.ArrayList;

public class Orders {
ArrayList<String> orderItems;
	
	public Orders()
	{
		orderItems = new ArrayList<String>();
		addItem("pork");
		addItem("burger");
		addItem("pizza");
	}
	
	public void addItem(String name) {
		orderItems.add(name);
	}
	
	public ArrayList<String> getMenuItems() {
		return orderItems;
	}
	
	public Iterator createIterator() {
		return new MenuIterator(orderItems);
	}
}
