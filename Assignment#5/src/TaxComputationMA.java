public class TaxComputationMA extends TaxComputation {

    private String stateCode = "MA";
    HolidayGreeting hg = new HolidayGreeting();
	
    public double computingTax (PurchasedItems items, ReceiptDate date) {

        if(taxHoliday(date)) {
        	System.out.println(hg.getLines());
            return 0.0;

        }

        return items.getTotalCost() * 0.0625;

    }

    protected boolean taxHoliday (ReceiptDate date) {

        if(date.getDate().equals("08/13/2019")|| date.getDate().equals("08/14/2019")) {


            return true;

        }

        return false;

    }

    public String getStateCode() {
    
        return stateCode;

    }

}