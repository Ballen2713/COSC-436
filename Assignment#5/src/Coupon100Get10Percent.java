public class Coupon100Get10Percent implements AddOn, Coupon {

    public boolean applies(PurchasedItems items) {

        if (items.getTotalCost() > 100.00) {

            return true;

        }

        return false;

    }

    public String getLines() {

        return "coupon for 10% accepted.";

    }

}