import java.io.*;
import java.util.*;

public class ReceiptFactory {

    String header;
    String statecode;

    private TaxComputation[] taxComputationObjects;
    private TaxComputation tc;
    private AddOn[] addOns;
    private StoreHeader storeheader;

    public ReceiptFactory() throws FileNotFoundException {

        TaxComputation CA, MA, MD;

        AddOn coupon, greeting, rebate;

        String f = "/Users/marga/COSC-436/Assignment#5/src/in.txt";
        String[] in = new String[4];

        int i;

        Scanner reader = new Scanner(new File(f));

        while(reader.hasNextLine()) {

            in[i] = reader.nextLine();

            System.out.println(in[i]);

            i++;
        }

        reader.close();

        storeheader = new StoreHeader(in[0], in[1], in[2], in[3]);

        taxComputationObjects = new TaxComputation[] {

                CA = new TaxComputationCA(),
                MA = new TaxComputationMA(),
                MD = new TaxComputeMD(),

        };

        addOns = new AddOn[] {

                rebate = new RebateItem(),
                coupon = new Coupon100Get10Percent(),
                greeting = new HolidayGreeting(),
        };

        for (int i = 0 ; i < taxComputationObjects.length ; i++) {

            if(storeheader.getStateCode().equals(taxComputationObjects[i].getStateCode())) {

                tc = taxComputationObjects[i]
                ;
            }

        }

    }

    public Receipt getReceipt(PurchasedItems items, Receipt date) {

        System.out.println(storeheader.toString());
        Decorator before, after;
        BasicReceipt br = new BasicReceipt(items);

        for (int i = 0 ; i < addOns.length ; i++) {

            if(addOns[i].applies(items)) {

                if(addOns[i] instanceof SecondaryHeading) {

                    before = new BeforeDecorator(addOns[i], br);

                }
            }

            br.setDate(date);
            br.setTaxComputation(tc);

            for (int i = 0 ; i < addOns.length ; i++) {

                if((addOns[i].applies(items) && addOns[i] instanceof Rebate ) || (addOns[i].applies(items) && addOns[i] instanceof Coupon)) {

                    after = new AfterDecorator(addOns[i], br);

                }

            }

            return br;

        }

    }

}