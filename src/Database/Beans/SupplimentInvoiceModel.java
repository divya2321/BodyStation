package Database.Beans;

/**
 *
 * @author nipun
 */
public class SupplimentInvoiceModel {

    /**
     * @return the invId
     */
    public int getInvId() {
        return invId;
    }

    /**
     * @param invId the invId to set
     */
    public SupplimentInvoiceModel setInvId(int invId) {
        this.invId = invId;
        return this;
    }

    /**
     * @return the qty
     */
    public double getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public SupplimentInvoiceModel setQty(double qty) {
        this.qty = qty;
        return this;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public SupplimentInvoiceModel setDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    /**
     * @return the supStockId
     */
    public int getSupStockId() {
        return supStockId;
    }

    /**
     * @param supStockId the supStockId to set
     */
    public SupplimentInvoiceModel setSupStockId(int supStockId) {
        this.supStockId = supStockId;
        return this;
    }
    private int invId;
    private double qty;
    private double discount;
    private int supStockId;
}
