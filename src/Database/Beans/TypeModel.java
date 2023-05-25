package Database.Beans;

/**
 *
 * @author divsi
 */
public class TypeModel {

    /**
     * @return the typeId
     */
    public int getTypeId() {
        return typeId;
    }

    /**
     * @param typeId the typeId to set
     */
    public TypeModel setTypeId(int typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * @return the typeName
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName the typeName to set
     */
    public TypeModel setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    private int typeId;
    private String typeName;
    
    
}
