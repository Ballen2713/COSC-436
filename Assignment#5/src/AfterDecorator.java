public class AfterDecorator extends Decorator {

    private AddOn addOn;

    public AfterDecorator(AddOn addOn, Receipt receipt) {

        super(receipt);
        this.addOn = addOn;

    }

    public void ptrReceipt() {

        callTrailer();

        System.out.println(addOn.getLines());

    }

}