package Database.Tables;

import Database.Beans.Address;
import Database.Beans.GeneralDetail;
import Database.Beans.Staff;
import Database.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StaffManagement {

    static int savedAddress = 0;
    static int savedDetails = 0;
    
    private static boolean isSuccessful = false;
    
    public static ResultSet alreadyStaffSet;
    
    
    public static ResultSet isAlreadyStaff(String nic){
        
        alreadyStaffSet = DB.search("SELECT * FROM staff INNER JOIN address INNER JOIN generaldetail "
                    + "ON "
                    + "staff.address_idaddress = address.idaddress "
                    + "AND "
                    + "staff.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                    + "WHERE (UPPER(nic)) = '"+nic.toUpperCase()+"' ");
            
        return alreadyStaffSet;
        
    }

    public static boolean saveStaff(Address addressModel, GeneralDetail gtm, Staff staffModel) {

        savedAddress = AddressManagement.saveAddress(addressModel);
        savedDetails = GeneralDetailManagement.saveGeneralDetail(gtm);
        

        if (savedAddress != -1) {
            if (savedDetails != -1) {
                DB.iud("INSERT INTO staff (address_idaddress, generaldetail_idgeneraldetail, jobrole_idjobrole, description, fee, accessbility) "
                        + "VALUES ('" + savedAddress + "', '" + savedDetails + "', '" + JobRoleMaagement.selectedJobrole + "',"
                        + " '" + staffModel.getDescription() + "', '" + staffModel.getFee() + "', '" + staffModel.getAccessbility() + "') ");

                isSuccessful = true;
            }
        }
        
        return isSuccessful;

    }

    public static boolean updateStaff(Address addressModel, GeneralDetail gtm, Staff staffModel) {

        AddressManagement.updateAddress(addressModel);
        GeneralDetailManagement.updateGeneralDetail(gtm);
        
        return DB.iud("UPDATE staff SET "
                        + "jobrole_idjobrole='"+JobRoleMaagement.selectedJobrole+"', "
                        + "description='"+staffModel.getDescription()+"', "
                        + "fee='"+staffModel.getFee()+"', "
                        + "accessbility='"+staffModel.getAccessbility()+"' "
                        + "WHERE idstaff='"+staffModel.getStaffid()+"' ");
        
        

    }
    
    private static int currentCount = 0;
    private static ResultSet staffMax;
    
    public static int getStaffCount(){
        System.out.println("Called getStaff");
        try {
            staffMax = DB.search("SELECT MAX(idstaff) FROM staff");
            
            while (staffMax.next()) {
                if (staffMax.getString("MAX(idstaff)")!=null) {
                    currentCount = Integer.parseInt(staffMax.getString("MAX(idstaff)"));
                } else {
                    currentCount = 0;
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            return currentCount+1;
    }
    
    
    public static ResultSet getAllStaff(){
        return DB.search("SELECT * FROM staff "
                + "INNER JOIN generaldetail "
                + "INNER JOIN jobrole "
                + "ON "
                + "staff.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "staff.jobrole_idjobrole = jobrole.idjobrole");
    }
    
    public static ResultSet getAllActivatedStaff(){
        return DB.search("SELECT * FROM staff "
                + "INNER JOIN generaldetail "
                + "INNER JOIN jobrole "
                + "ON "
                + "staff.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "staff.jobrole_idjobrole = jobrole.idjobrole "
                + "WHERE generaldetail.status='1'");
    }
    
    public static ResultSet getAllDeactivatedStaff(){
        return DB.search("SELECT * FROM staff "
                + "INNER JOIN generaldetail "
                + "INNER JOIN jobrole "
                + "ON "
                + "staff.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "staff.jobrole_idjobrole = jobrole.idjobrole "
                + "WHERE generaldetail.status='0'");
    }
    
    public static ResultSet getSelectedAllStaff(String staffId){
        return DB.search("SELECT * FROM staff "
                + "INNER JOIN address "
                + "INNER JOIN generaldetail "
                + "INNER JOIN jobrole "
                + "ON "
                + "staff.address_idaddress = address.idaddress "
                + "AND "
                + "staff.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "staff.jobrole_idjobrole = jobrole.idjobrole "
                + "WHERE idstaff='"+staffId+"'");
    }
    
    public static ResultSet getSelectedAllStaffName(String staffName){
        return DB.search("SELECT * FROM staff "
                + "INNER JOIN address "
                + "INNER JOIN generaldetail "
                + "INNER JOIN jobrole "
                + "ON "
                + "staff.address_idaddress = address.idaddress "
                + "AND "
                + "staff.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "staff.jobrole_idjobrole = jobrole.idjobrole "
                + "WHERE "
                + "LOWER(generaldetail.fname)  LIKE '%"+staffName+"%' "
                + "OR "
                + "LOWER(generaldetail.mname)  LIKE '%"+staffName+"%' "
                + "OR "
                + "LOWER(generaldetail.lname)  LIKE '%"+staffName+"%' ");
    }
    public static ResultSet getSelectedAllStaffNic(String staffNic){
        return DB.search("SELECT *, CONCAT(generaldetail.fname,' ',generaldetail.mname,' ',generaldetail.lname) AS fullname FROM staff "
                + "INNER JOIN address "
                + "INNER JOIN generaldetail "
                + "INNER JOIN jobrole "
                + "ON "
                + "staff.address_idaddress = address.idaddress "
                + "AND "
                + "staff.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "staff.jobrole_idjobrole = jobrole.idjobrole "
                + "WHERE "
                + "LOWER(nic) LIKE '%"+staffNic+"%' ");
    }
    
    public static ResultSet getSelectedStaffByName(String staffName){
        return DB.search("SELECT * FROM staff "
                + "INNER JOIN address "
                + "INNER JOIN generaldetail "
                + "INNER JOIN jobrole "
                + "ON "
                + "staff.address_idaddress = address.idaddress "
                + "AND "
                + "staff.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "staff.jobrole_idjobrole = jobrole.idjobrole "
                + "WHERE "
                + "CONCAT(fname,' ', mname, ' ', lname) = '"+staffName+"' ");
    }
    
    public static ResultSet getSelectedStaffByNic(String staffNic){
        return DB.search("SELECT * FROM staff "
                + "INNER JOIN address "
                + "INNER JOIN generaldetail "
                + "INNER JOIN jobrole "
                + "ON "
                + "staff.address_idaddress = address.idaddress "
                + "AND "
                + "staff.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "staff.jobrole_idjobrole = jobrole.idjobrole "
                + "WHERE "
                + "LOWER(nic) = '"+staffNic+"' ");
    }
    
    public static ResultSet getStaffSortName(){
        return DB.search("SELECT * FROM staff "
                + "INNER JOIN address "
                + "INNER JOIN generaldetail "
                + "INNER JOIN jobrole "
                + "ON "
                + "staff.address_idaddress = address.idaddress "
                + "AND "
                + "staff.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "staff.jobrole_idjobrole = jobrole.idjobrole "
                + "ORDER BY "
                + "fname ");
    }
    
    public static ResultSet getStaffSortNo(){
        return DB.search("SELECT * FROM staff "
                + "INNER JOIN address "
                + "INNER JOIN generaldetail "
                + "INNER JOIN jobrole "
                + "ON "
                + "staff.address_idaddress = address.idaddress "
                + "AND "
                + "staff.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "staff.jobrole_idjobrole = jobrole.idjobrole "
                + "ORDER BY "
                + "idstaff ");
    }
    
    public static boolean activeStaff(String nic){
        return DB.iud("UPDATE generaldetail SET generaldetail.status='1' WHERE nic='"+nic+"' ");
    }
    
    public static boolean deactiveStaff(String nic){
        return DB.iud("UPDATE generaldetail SET generaldetail.status='0' WHERE nic='"+nic+"' ");
    }

    public static boolean isStaffActive(String staffId){
        ResultSet result = DB.search("SELECT status FROM generaldetail INNER JOIN staff ON staff.generaldetail_idgeneraldetail = "
                + "generaldetail.idgeneraldetail WHERE staff.idstaff = '"+staffId+"' ");
        
        try {
            if(result.next()){
                if(result.getString("status").equals("1")){
                    return true;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
