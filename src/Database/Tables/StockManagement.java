package Database.Tables;

import Database.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nipun
 */
public class StockManagement {

    public static ResultSet getAllStock() {
        return DB.search("SELECT idsupplimentstock, idsupplimentstock, brand.brand,supplimentname, mfd, exp, amount, unitdiscount, sellingprice, SUM(supplimentstock.qty) AS stkqty "
                + "FROM supplimentstock INNER JOIN suppliment INNER JOIN supplimentgrn INNER JOIN brand "
                + "ON supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                + "AND suppliment.idsuppliment = supplimentgrn.suppliment_idsuppliment "
                + "AND suppliment.brand_idbrand = brand.idbrand "
                + "GROUP BY CONCAT(brand.brand,supplimentname,mfd,exp,unitdiscount,amount) "
                + "ORDER BY idsupplimentstock");
    }

    public static boolean setSellingPrice(double sellPrice, int supStkId) {
        return DB.iud("UPDATE supplimentstock SET sellingprice='" + sellPrice + "' WHERE  supplimentstock.idsupplimentstock = '" + supStkId + "'");
    }

    public static ResultSet getAllEmptyStock() {
        return DB.search("SELECT idsupplimentstock, idsupplimentstock, brand.brand,supplimentname,mfd, exp, amount, unitdiscount, sellingprice, SUM(supplimentstock.qty) AS stkqty "
                + "FROM supplimentstock INNER JOIN suppliment INNER JOIN supplimentgrn INNER JOIN brand "
                + "ON supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                + "AND suppliment.idsuppliment = supplimentgrn.suppliment_idsuppliment "
                + "AND suppliment.brand_idbrand = brand.idbrand "
                + "WHERE supplimentstock.qty = 0 "
                + "GROUP BY CONCAT(brand.brand,supplimentname,mfd,exp,unitdiscount,amount) "
                + "ORDER BY idsupplimentstock");
    }

    public static ResultSet getAllExpiredStock() {
        return DB.search("SELECT idsupplimentstock, idsupplimentstock, brand.brand,supplimentname,  mfd, exp, amount, unitdiscount, sellingprice, SUM(supplimentstock.qty) AS stkqty "
                + "FROM supplimentstock INNER JOIN suppliment INNER JOIN supplimentgrn INNER JOIN brand "
                + "ON supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                + "AND suppliment.idsuppliment = supplimentgrn.suppliment_idsuppliment "
                + "AND suppliment.brand_idbrand = brand.idbrand "
                + "WHERE exp>NOW() "
                + "GROUP BY CONCAT(brand.brand,supplimentname,mfd,exp,unitdiscount,amount) "
                + "ORDER BY idsupplimentstock ");
    }

    public static ResultSet getAllSAvailabletSock() {
        return DB.search("SELECT idsupplimentstock, idsupplimentstock, brand.brand,supplimentname,  mfd, exp, amount, unitdiscount, sellingprice, SUM(supplimentstock.qty) AS stkqty "
                + "FROM supplimentstock INNER JOIN suppliment INNER JOIN supplimentgrn INNER JOIN brand "
                + "ON supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                + "AND suppliment.idsuppliment = supplimentgrn.suppliment_idsuppliment  "
                + "AND suppliment.brand_idbrand = brand.idbrand "
                + "WHERE supplimentstock.qty > 0  "
                + "GROUP BY CONCAT(brand.brand,supplimentname,mfd,exp,unitdiscount,amount) "
                + "ORDER BY idsupplimentstock ");
    }

    public static ResultSet getAllExpiredStockSoon() {
        return DB.search("SELECT idsupplimentstock, idsupplimentstock, brand.brand,supplimentname,  mfd, exp, amount, unitdiscount, sellingprice, SUM(supplimentstock.qty) AS stkqty "
                + "FROM supplimentstock INNER JOIN suppliment INNER JOIN supplimentgrn INNER JOIN brand "
                + "ON supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                + "AND suppliment.idsuppliment = supplimentgrn.suppliment_idsuppliment "
                + "AND suppliment.brand_idbrand = brand.idbrand "
                + "GROUP BY CONCAT(brand.brand,supplimentname,mfd,exp,unitdiscount,amount) "
                + "ORDER BY DATE(exp)");
    }

    public static ResultSet getAllExpiredStockLate() {
        return DB.search("SELECT idsupplimentstock, idsupplimentstock, brand.brand,supplimentname,  mfd, exp, amount, unitdiscount, sellingprice, SUM(supplimentstock.qty) AS stkqty "
                + "FROM supplimentstock INNER JOIN suppliment INNER JOIN supplimentgrn INNER JOIN brand "
                + "ON supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                + "AND suppliment.idsuppliment = supplimentgrn.suppliment_idsuppliment "
                + "AND suppliment.brand_idbrand = brand.idbrand "
                + "GROUP BY CONCAT(brand.brand,supplimentname,mfd,exp,unitdiscount,amount) "
                + "ORDER BY DATE(exp) DESC");
    }

