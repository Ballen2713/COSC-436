
public abstract class TaxComputation {
	
	//pass in PurchasedItems and ReceiptDate object from respective classes 
	public abstract double computeTax(Object items, Object date);
	protected abstract boolean taxHoliday();
}
