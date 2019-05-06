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

        String f = "B:/JavaWork/COSC-436/Assignment#5/src/in.txt";
        String[] in = new String[4];

        int i = 0;

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

        for (int j = 0 ; j < taxComputationObjects.length ; j++) {

            if(storeheader.getStateCode().equals(taxComputationObjects[j].getStateCode())) {

                tc = taxComputationObjects[j]
                ;
            }

        }

    }

    public Receipt getReceipt(PurchasedItems items, ReceiptDate date) {

        System.out.println(storeheader.toString());
        Decorator before, after;
        BasicReceipt br = new BasicReceipt(items);

        for (int i = 0 ; i < addOns.length ; i++) {

            if(addOns[i].applies(items)) {

                if(addOns[i] instanceof SecondaryHeading) {

                    before = new BeforeDecorator(addOns[i], br);

                }
            }
        }

            br.setDate(date);
            br.setTaxComputation(tc);

            for (int j = 0 ; j < addOns.length ; j++) {

                if((addOns[j].applies(items) && addOns[j] instanceof Rebate ) || (addOns[j].applies(items) && addOns[j] instanceof Coupon)) {

                    after = new AfterDecorator(addOns[j], br);

                }

            }

            return br;

        }

    }
