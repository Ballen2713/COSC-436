
public interface AddOn {
	//pass in the object of the PurchasedItems class
	boolean applies(Object items);
	String getLines();
}
