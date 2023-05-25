package Database.Beans;


public class PaymentType {

    /**
     * @return the idPaymentType
     */
    public int getIdPaymentType() {
        return idPaymentType;
    }

    /**
     * @param idPaymentType the idPaymentType to set
     */
    public PaymentType setIdPaymentType(int idPaymentType) {
        this.idPaymentType = idPaymentType;
        return this;
    }

    /**
     * @return the paymentType
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * @param paymentType the paymentType to set
     */
    public PaymentType setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public PaymentType setStatus(int status) {
        this.status = status;
        return this;
    }
    
    private int idPaymentType;
    private String paymentType;
    private int status;
    
}
