
public abstract class TaxComputation {

	private String stateCode;
	public abstract double computeTax(PurchasedItems items, BasicReceipt date);
	protected abstract boolean taxHoliday(ReceiptDate date);

	public String getStateCode() {

		return stateCode;

	}

}
