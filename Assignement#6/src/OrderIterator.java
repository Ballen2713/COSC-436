import java.util.ArrayList;

public class OrderIterator implements Iterator {
	ArrayList<String> items;
	int position = 0;
	
	public OrderIterator(ArrayList<String> items) {
		this.items = items;
	}
	@Override
	public boolean hasNext() {
		if (position >= items.size() || items.get(position) == null) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public String next() {
		String orderItem = (String) items.get(position);
		position = position +1;
		return orderItem;
	}

}
