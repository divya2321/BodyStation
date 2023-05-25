package Database.Beans;

/**
 *
 * @author divsi
 */
public class SupplimentModel {

    /**
     * @return the idSuppliment
     */
    public int getIdSuppliment() {
        return idSuppliment;
    }

    /**
     * @param idSuppliment the idSuppliment to set
     */
    public SupplimentModel setIdSuppliment(int idSuppliment) {
        this.idSuppliment = idSuppliment;
        return this;
    }

    /**
     * @return the idBrand
     */
    public int getIdBrand() {
        return idBrand;
    }

    /**
     * @param idBrand the idBrand to set
     */
    public SupplimentModel setIdBrand(int idBrand) {
        this.idBrand = idBrand;
        return this;
    }

    /**
     * @return the idType
     */
    public int getIdType() {
        return idType;
    }

    /**
     * @param idType the idType to set
     */
    public SupplimentModel setIdType(int idType) {
        this.idType = idType;
        return this;
    }

    /**
     * @return the supplimentName
     */
    public String getSupplimentName() {
        return supplimentName;
    }

    /**
     * @param supplimentName the supplimentName to set
     */
    public SupplimentModel setSupplimentName(String supplimentName) {
        this.supplimentName = supplimentName;
        return this;
    }
    
    private int idSuppliment;
    private int idBrand;
    private int idType;
    private String supplimentName;
    
}
