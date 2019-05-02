public class RebateItem implements Rebate, AddOn {

    public boolean applies(PurchasedItems items) {

        return items.containsItem("1406");

    }

    public String getLines() {

        return "Mail-in Rebate for Item #1406\n" + "Name:\n" + "Address:\n\n" +
                "Mail To: Best Buy Rebates, P.O. Box 1400, Orlando, FL";

    }

}