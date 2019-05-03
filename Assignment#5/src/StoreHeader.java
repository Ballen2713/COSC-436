public class StoreHeader {

    private String streetAddress;
    private String stateCode;
    private String phoneNumber;
    private String storeNumber;

    public StoreHeader (String address, String code, String phone, String store) {

        this.streetAddress = address;
        this.stateCode = code;
        this.phoneNumber = phone;
        this.storeNumber = store;

    }

    public String getStateCode() {

        return stateCode;

    }

    public String getStoreNumber() {

        return storeNumber;

    }

    public String toString() {

        return streetAddress + "\n" + stateCode + "\n" + phoneNumber + "\n" + storeNumber;

    }

}