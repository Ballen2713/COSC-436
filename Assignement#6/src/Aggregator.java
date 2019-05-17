
public class Aggregator extends Menu {
	MenuItem menu;
	public String getName() {
		return menu.name;
	}
	
	public double getCost() {
		return menu.cost;
	}
	
	public String getDescription() {
		return menu.description;
	}

}
