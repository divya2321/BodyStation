package Database.Beans;

/**
 *
 * @author divsi
 */
public class GRNModel {

    /**
     * @return the idsupplimentgrn
     */
    public int getIdsupplimentgrn() {
        return idsupplimentgrn;
    }

    /**
     * @param idsupplimentgrn the idsupplimentgrn to set
     */
    public GRNModel setIdsupplimentgrn(int idsupplimentgrn) {
        this.idsupplimentgrn = idsupplimentgrn;
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
    public GRNModel setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * @return the stockqty
     */
    public double getStockqty() {
        return stockqty;
    }

    /**
     * @param stockqty the stockqty to set
     */
    public GRNModel setStockqty(double stockqty) {
        this.stockqty = stockqty;
        return this;
    }

    /**
     * @return the mfd
     */
    public String getMfd() {
        return mfd;
    }

    /**
     * @param mfd the mfd to set
     */
    public GRNModel setMfd(String mfd) {
        this.mfd = mfd;
        return this;
    }

    /**
     * @return the exp
     */
    public String getExp() {
        return exp;
    }

    /**
     * @param exp the exp to set
     */
    public GRNModel setExp(String exp) {
        this.exp = exp;
        return this;
    }

    /**
     * @return the idsuppliment
     */
    public int getIdsuppliment() {
        return idsuppliment;
    }

    /**
     * @param idsuppliment the idsuppliment to set
     */
    public GRNModel setIdsuppliment(int idsuppliment) {
        this.idsuppliment = idsuppliment;
        return this;
    }

    /**
     * @return the idgrn
     */
    public int getIdgrn() {
        return idgrn;
    }

    /**
     * @param idgrn the idgrn to set
     */
    public GRNModel setIdgrn(int idgrn) {
        this.idgrn = idgrn;
        return this;
    }

    /**
     * @return the idsupplier
     */
    public int getIdsupplier() {
        return idsupplier;
    }

    /**
     * @param idsupplier the idsupplier to set
     */
    public GRNModel setIdsupplier(int idsupplier) {
        this.idsupplier = idsupplier;
        return this;
    }

    /**
     * @return the iduser
     */
    public int getIduser() {
        return iduser;
    }

    /**
     * @param iduser the iduser to set
     */
    public GRNModel setIduser(int iduser) {
        this.iduser = iduser;
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
    public GRNModel setSubTotal(double subTotal) {
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
    public GRNModel setNetTotal(double netTotal) {
        this.netTotal = netTotal;
        return this;
    }

    /**
     * @return the netTotal
     */
    public double getSellingPrice(){
        return netTotal;
    }

    /**
     * @param netTotal the netTotal to set
     */
    public GRNModel setUnitdiscount(double unitdiscount) {
        this.unitdiscount = unitdiscount;
        return this;
    }

    /**
     * @return the netTotal
     */
    public double getUnitdiscount(){
        return unitdiscount;
    }

    /**
     * @param netTotal the netTotal to set
     */
    public GRNModel setSellingPrice(double sellingprice) {
        this.sellingprice = sellingprice;
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
    public GRNModel setQty(double qty) {
        this.qty = qty;
        return this;
    }

    /**
     * @return the datetime
     */
    public String getDatetime() {
        return datetime;
    }

    /**
     * @param datetime the datetime to set
     */
    public GRNModel setDatetime(String datetime) {
        this.datetime = datetime;
        return this;
    }  
    
    
    
    private double stockqty;
    private String mfd;
    private String exp;
    private int idsuppliment;
    private double sellingprice;
    
    
    
    private int idsupplimentgrn;
    private double qty;
    private double amount;
    

    
    private int idgrn;
    private int idsupplier;
    private int iduser;
    private double subTotal;
    private double netTotal;
    private double unitdiscount;
    private String datetime;
    
}
