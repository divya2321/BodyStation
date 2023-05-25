package Database.Beans;

import java.util.Date;

/**
 *
 * @author divsi
 */
public class InvoiceModel {

    /**
     * @return the invNic
     */
    public int getInvId() {
        return invId;
    }

    /**
     * @param invNic the invNic to set
     */
    public InvoiceModel setInvId(int invId) {
        this.invId = invId;
        return this;
    }
    /**
     * @return the invNic
     */
    public String getInvNic() {
        return invNic;
    }

    /**
     * @param invNic the invNic to set
     */
    public InvoiceModel setInvNic(String invNic) {
        this.invNic = invNic;
        return this;
    }

    /**
     * @return the invDate
     */
    public String getInvDate() {
        return invDate;
    }

    /**
     * @param invDate the invDate to set
     */
    public InvoiceModel setInvDate(String invDate) {
        this.invDate = invDate;
        return this;
    }

    /**
     * @return the subTotal
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public InvoiceModel setSubTotal(double subTotal) {
        this.subTotal = subTotal;
        return this;
    }

    /**
     * @return the netTotal
     */
    public double getNetTotal() {
        return netTotal;
    }

    /**
     * @param netTotal the netTotal to set
     */
    public InvoiceModel setNetTotal(double netTotal) {
        this.netTotal = netTotal;
        return this;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public InvoiceModel setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    /**
     * @return the invType
     */
    public String getInvType() {
        return invType;
    }

    /**
     * @param invType the invType to set
     */
    public InvoiceModel setInvType(String invType) {
        this.invType = invType;
        return this;
    }
    
    private String invNic;
    private String invDate;
    private double subTotal;
    private double netTotal;
    private int userId;
    private int invId;
    private String invType;
}
