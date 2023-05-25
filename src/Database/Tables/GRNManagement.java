package Database.Tables;

import Database.Beans.GRNModel;
import Database.DB;
import java.sql.ResultSet;

/**
 *
 * @author divsi
 */
public class GRNManagement {
 
    private static ResultSet rs_grn;
    private static int maxId;
    
    public static int getGRNId(){
        try {
            rs_grn = DB.search("SELECT MAX(idgrn) FROM grn");
            if (rs_grn.next()) {
                maxId = rs_grn.getInt("MAX(idgrn)")+1;
            } else {
                maxId = 1;
            }
            System.out.println("GRNID"+maxId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return maxId;
    }
    
    public static int getSavedGRN(GRNModel gmodel){
        return DB.iudReturnId("INSERT INTO grn (supplier_idsupplier,subtotal,nettotal,date,useraccount_iduseraccount) "
                + "VALUES ('"+gmodel.getIdsupplier()+"','"+gmodel.getSubTotal()+"','"+gmodel.getNetTotal()+"',"
                        + "NOW(),'"+gmodel.getIduser()+"')");
    }
    
    
    public static int getSavedSupplimentGRN(GRNModel gmodel){
        return DB.iudReturnId("INSERT INTO supplimentgrn (grn_idgrn,suppliment_idsuppliment,qty,amount,unitdiscount) "
                + "VALUES ('"+gmodel.getIdgrn()+"','"+gmodel.getIdsuppliment()+"','"+gmodel.getQty()+"','"+gmodel.getAmount()+"','"+gmodel.getUnitdiscount()+"')");
    }
    
    
    
    public static int getSavedStock(GRNModel gmodel){
        return DB.iudReturnId("INSERT INTO supplimentstock(qty,mfd,exp,sellingprice,supplimentgrn_idsupplimentgrn) "
                + "VALUES ('"+gmodel.getQty()+"','"+gmodel.getMfd()+"','"+gmodel.getExp()+"','"+gmodel.getSellingPrice()+"','"+gmodel.getIdsupplimentgrn()+"')");
    }
    
    public static ResultSet getAllGRN(){
        return DB.search("SELECT *, CONCAT(supplier.fname,' ',supplier.lname) AS suppliername, (grn.subtotal-grn.nettotal) AS grndiscount, "
                + "CONCAT(generaldetail.fname,' ',generaldetail.lname) AS usersname FROM grn INNER JOIN supplimentgrn "
                + "INNER JOIN supplimentstock INNER JOIN supplier INNER JOIN useraccount INNER JOIN staff INNER JOIN generaldetail "
                + "ON supplimentgrn.grn_idgrn = grn.idgrn AND supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                + "AND supplier.idsupplier = grn.supplier_idsupplier AND useraccount.staff_idstaff = staff.idstaff "
                + "AND staff.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail  AND grn.useraccount_iduseraccount = useraccount.iduseraccount");
    }
    
    public static ResultSet getAllGRNById(String grnid){
        return DB.search("SELECT *, CONCAT(supplier.fname,' ',supplier.lname) AS suppliername, (subtotal - nettotal) AS discount, "
                + "CONCAT(generaldetail.fname,' ',generaldetail.lname) AS usersname FROM grn INNER JOIN supplimentgrn "
                + "INNER JOIN supplimentstock INNER JOIN supplier INNER JOIN useraccount INNER JOIN staff INNER JOIN generaldetail "
                + "ON supplimentgrn.grn_idgrn = grn.idgrn AND supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                + "AND supplier.idsupplier = grn.supplier_idsupplier AND useraccount.staff_idstaff = staff.idstaff "
                + "AND staff.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail AND grn.useraccount_iduseraccount = useraccount.iduseraccount WHERE grn.idgrn = '"+grnid+"'");
    }
    
    
    public static ResultSet getAllGRNByDate(String fromdate, String todate){
        return DB.search("SELECT *, CONCAT(supplier.fname,' ',supplier.lname) AS suppliername, (subtotal - nettotal) AS discount, "
                + "CONCAT(generaldetail.fname,' ',generaldetail.lname) AS usersname FROM grn INNER JOIN supplimentgrn "
                + "INNER JOIN supplimentstock INNER JOIN supplier INNER JOIN useraccount INNER JOIN staff INNER JOIN generaldetail "
                + "ON supplimentgrn.grn_idgrn = grn.idgrn AND supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                + "AND supplier.idsupplier = grn.supplier_idsupplier AND useraccount.staff_idstaff = staff.idstaff "
                + "AND staff.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail  AND grn.useraccount_iduseraccount = useraccount.iduseraccount WHERE "
                + "DATE(grn.date)>='"+fromdate+"' AND DATE(grn.date)<='"+todate+"'");
    }
    
    public static ResultSet getSelectedGRNItem(String grnid){
        System.out.println("AAWAA");
        return DB.search("SELECT *, CONCAT(brand,'-',supplimentname) AS supname, ((amount-unitdiscount)*supplimentgrn.qty) AS allamount FROM grn "
                + "INNER JOIN supplimentgrn  INNER JOIN suppliment INNER JOIN brand ON "
                + "supplimentgrn.grn_idgrn = grn.idgrn AND suppliment.brand_idbrand =brand.idbrand "
                + "AND supplimentgrn.suppliment_idsuppliment = suppliment.idsuppliment "
                + "WHERE idgrn = '"+grnid+"'");
    }
    
    
    
}
