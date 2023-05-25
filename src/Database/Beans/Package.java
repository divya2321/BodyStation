package Database.Beans;


public class Package {    
       
    private int packageId;
    private int packageNameId;
    private String paymentType;
    private double amount;
    private int packageStatus;


    /**
     * @return the packageNameId
     */
    public int getPackageNameId() {
        return packageNameId;
    }

    /**
     * @param packageNameId the packageNameId to set
     */
    public Package setPackageNameId(int packageNameId) {
        this.packageNameId = packageNameId;
        return this;
    }

    /**
     * @return the paymentTypeId
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * @param paymentTypeId the paymentTypeId to set
     */
    public Package setPaymentType(String paymentType) {
        this.paymentType= paymentType;
        return this;
    }


    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public Package setAmount(double amount) {
        this.amount = amount;
        return this;
    }
 
    /**
     * @return the packageStatus
     */
    public int getPackageStatus() {
        return packageStatus;
    }

    /**
     * @param packageStatus the packageStatus to set
     */
    public Package setPackageStatus(int packageStatus) {
        this.packageStatus = packageStatus;        
        return this;
    }

    /**
     * @return the packageId
     */
    public int getPackageId() {
        return packageId;
    }

    /**
     * @param packageId the packageId to set
     */
    public Package setPackageId(int packageId) {
        this.packageId = packageId;
        return this;
    }
    
}
