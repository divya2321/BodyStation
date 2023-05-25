package Database.Tables;

import Database.Beans.GeneralDetail;
import Database.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GeneralDetailManagement {

    public static String selectedNic;
    public static ResultSet lastSet;
    public static int lastGeneralId;

    public static int saveGeneralDetail(GeneralDetail generalDetailModel) {
        Date date = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy HH:mm:ss");
                
        String stringDate = sdf.format(date);
        
        Date newDate = null;
        
        try {
            newDate = sdf.parse(stringDate);
        } catch (ParseException ex) {
            Logger.getLogger(Date.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return DB.iudReturnId("INSERT INTO generaldetail (nic, fname, mname, lname, dob, gender, contact1, contact2, date, status) "
                + "VALUES ('" + generalDetailModel.getNic() + "', '" + generalDetailModel.getFirstName() + "', '" + generalDetailModel.getMiddleName() + "', '" + generalDetailModel.getLastName() + "', '" + generalDetailModel.getDob() + "', '" + generalDetailModel.getGender() + "', '" + generalDetailModel.getContact1() + "', '" + generalDetailModel.getContact2() + "',NOW(), '1')");
            
        
    }

    public static boolean updateGeneralDetail(GeneralDetail gtm) {
        return DB.iud("UPDATE generaldetail SET nic='" + gtm.getNic() + "', fname='" + gtm.getFirstName() + "', mname='" + gtm.getMiddleName() + "',"
                + " lname='" + gtm.getLastName() + "', contact1='" + gtm.getContact1() + "', contact2='" + gtm.getContact2() + "',"
                + " status='" + gtm.getGeneralStatus() + "' , generaldetail.status='"+gtm.getGeneralStatus()+"' "
                + "WHERE idgeneraldetail='" + gtm.getGeneralDetailId() + "' ");
    }

    public static ResultSet getSelectedDetail() {
        return DB.search("SELECT * FROM generaldetail WHERE nic='" + selectedNic + "' ");
    }

    public static ResultSet getAllGeneralDetail() {
        return DB.search("SELECT * FROM generaldetail");
    }


}
