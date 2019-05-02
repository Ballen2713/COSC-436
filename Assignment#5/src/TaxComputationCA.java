public class TaxComputationMD extends TaxComputation {

    private String stateCode;

    public double computingTax (PurchasedItems items, ReceiptDate date) {

        if(taxHoliday(date)){

            return 0.0;

        }

        return items.getTotalCost();

    }

    protected boolean taxHoliday (ReceiptDate date) {

        return false;

    }

    public String getStateCode() {

        return stateCode;

    }

}