import java.util.*;
import java.io.FileNotFoundException;

public class Client {

    public static void main (String[] args) throws FileNotFoundException {

        Scanner reader = new Scanner(System.in);
        String date;

        PurchasedItems purchaseditems  = new PurchasedItems();

        ReceiptFactory receiptfactory = new ReceiptFactory();

        purchaseditems.add(new StoreItem("1", "Laptop", 500.00));
        purchaseditems.add(new StoreItem("2", "Headphones", 100.00));
        purchaseditems.add(new StoreItem("3", "DVD", 20.00));
        purchaseditems.add(new StoreItem("4", "iPhone 10", 1200.00));
        purchaseditems.add(new StoreItem("5", "Samsung Galaxy Watch", 290.00));
        purchaseditems.add(new StoreItem("6", "BOSE QC-35 NC", 300.00));

        System.out.println("Enter today's date in the format MM/DD/YYYY");

        date = reader.nextLine();
        reader.close();
    
        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String year = date.substring(6,9) + date.substring(9);

        ReceiptDate receiptdate = new ReceiptDate();

        
        receiptdate.setMonth(month);
        receiptdate.setDay(day);
        receiptdate.setYear(year);
        receiptdate.setDate();

        Receipt receipt = receiptfactory.getReceipt(purchaseditems, receiptdate);
        receipt.prtReceipt();

    }

}