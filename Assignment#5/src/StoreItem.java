
public class StoreItem {
	private String itemCode; 
	private String itemDescription;
	private double itemPrice;


	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String cd) {
		itemCode = cd;
	}

	public String getItemDescription() {
		return this.itemDescription;
	}

	public void setItemDescription(String dsc) {
		itemDescription = dsc;
	}

	public double getItemPrice() {
		return this.itemPrice;
	}

	public void setItemPrice(double prc) {
		itemPrice = prc;
	}

	public StoreItem(String code, String description, double price) {

		itemCode = code;
		itemDescription = description;
		itemPrice = price;

	}

}
