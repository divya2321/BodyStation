package Database.Tables;

import Database.DB;
import java.sql.ResultSet;


public class StaffDatabaseManagement {
    
    private static ResultSet allStaffSet;
    
    public static ResultSet loadAllStaff(){
        allStaffSet = DB.search("SELECT * FROM staff INNER JOIN address INNER JOIN generaldetail "
                + "ON staff.address_idaddress = address.idaddress "
                + "AND staff.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail");
        
        return allStaffSet;
    }
    
        
    
}
