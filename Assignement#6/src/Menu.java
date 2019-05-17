import java.util.ArrayList;

public class Menu {
	ArrayList<String> menuItems;
	
	public Menu()
	{
		menuItems = new ArrayList<String>();
		addItem("pork");
		addItem("burger");
		addItem("pizza");
	}
	
	public void addItem(String name) {
		menuItems.add(name);
	}
	
	public ArrayList<String> getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator() {
		return new MenuIterator(menuItems);
	}
}
