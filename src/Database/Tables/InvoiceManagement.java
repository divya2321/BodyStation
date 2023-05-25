package Database.Tables;

import Database.Beans.InvoiceModel;
import Database.Beans.PaymentInvoiceModel;
import Database.Beans.SupplimentInvoiceModel;
import Database.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author divsi
 */
public class InvoiceManagement {

    private static ResultSet rs_payInv, rs_buyerName;
    private static int payInvId;
    private static String buyerName, packageName;

    public static int getPayInvId() {
        try {
            rs_payInv = DB.search("SELECT MAX(idinvoice) FROM invoice");

            if (rs_payInv.next()) {
                payInvId = rs_payInv.getInt("MAX(idinvoice)") + 1;
            } else {
                payInvId = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Pay INV ID" + payInvId);
        return payInvId;
    }

    public static String getBuyerName(String nic) {
//        System.out.println(nic);
        try {
            rs_buyerName = DB.search("SELECT CONCAT(fname,' ',mname,' ',lname) AS fullname, packagename.packagename ,idmember "
                    + "FROM generaldetail INNER JOIN member INNER JOIN packagename "
                    + "ON member.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                    + "AND member.packagename_idpackagename = packagename.idpackagename "
                    + "WHERE generaldetail.nic = '" + nic + "' ");

            if (rs_buyerName.next()) {
                buyerName = rs_buyerName.getString("fullname");
                packageName = rs_buyerName.getString("packagename");

            } else {
                buyerName = " ";
                packageName = " ";
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(buyerName + "-" + packageName);
        return buyerName + "-" + packageName;
    }

    public static ResultSet getOldInv(String nic) {
        return DB.search("SELECT * FROM generaldetail INNER JOIN invoice INNER JOIN paymentinvoice "
                + "ON generaldetail.nic=invoice.buyernic AND paymentinvoice.invoice_idinvoice=invoice.idinvoice "
                + "WHERE generaldetail.nic='" + nic + "'");
    }

    public static ResultSet getAllPayInvDetail(String dataSet) {

        return DB.search("SELECT * FROM packagename INNER JOIN package  "
                + "ON  "
                + "package.packagename_idpackagename = packagename.idpackagename "
                + "WHERE "
                + "CONCAT(packagename.packagename,',',packagetype) = '" + dataSet + "'");
    }

    public static int saveInvoice(InvoiceModel invoiceModel, String invType) {
        System.out.println("Thulata awa");
        return DB.iudReturnId("INSERT INTO invoice (buyernic, date, subTotal, netTotal, useraccount_iduseraccount, type) "
                + "VALUES('" + invoiceModel.getInvNic() + "',NOW(),'" + invoiceModel.getSubTotal() + "','" + invoiceModel.getNetTotal() + "','" + invoiceModel.getUserId() + "','" + invType + "')");
    }

    public static boolean savePaymentInvoice(PaymentInvoiceModel payInvModel) {
        return DB.iud("INSERT INTO paymentinvoice (paymentinvoice.from, paymentinvoice.to, payment, invoice_idinvoice, member_idmember) "
                + "VALUES ('" + payInvModel.getFromD() + "','" + payInvModel.getToD() + "','" + payInvModel.getPaymentType() + "','" + payInvModel.getInvId() + "','" + payInvModel.getMemId() + "')");
    }

    public static boolean saveSupplimentnvoice(SupplimentInvoiceModel supInvModel) {
        return DB.iud("INSERT INTO supplimentinvoice (qty, discount, supplimentstock_idsupplimentstock, invoice_idinvoice) "
                + "VALUES ('" + supInvModel.getQty() + "','" + supInvModel.getDiscount() + "','" + supInvModel.getSupStockId() + "','" + supInvModel.getInvId() + "')");
    }

    public static ResultSet getAllAVailableSuppliments() {
        return DB.search("SELECT CONCAT(brand.brand,'-',suppliment.supplimentname,',STK',idsupplimentstock) AS fullsup "
                + "FROM suppliment INNER JOIN supplimentgrn INNER JOIN supplimentstock INNER JOIN brand  "
                + "ON supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                + "AND supplimentgrn.suppliment_idsuppliment = suppliment.idsuppliment "
                + "AND suppliment.brand_idbrand = brand.idbrand WHERE supplimentstock.exp < NOW() AND supplimentstock.qty>0 "
                + "ORDER BY idsupplimentstock ");
    }

    private static ResultSet rs_stk;

    public static double getPriceOfStock(int stockId) {
        double uprc = 0.0;
        rs_stk = DB.search("SELECT sellingprice FROM supplimentstock WHERE idsupplimentstock = '" + stockId + "'");
        try {
            if (rs_stk.next()) {
                uprc = rs_stk.getDouble("sellingprice");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return uprc;
    }

    public static ResultSet getAllSupInvoice() {
        return DB.search("SELECT *, CONCAT(fname,' ', lname) AS usernm FROM invoice "
                + "INNER JOIN useraccount INNER JOIN staff INNER JOIN generaldetail "
                + "ON invoice.useraccount_iduseraccount = useraccount.iduseraccount "
                + "AND useraccount.staff_idstaff = staff.idstaff AND staff.generaldetail_idgeneraldetail=generaldetail.idgeneraldetail "
                + "WHERE type='sup'");
    }
    
    public static ResultSet getAllSupInvoiceInvId(String invId) {
        return DB.search("SELECT *, CONCAT(fname,' ', lname) AS usernm FROM invoice "
                + "INNER JOIN useraccount INNER JOIN staff INNER JOIN generaldetail "
                + "ON invoice.useraccount_iduseraccount = useraccount.iduseraccount "
                + "AND useraccount.staff_idstaff = staff.idstaff AND staff.generaldetail_idgeneraldetail=generaldetail.idgeneraldetail "
                + "WHERE type='sup' AND invoice.idinvoice='"+invId+"'");
    }
    
    
    public static ResultSet getAllSupInvoiceNic(String nic) {
        return DB.search("SELECT *, CONCAT(fname,' ', lname) AS usernm FROM invoice "
                + "INNER JOIN useraccount INNER JOIN staff INNER JOIN generaldetail "
                + "ON invoice.useraccount_iduseraccount = useraccount.iduseraccount "
                + "AND useraccount.staff_idstaff = staff.idstaff AND staff.generaldetail_idgeneraldetail=generaldetail.idgeneraldetail "
                + "WHERE type='sup' AND buyernic='"+nic+"'");
    }
    
    
    public static ResultSet getAllSupInvoiceDate(String fromdate, String todate) {
        return DB.search("SELECT *, CONCAT(fname,' ', lname) AS usernm FROM invoice "
                + "INNER JOIN useraccount INNER JOIN staff INNER JOIN generaldetail "
                + "ON invoice.useraccount_iduseraccount = useraccount.iduseraccount "
                + "AND useraccount.staff_idstaff = staff.idstaff AND staff.generaldetail_idgeneraldetail=generaldetail.idgeneraldetail "
                + "WHERE type='sup' AND DATE(invoice.date)>='"+fromdate+"' AND DATE(invoice.date)<='"+todate+"'");
    }
    
    public static ResultSet getAllPayInvoice() {
        return DB.search("SELECT *, CONCAT(fname,' ', lname) AS usernm FROM invoice INNER JOIN useraccount INNER JOIN staff INNER JOIN "
                + "generaldetail INNER JOIN paymentinvoice ON invoice.useraccount_iduseraccount = useraccount.iduseraccount AND useraccount.staff_idstaff = "
                + "staff.idstaff AND staff.generaldetail_idgeneraldetail= generaldetail.idgeneraldetail AND invoice.idinvoice = paymentinvoice.invoice_idinvoice WHERE type='pay'");
    }
    
    
    public static ResultSet getAllPayInvoiceInvId(String invid) {
        return DB.search("SELECT *, CONCAT(fname,' ', lname) AS usernm FROM invoice "
                + "INNER JOIN useraccount INNER JOIN staff INNER JOIN generaldetail "
                + "INNER JOIN paymentinvoice ON invoice.useraccount_iduseraccount = useraccount.iduseraccount "
                + "AND useraccount.staff_idstaff = staff.idstaff AND staff.generaldetail_idgeneraldetail=generaldetail.idgeneraldetail AND invoice.idinvoice = paymentinvoice.invoice_idinvoice "
                + "WHERE type='pay' AND invoice.idinvoice='"+invid+"'");
    }
    
    
    public static ResultSet getAllPayInvoiceNic(String nic) {
        return DB.search("SELECT *, CONCAT(fname,' ', lname) AS usernm FROM invoice "
                + "INNER JOIN useraccount INNER JOIN staff INNER JOIN generaldetail "
                + "INNER JOIN paymentinvoice ON invoice.useraccount_iduseraccount = useraccount.iduseraccount "
                + "AND useraccount.staff_idstaff = staff.idstaff AND staff.generaldetail_idgeneraldetail=generaldetail.idgeneraldetail  AND invoice.idinvoice = paymentinvoice.invoice_idinvoice "
                + "WHERE type='pay' AND buyernic='"+nic+"'");
    }
    
    
    public static ResultSet getAllPayInvoiceDate(String fromdate, String todate) {
        return DB.search("SELECT *, CONCAT(fname,' ', lname) AS usernm FROM invoice "
                + "INNER JOIN useraccount INNER JOIN staff INNER JOIN generaldetail "
                + "INNER JOIN paymentinvoice ON invoice.useraccount_iduseraccount = useraccount.iduseraccount "
                + "AND useraccount.staff_idstaff = staff.idstaff AND staff.generaldetail_idgeneraldetail=generaldetail.idgeneraldetail  AND invoice.idinvoice = paymentinvoice.invoice_idinvoice  "
                + "WHERE type='pay' AND  DATE(invoice.date)>='"+fromdate+"' AND DATE(invoice.date)<='"+todate+"' ");
    }
    

    
    public static ResultSet getSupInvbyInvID(String invid){
        return DB.search("SELECT * FROM invoice INNER JOIN supplimentinvoice INNER JOIN supplimentstock INNER JOIN supplimentgrn "
                + "INNER JOIN suppliment INNER JOIN brand "
                + "ON invoice.idinvoice = supplimentinvoice.invoice_idinvoice  "
                + "AND supplimentinvoice.supplimentstock_idsupplimentstock = supplimentstock.idsupplimentstock "
                + "AND supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                + "AND suppliment.brand_idbrand = brand.idbrand "
                + "AND supplimentgrn.suppliment_idsuppliment = suppliment.idsuppliment WHERE supplimentinvoice.invoice_idinvoice='"+invid+"'");
    }


    
    public static ResultSet getPayInvbyInvID(String invid){
        return DB.search("SELECT *, CONCAT(fname,' ',mname,' ',lname) AS fullname FROM invoice INNER JOIN paymentinvoice "
                + "INNER JOIN member INNER JOIN generaldetail INNER JOIN packagename "
                + "ON invoice.idinvoice = paymentinvoice.invoice_idinvoice "
                + "AND paymentinvoice.member_idmember = member.idmember "
                + "AND member.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND member.packagename_idpackagename = packagename.idpackagename WHERE paymentinvoice.invoice_idinvoice='"+invid+"'");
    }
    


}
