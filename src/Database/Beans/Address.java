package Database.Beans;

public class Address {
    private int addressId;
    private String no;
    private String street1;
    private String street2;
    private String city;

    /**
     * @return the addressId
     */
    public int getAddressId() {
        return addressId;
    }

    /**
     * @param addressId the addressId to set
     */
    public Address setAddressId(int addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * @return the no
     */
    public String getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public Address setNo(String no) {
        this.no = no;
        return this;
    }

    /**
     * @return the street1
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * @param street1 the street1 to set
     */
    public Address setStreet1(String street1) {
        this.street1 = street1;
        return this;
    }

    /**
     * @return the street2
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * @param street2 the street2 to set
     */
    public Address setStreet2(String street2) {
        this.street2 = street2;
        return this;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public Address setCity(String city) {
        this.city = city;
        return this;
    }
}
