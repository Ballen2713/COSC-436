import java.util.Date;

public class BasicReceipt implements Receipt{
	private String storeInfo;
	private String stateCode;
	
	private PurchasedItems items;
	private Date date;
	private TaxComputation tc;
	
	public BasicReceipt(PurchasedItems items) { 
		this.items = items;
	}
	
	public void setTaxComputation(TaxComputation tc ) { 
		this.tc = tc;
	}
	
	public void setDate(Date date){ 
		this.date = date;
	}
	
	public void prtReceipt() { 
		
	}
}
