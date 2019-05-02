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

        System.out.println("Enter today's date in the format DD/MM/YYYY");

        date = reader.nextLine();
        reader.close();

        String day = date.substring(0,2);
        String month = date.substring(3,5);
        String year = date.substring(6,9) + date.substring(9);

        ReceiptDate receiptdate = new ReceiptDate;

        receiptdate.setDate();
        receiptdate.setDay(day);
        receiptdate.setMonth(month);
        receiptdate.setYear(year);

        Receipt receipt = receiptfactory.getReceipt(purchaseditems, receiptdate);
        receipt.ptrReceipt();

    }

}