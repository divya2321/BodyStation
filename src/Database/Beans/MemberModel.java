package Database.Beans;

public class MemberModel {

    /**
     * @return the memberId
     */
    public int getMemberId() {
        return memberId;
    }

    /**
     * @param memberId the memberId to set
     */
    public MemberModel setMemberId(int memberId) {
        this.memberId = memberId;
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
    public MemberModel setPackageId(int packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * @return the generalDetailId
     */
    public int getGeneralDetailId() {
        return generalDetailId;
    }

    /**
     * @param generalDetailId the generalDetailId to set
     */
    public MemberModel setGeneralDetailId(int generalDetailId) {
        this.generalDetailId = generalDetailId;
        return this;
    }

    /**
     * @return the addressId
     */
    public int getAddressId() {
        return addressId;
    }

    /**
     * @param addressId the addressId to set
     */
    public MemberModel setAddressId(int addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public MemberModel setCode(String code) {
        this.code = code;
        return this;
    }
    
    private int memberId, packageId, generalDetailId, addressId;
    private String code;
    
}
