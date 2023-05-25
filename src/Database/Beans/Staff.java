package Database.Beans;

import java.util.Date;

public class Staff {

    /**
     * @return the staffid
     */
    public int getStaffid() {
        return staffid;
    }

    /**
     * @param staffid the staffid to set
     */
    public Staff setStaffid(int staffid) {
        this.staffid = staffid;
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
    public Staff setGeneralDetailId(int generalDetailId) {
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
    public Staff setAddressId(int addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * @return the jobRoleId
     */
    public int getJobRoleId() {
        return jobRoleId;
    }

    /**
     * @param jobRoleId the jobRoleId to set
     */
    public Staff setJobRoleId(int jobRoleId) {
        this.jobRoleId = jobRoleId;
        return this;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public Staff setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * @return the assigneddate
     */
    public Date getAssigneddate() {
        return assigneddate;
    }

    /**
     * @param assigneddate the assigneddate to set
     */
    public Staff setAssigneddate(Date assigneddate) {
        this.assigneddate = assigneddate;
        return this;
    }

    /**
     * @return the accessbility
     */
    public String getAccessbility() {
        return accessbility;
    }

    /**
     * @param accessbility the accessbility to set
     */
    public Staff setAccessbility(String accessbility) {
        this.accessbility = accessbility;
        return this;
    }

    /**
     * @return the fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public Staff setFee(double fee) {
        this.fee = fee;
        return this;
    }
    
    private int staffid, generalDetailId, addressId, jobRoleId;
    private String description, accessbility;
    private double fee;
    private Date assigneddate;
    
}
