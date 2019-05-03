import java.util.Date;

public class BasicReceipt implements Receipt{
	private String storeInfo;
	private String stateCode;
	
	private PurchasedItems items;
	private ReceiptDate date;
	private TaxComputation tc;
	
	public BasicReceipt(PurchasedItems items) { 
		this.items = items;
	}
	
	public void setTaxComputation(TaxComputation tc ) { 
		this.tc = tc;
	}
	
	public void setDate(ReceiptDate date){
		this.date = date;
	}
	
	public void prtReceipt() { 
		System.out.println(this.storeInfo);
		System.out.println(this.stateCode);
		System.out.println(this.date.getDate());

		for(int i = 0 ; i < items.size() ; i++) {

			System.out.println(items.get(i).getItemCode() + " " + items.get(i).getItemDescription() + " " + items.get(i).getItemPrice());

		}

		System.out.println("subtotal: " + items.getTotalCost());

		double total = tc.computingTax(items, date) + items.getTotalCost();

		System.out.println("total: " + total);
	}
}
