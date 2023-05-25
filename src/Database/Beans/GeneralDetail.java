package Database.Beans;

import java.sql.Date;

public class GeneralDetail {

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public GeneralDetail setNic(String nic) {
        this.nic = nic;
        return this;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public GeneralDetail setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public GeneralDetail setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public GeneralDetail setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * @return the contact1
     */
    public String getContact1() {
        return contact1;
    }

    /**
     * @param contact1 the contact1 to set
     */
    public GeneralDetail setContact1(String contact1) {
        this.contact1 = contact1;
        return this;
    }

    /**
     * @return the contact2
     */
    public String getContact2() {
        return contact2;
    }

    /**
     * @param contact2 the contact2 to set
     */
    public GeneralDetail setContact2(String contact2) {
        this.contact2 = contact2;
        return this;
    }

    /**
     * @return the assignedDate
     */
    public Date getAssignedDate() {
        return assignedDate;
    }

    /**
     * @param assignedDate the assignedDate to set
     */
    public GeneralDetail setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
        return this;
    }

    /**
     * @return the generalStatus
     */
    public int getGeneralStatus() {
        return generalStatus;
    }

    /**
     * @param generalStatus the generalStatus to set
     */
    public GeneralDetail setGeneralStatus(int generalStatus) {
        this.generalStatus = generalStatus;
        return this;
    }

    
    private String nic, firstName, middleName, lastName, contact1, contact2, dob, gender;
    private Date assignedDate;
    private int generalDetailId, generalStatus;

    /**
     * @return the generalDetailId
     */
    public int getGeneralDetailId() {
        return generalDetailId;
    }

    /**
     * @param generalDetailId the generalDetailId to set
     */
    public GeneralDetail setGeneralDetailId(int generalDetailId) {
        this.generalDetailId = generalDetailId;
        return this;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public GeneralDetail setDob(String dob) {
        this.dob = dob;
        return this;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public GeneralDetail setGender(String gender) {
        this.gender = gender;
        return this;
    }
    
}
