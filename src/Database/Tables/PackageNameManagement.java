package Database.Tables;

import Database.Beans.PackageName;
import Database.DB;
import PopUpInterface.NewPackageName;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import GUI.adminPanel;

public class PackageNameManagement {

    public static int selectedId;
    public static String selectedStatus;

    public static ResultSet packageNameModelSet;
    private static int oldId;
    public static int stateValue;

    private static int idPackageName;
    public static int idSelectedPackageName;

    public static void savePackageName(String packageName) {
        DB.iud("INSERT INTO packagename (packagename) VALUES ('" + packageName+ "')");
        adminPanel ap = adminPanel.getInstance();
        ap.loadPackageName();
    }

    public static void updatePackageName(PackageName packageNameModel) {
//        idPackageName = getPackageNameModel(packageName);
String s = "UPDATE packagename SET packagename='" + packageNameModel.getPackageName() + "' "
                + "WHERE idpackagename='" + packageNameModel.getIdPackageName() + "' ";
        System.out.println(s);
        DB.iud(s);
        adminPanel ap = adminPanel.getInstance();
        ap.loadPackageName();
    }

    private static PackageName packageNameModel;

    public static PackageName getPackageNameModel(String packageName) {
        System.out.println("A"+packageName);
        packageNameModelSet = DB.search("SELECT * FROM packagename WHERE packagename='" + packageName + "'");
        packageNameModel = new PackageName();
        try {
            while (packageNameModelSet.next()) {
                packageNameModel.setIdPackageName(packageNameModelSet.getInt("idpackagename"))
                        .setPackageName(packageNameModelSet.getString("packagename"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("B"+packageNameModel.getPackageName());
        System.out.println("C"+packageNameModel.getIdPackageName());
        return packageNameModel;
    }
    
    
    private static ResultSet packageNameSet;

    public static ResultSet getAllPackageNames() {
        System.out.println("Calling get all package names");
        packageNameSet = DB.search("SELECT * from packagename");
        return packageNameSet;
    }


    private static ResultSet rs_packageName;
    private static String packageName;

    public static String getPackageName(String packageNameId) {

        try {
            rs_packageName = DB.search("SELECT packagename FROM packagename WHERE idpackagename='" + packageNameId + "'");
            if (rs_packageName.next()) {
                packageName = rs_packageName.getString("packagename");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
            return packageName;
    }
    

}
