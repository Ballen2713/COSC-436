
public class Aggregator {
	
	//Maintains references to the menu object
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
	
	//Maintains the references to the orders object 
	OrderItem order;

	public int getItemNo() { 
		return order.itemNumber;
	}
	

}
