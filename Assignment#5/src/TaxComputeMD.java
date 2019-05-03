public class TaxComputeMD extends TaxComputation {

    private String stateCode = "MD";

    public double computingTax(PurchasedItems items, ReceiptDate date) {

        if(taxHoliday(date)) {

            return 0.0;

        }

        return items.getTotalCost() * 0.06;

    }

    protected boolean taxHoliday (ReceiptDate date) {

        return false;

    }

    public String getStateCode() {

        return stateCode;

    }

}