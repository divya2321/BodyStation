package Database.Tables;

import Database.Beans.UserAccount;
import Database.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccountManagement {

    public static ResultSet getEmployee(String staffNic) {
        return DB.search("SELECT idstaff, CONCAT(fname,' ',mname,' ',lname)  AS name, generaldetail.status FROM "
                + "staff INNER JOIN generaldetail "
                + "ON generaldetail.idgeneraldetail = staff.generaldetail_idgeneraldetail "
                + "WHERE nic = '" + staffNic + "' ");
    }
    
    static ResultSet rs_iduc;
    static int iduc;
    public static int getUserAccountId(String username){
        try {
            rs_iduc = DB.search("SELECT iduseraccount FROM useraccount WHERE username='"+username+"'");
            if (rs_iduc.next()) {
                iduc = rs_iduc.getInt("iduseraccount");
            } else {
                iduc = -1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return iduc;
    }
    
    public static boolean saveLoginUserLog(int iduc){
        return DB.iud("INSERT INTO userlog (login, useraccount_iduseraccount) VALUES (NOW(), '"+iduc+"' ) ");
    }
    
    public static boolean saveLogOutUserLog(){
        return DB.iud(" UPDATE userlog SET logout=NOW() ORDER BY iduserlog DESC LIMIT 1  ");
    }

    public static ResultSet getCurrentAccounts(String staffNic) {
        return DB.search("SELECT "
                + "iduseraccount, CONCAT(fname,' ',mname,' ',lname)  AS name, username, password, recoveryhint, recoveryanswer, generaldetail.status  "
                + "FROM staff "
                + "INNER JOIN generaldetail "
                + "INNER JOIN useraccount "
                + "ON generaldetail.idgeneraldetail = staff.generaldetail_idgeneraldetail "
                + "AND "
                + "staff.idstaff = useraccount.staff_idstaff "
                + "WHERE nic='" + staffNic + "' AND generaldetail.status='1'");
    }

    public static ResultSet getUsername(String typingUsername) {
        return DB.search("SELECT username FROM useraccount");
    }

    public static ResultSet getAllAccount() {
        return DB.search("SELECT iduseraccount, CONCAT(fname,' ',mname,' ',lname)  AS name, username, nic "
                + "FROM staff "
                + "INNER JOIN generaldetail "
                + "INNER JOIN useraccount "
                + "ON generaldetail.idgeneraldetail = staff.generaldetail_idgeneraldetail "
                + "AND "
                + "staff.idstaff = useraccount.staff_idstaff ");
    }

    public static ResultSet getSelectedAccount(String idAccount) {
        System.out.println("Passed"+idAccount);
        return DB.search("SELECT "
                + "iduseraccount, CONCAT(fname,' ',mname,' ',lname)  AS name, nic, username, password, recoveryhint, recoveryanswer, accountstatus "
                + "FROM staff "
                + "INNER JOIN generaldetail "
                + "INNER JOIN useraccount "
                + "ON generaldetail.idgeneraldetail = staff.generaldetail_idgeneraldetail "
                + "AND "
                + "staff.idstaff = useraccount.staff_idstaff "
                + "WHERE nic='" + idAccount + "'");
    }

    public static boolean saveUserAccount(UserAccount userAccountModel) {

        return DB.iud("INSERT INTO useraccount (username, password, accountstatus, recoveryhint, recoveryanswer, staff_idstaff, currentstatus) "
                + "VALUE ('" + userAccountModel.getUsername() + "','" + userAccountModel.getPassword() + "','1',"
                + "'" + userAccountModel.getRecoverHint() + "','" + userAccountModel.getRecoverAnswer() + "','" + userAccountModel.getUserId() + "', '0')");

    }

    public static boolean changeStatus(String status, int accountId) {
        System.out.println("Change Status"+status);
        System.out.println("Change Status"+accountId);
        return DB.iud("UPDATE useraccount set "
                + "accountstatus='" + status + "' "
                + "WHERE iduseraccount='" + accountId + "' ");
    }
    
    private static ResultSet rs_password;
    private static String password, accountStatus;
    public static String fname;
    public static String getPassword(String username) {
        try {
            rs_password = DB.search("SELECT password, accountstatus, fname FROM useraccount "
                    + "INNER JOIN staff "
                    + "INNER JOIN generaldetail "
                    + "ON useraccount.staff_idstaff = staff.idstaff "
                    + "AND staff.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                    + "WHERE username='"+username+"'");
            if (rs_password.next()) {
                password = rs_password.getString("password");
                accountStatus = rs_password.getString("accountstatus");
                fname =rs_password.getString("fname");
                if (accountStatus.equals("1")) {
                    password = Encription.Encript.decript(password);
                } else {
                    password = "ACCOUNTDEACT";
                }
                
            }else{
                password = "ERRORPASSWORD";
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println(password);
        return password;
    }
    
    public static boolean deactivateAccount(String username){
        return DB.iud("UPDATE useraccount SET accountstatus='0' WHERE username='"+username+"'");
    }
    
    public static boolean deactivateAllCurrentStatus(){
        return DB.iud("UPDATE useraccount SET currentstatus='0'");
    }
    
    public static boolean activateCurrentStatus(String username){
        return DB.iud("UPDATE useraccount SET currentstatus='1' WHERE username='"+username+"'");
    }
    
    private static ResultSet rs_usernameAccount;
    private static boolean isAccountAvailable = false;
    public static boolean isAvailableAccount(String username){
        rs_usernameAccount = DB.search("SELECT username FROM useraccount WHERE username='"+username+"'");
        
        try {
            if (rs_usernameAccount.next()) {
                isAccountAvailable = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return isAccountAvailable;
    }
    
    
    
    public static ResultSet getHintAnswer(String username){
        return DB.search("SELECT recoveryhint , recoveryanswer FROM useraccount WHERE username='"+username+"'");
    }
    
    public static boolean changePassword(String username, String password){
        return DB.iud("UPDATE useraccount SET password='"+password+"', currentstatus='0', accountstatus='1' WHERE username='"+username+"'");
    }
    
    public static boolean isSuperAdmin(String username, String password){
        
        try {
            System.out.println(username);
            System.out.println(password);
            ResultSet rs = DB.search("SELECT * FROM superadmin WHERE superusername = '"+username+"' AND superpassword = '"+password+"'  ");
            
            if(rs.next()){
                return true;
            }
           
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
         return false;
    }
public static boolean isAccountActive(String username){
        ResultSet result = DB.search("SELECT useraccount.accountstatus FROM useraccount WHERE useraccount.username = '"+username+"' ");
        
        try {
            if(result.next()){
                if(result.getString("useraccount.accountstatus").equals("1")){
                    return true;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }


}
//activate deactivate krna tka krnna one
