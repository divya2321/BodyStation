package Database.Beans;


public class Supplier {

    /**
     * @return the supplierId
     */
    public int getSupplierId() {
        return supplierId;
    }

    /**
     * @param supplierId the supplierId to set
     */
    public Supplier setSupplierId(int supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public Supplier setFname(String fname) {
        this.fname = fname;
        return this;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public Supplier setLname(String lname) {
        this.lname = lname;
        return this;
    }

    /**
     * @return the contact1
     */
    public String getContact1() {
        return contact1;
    }

    /**
     * @param contact1 the contact1 to set
     */
    public Supplier setContact1(String contact1) {
        this.contact1 = contact1;
        return this;
    }

    /**
     * @return the contact2
     */
    public String getContact2() {
        return contact2;
    }

    /**
     * @param contact2 the contact2 to set
     */
    public Supplier setContact2(String contact2) {
        this.contact2 = contact2;
        return this;
    }
    
    private int supplierId;
    private String fname, lname, contact1, contact2, description;

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public Supplier setDescription(String description) {
        this.description = description;
        return this;
    }
    
}
