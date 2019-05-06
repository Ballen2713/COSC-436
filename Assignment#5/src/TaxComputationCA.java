public class TaxComputationCA extends TaxComputation {

    private String stateCode = "CA";

    public double computingTax (PurchasedItems items, ReceiptDate date) {

        if(taxHoliday(date)){

            return 0.0;

        }

        return items.getTotalCost() * 0.0725;

    }

    protected boolean taxHoliday (ReceiptDate date) {

        return false;

    }

    public String getStateCode() {

        return stateCode;

    }

}