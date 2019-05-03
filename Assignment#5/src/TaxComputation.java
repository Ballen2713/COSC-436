
public abstract class TaxComputation {

	private String stateCode;
	public abstract double computingTax(PurchasedItems items, ReceiptDate date);
	protected abstract boolean taxHoliday(ReceiptDate date);

	public String getStateCode() {

		return stateCode;

	}

}
