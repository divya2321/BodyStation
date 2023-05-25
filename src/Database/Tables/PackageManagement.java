package Database.Tables;

import Database.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PackageManagement {

    public static int selectedPackageId = 0;
    public static Database.Beans.Package newPackageModel = new Database.Beans.Package();
    public static ResultSet selectedPackageSet, detailedSet;

    public static boolean savePackage(Database.Beans.Package packageModel) {

        System.out.println(packageModel.getPackageNameId());
        System.out.println(packageModel.getPaymentType());
        System.out.println(packageModel.getAmount());
        System.out.println(packageModel.getPackageStatus());

        return DB.iud("INSERT INTO package (packagename_idpackagename, packagetype ,fee,  status)"
                + "VALUES ('" + packageModel.getPackageNameId() + "',"
                + "'" + packageModel.getPaymentType() + "',"
                + "'" + packageModel.getAmount() + "',"
                + "'" + packageModel.getPackageStatus() + "') ");
    }

    public static boolean updatePackage(Database.Beans.Package packageModel) {
        System.out.println(packageModel.getPaymentType());
        return DB.iud("UPDATE package SET "
                + " packagename_idpackagename='" + packageModel.getPackageNameId() + "',"
                + " packagetype='" + packageModel.getPaymentType() + "',"
                + " fee='" + packageModel.getAmount() + "' "
                + " WHERE idpackage='" + packageModel.getPackageId()+ "' ");
    }

    public static Database.Beans.Package getPackageModel(String selectedPackageId) {
        try {
            selectedPackageSet = DB.search("SELECT * FROM package WHERE idpackage='" + selectedPackageId + "' ");

            if (selectedPackageSet.next()) {
                newPackageModel.setPackageNameId(Integer.parseInt(selectedPackageSet.getString("packagename_idpackagename")))
                        .setPaymentType(selectedPackageSet.getString("packagetype"))
                        .setAmount(Double.parseDouble(selectedPackageSet.getString("fee")))
                        .setPackageStatus(Integer.parseInt(selectedPackageSet.getString("status")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PackageManagement.class.getName()).log(Level.SEVERE, null, ex);
        }

        return newPackageModel;

    }


    public static ResultSet getAllPackages() {
        return DB.search("SELECT * FROM package ");
    }

    public static void changeState(int newStatus, int idpackage) {
        DB.iud("UPDATE package SET status='" + newStatus + "' WHERE idpackage='" + idpackage + "'");
    }

    public static ResultSet getAllDetailedSet() {

        return DB.search("SELECT * FROM package "
                + "INNER JOIN packagename "
                + "ON "
                + "package.packagename_idpackagename=packagename.idpackagename "
                + "WHERE NOT package.`status` = 3 "
                + "ORDER BY package.idpackage");

    }

    public static ResultSet getSelectedPackageDetails(String packageNameId) {
        return DB.search("SELECT * FROM package "
                + "INNER JOIN packagename "
                + "ON "
                + "package.packagename_idpackagename=packagename.idpackagename "
                + "WHERE idpackagename='" + packageNameId + "' ");
    }

    
    public static boolean isPackageActive(String packageId){
        ResultSet result = DB.search("SELECT package.`status` FROM package INNER JOIN packagename ON  packagename.idpackagename ="
                + " package.packagename_idpackagename WHERE package.idpackage = '"+packageId+"' ");
        
        try {
            if(result.next()){
                if(result.getString("package.status").equals("1")){
                    return true;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
}
