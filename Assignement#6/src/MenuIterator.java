import java.util.ArrayList;

public class MenuIterator implements Iterator {
	ArrayList<String> items;
	int position = 0;
	
	public MenuIterator(ArrayList<String> items) {
		this.items = items;
	}

	public String next() {
		String menuItem = (String) items.get(position);
		position = position + 1;
		return menuItem;
	}

	public boolean hasNext() {
		if (position >= items.size() || items.get(position) == null) {
			return false;
		}
		else {
			return true;
		}
	}

}
