package Database.Beans;


public class SupplimentBrand {

    /**
     * @return the brandId
     */
    public int getBrandId() {
        return brandId;
    }

    /**
     * @param brandId the brandId to set
     */
    public SupplimentBrand setBrandId(int brandId) {
        this.brandId = brandId;
        return this;
    }

    /**
     * @return the brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * @param brandName the brandName to set
     */
    public SupplimentBrand setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    
    private int brandId;
    private String brandName;
    
}