    public static ResultSet getAllStockSuppliment() {
        return DB.search("SELECT idsupplimentstock, idsupplimentstock, brand.brand, supplimentname,  mfd, exp, amount, unitdiscount, sellingprice, SUM(supplimentstock.qty) AS stkqty "
                + "FROM supplimentstock INNER JOIN suppliment INNER JOIN supplimentgrn INNER JOIN brand "
                + "ON supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                + "AND suppliment.idsuppliment = supplimentgrn.suppliment_idsuppliment "
                + "AND suppliment.brand_idbrand = brand.idbrand "
                + "GROUP BY CONCAT(brand.brand,supplimentname,mfd,exp,unitdiscount,amount) "
                + "ORDER BY supplimentname");
    }

    public static ResultSet getAllStockBrand() {
        return DB.search("SELECT idsupplimentstock, idsupplimentstock, brand.brand, supplimentname,  mfd, exp, amount, unitdiscount, sellingprice, SUM(supplimentstock.qty) AS stkqty "
                + "FROM supplimentstock INNER JOIN suppliment INNER JOIN supplimentgrn INNER JOIN brand "
                + "ON supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                + "AND suppliment.idsuppliment = supplimentgrn.suppliment_idsuppliment "
                + "AND suppliment.brand_idbrand = brand.idbrand "
                + "GROUP BY CONCAT(supplimentname,mfd,exp,unitdiscount,amount) "
                + "ORDER BY brand");
    }

    public static ResultSet getSuggestSuppliment(String sugText) {
        return DB.search("SELECT idsupplimentstock, idsupplimentstock, brand,supplimentname, CONCAT(brand.brand,'-',supplimentname,' ,','LKR',sellingprice) AS supname, "
                + " mfd, exp, amount, unitdiscount, sellingprice, SUM(supplimentstock.qty) AS stkqty "
                + "FROM supplimentstock INNER JOIN suppliment INNER JOIN supplimentgrn INNER JOIN brand "
                + "ON supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                + "AND suppliment.idsuppliment = supplimentgrn.suppliment_idsuppliment "
                + "AND suppliment.brand_idbrand = brand.idbrand "
                + "WHERE CONCAT(brand.brand,'-',supplimentname,' ,','LKR',sellingprice) LIKE '%" + sugText + "%' "
                + "GROUP BY CONCAT(brand.brand,supplimentname,mfd,exp,unitdiscount,amount,sellingprice) "
                + "ORDER BY idsupplimentstock");
    }

    public static ResultSet getSockSuppliment(String sugText) {
        return DB.search("SELECT idsupplimentstock, idsupplimentstock, brand,supplimentname, CONCAT(brand.brand,'-',supplimentname) AS supname, "
                + " mfd, exp, amount, unitdiscount, sellingprice, SUM(supplimentstock.qty) AS stkqty "
                + "FROM supplimentstock INNER JOIN suppliment INNER JOIN supplimentgrn INNER JOIN brand "
                + "ON supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                + "AND suppliment.idsuppliment = supplimentgrn.suppliment_idsuppliment "
                + "AND suppliment.brand_idbrand = brand.idbrand "
                + "WHERE CONCAT(brand.brand,'-',supplimentname) LIKE '%" + sugText + "%' "
                + "GROUP BY CONCAT(brand.brand,supplimentname,mfd,exp,unitdiscount,amount,sellingprice) "
                + "ORDER BY idsupplimentstock");
    }

    
    private static ResultSet rs_stk;

    public static int getSelectedStockId(String brandSup, String uPrice) {
        int stkid = -1;
        try {
            rs_stk = DB.search("SELECT idsupplimentstock FROM supplimentstock INNER JOIN brand INNER JOIN suppliment INNER JOIN supplimentgrn ON "
                    + "supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                    + "AND suppliment.idsuppliment = supplimentgrn.suppliment_idsuppliment "
                    + "AND suppliment.brand_idbrand = brand.idbrand "
                    + "WHERE CONCAT(brand.brand,'-',supplimentname)='" + brandSup + "' AND sellingprice='" + uPrice + "' "
                    + "GROUP BY CONCAT(brand.brand,supplimentname,mfd,exp,unitdiscount,amount,sellingprice) "
                    + "ORDER BY idsupplimentstock");

            if (rs_stk.next()) {

                stkid = Integer.parseInt(rs_stk.getString("idsupplimentstock"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stkid;
    }
    
    public static void updateStockQty(int stkId, double sellQty){
        DB.iud("UPDATE supplimentstock SET supplimentstock.qty = (supplimentstock.qty-'"+sellQty+"') WHERE supplimentstock.idsupplimentstock='"+stkId+"' ");
        GUI.StockPanel.getInstance().loadStock(StockManagement.getAllStock());
    }

    
    public static double getDueQty(int stkId){
     double stkQty= 0.0;
        try {
            rs_stk = DB.search("SELECT SUM(supplimentstock.qty) AS stkqty FROM supplimentstock INNER JOIN brand INNER JOIN suppliment INNER JOIN supplimentgrn ON "
                    + "supplimentstock.supplimentgrn_idsupplimentgrn = supplimentgrn.idsupplimentgrn "
                    + "AND suppliment.idsuppliment = supplimentgrn.suppliment_idsuppliment "
                    + "AND suppliment.brand_idbrand = brand.idbrand "
                    + "WHERE idsupplimentstock='" + stkId + "' "
                    + "GROUP BY CONCAT(brand.brand,supplimentname,mfd,exp,unitdiscount,amount,sellingprice) ");

            if (rs_stk.next()) {

                stkQty = Double.parseDouble(rs_stk.getString("stkQty"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stkQty;
    }
}
