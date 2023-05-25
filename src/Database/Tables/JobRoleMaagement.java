package Database.Tables;

import Database.Beans.JobRole;
import Database.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JobRoleMaagement {
    public static int selectedJobrole;
    public static String selectedJobroleName;
    public static ResultSet selectedJobRoleSet;
    
    public static String selectJobRole(String idjobrole){
        selectedJobRoleSet=DB.search("SELECT * FROM jobrole WHERE idjobrole='"+idjobrole+"' ");
        try {
            if (selectedJobRoleSet.next()) {
                selectedJobroleName = selectedJobRoleSet.getString("jobrole");
            }
        } catch (Exception e) {
        }
        return selectedJobroleName;
    }
    
    public static void saveJobRole(JobRole jobroleModel){
        DB.iud("INSERT INTO jobrole(jobrole) VALUES('"+jobroleModel.getJobrole()+"')");
    }
    
    public static void updateJobRole(JobRole jobroleModel){
        DB.iud("UPDATE jobrole SET jobrole='"+jobroleModel.getJobrole()+"' WHERE idjobrole = '"+jobroleModel.getIdjobrole()+"' ");
    }
    
    public static ResultSet getAllJobRole(){
        return DB.search("SELECT * FROM jobrole");
    }
    
    public static ResultSet getSelectedJobRole(String jobrole){
        try {
            selectedJobRoleSet = DB.search("SELECT * FROM jobrole WHERE jobrole='"+jobrole+"'");
            if (selectedJobRoleSet.next()) {
                selectedJobrole = Integer.parseInt(selectedJobRoleSet.getString("idjobrole"));
                System.out.println("aaaaaaaaaaaaaaaaaaa"+selectedJobrole);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JobRoleMaagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return selectedJobRoleSet;
    }
}
