public class BeforeDecorator extends Decorator {

    private AddOn addOn;

    public BeforeDecorator(AddOn addOn, Receipt receipt) {

        super(receipt);
        this.addOn = addOn;

    }

    public void prtReceipt() {

        System.out.println(addOn.getLines());

        callTrailer();

    }

}