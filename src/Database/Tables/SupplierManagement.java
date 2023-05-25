package Database.Tables;

import Database.Beans.Supplier;
import Database.DB;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SupplierManagement {
    
    private static int supplierId;
    private static ResultSet rs_max;
    
    public static int setSupplierId(){
        try {
            rs_max = DB.search("SELECT MAX(idsupplier) FROM supplier");
            if (rs_max.next()) {
                supplierId = rs_max.getInt("MAX(idsupplier)")+1;                
            } else {
                supplierId = 1;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return supplierId ;
    }
    
    public static boolean saveSupplier(Supplier supplierModel){
        return DB.iud("INSERT INTO supplier (fname, lname, contact1, contact2, description) "
                + "VALUES ('"+supplierModel.getFname()+"','"+supplierModel.getLname()+"','"+supplierModel.getContact1()+"',"
                        + "'"+supplierModel.getContact2()+"','"+supplierModel.getDescription()+"') ");
    }
    
    public static boolean updateSupplier(Supplier supplierModel){
        return DB.iud("UPDATE supplier SET fname='"+supplierModel.getFname()+"',lname='"+supplierModel.getLname()+"',"
                + "contact1='"+supplierModel.getContact1()+"', contact2='"+supplierModel.getContact2()+"', "
                        + "description='"+supplierModel.getDescription()+"' "
                            + "WHERE idsupplier='"+supplierModel.getSupplierId()+"'");
    }
    
    public static ResultSet getSelectedSupplier(int supplierId){
        return DB.search("SELECT * FROM supplier WHERE idsupplier='"+supplierId+"'");
    }
    
    
    public static ResultSet getAllSupplier(){
        return DB.search("SELECT *, CONCAT(fname,' ',lname) AS name FROM supplier");
    }
    
    
    public static ResultSet getSupplierId(String supplierName){
        return DB.search("SELECT * FROM supplier WHERE CONCAT(fname,' ',lname) = '"+supplierName+"'");
    }
    
}
