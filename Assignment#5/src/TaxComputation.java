
public abstract class TaxComputation {

	private String stateCode;
	public abstract double computeTax(PurchasedItems items, BasicReceipt date);
	protected abstract boolean taxHoliday(RecepitDate date);

	public String getStateCode() {

		return stateCode;

	}

}
