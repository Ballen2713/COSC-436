
public abstract class TaxComputation {
	
	//pass in PurchasedItems and ReceiptDate object from respective classes 
	public abstract double computeTax(PurchasedItems items, BasicReceipt date);
	protected abstract boolean taxHoliday();
}
