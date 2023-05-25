package Database.Tables;

import Database.Beans.SupplimentModel;
import Database.DB;
import java.sql.ResultSet;

/**
 *
 * @author divsi
 */
public class SupplimentManagement {
    
    public static ResultSet getAllSuppliment(){
        return DB.search("SELECT * FROM suppliment INNER JOIN brand INNER JOIN type "
                + "ON suppliment.brand_idbrand = brand.idbrand AND suppliment.type_idtype = type.idtype");
    }
    
    public static ResultSet getSelectedSuppliment(String supId){
        return DB.search("SELECT * FROM suppliment INNER JOIN brand INNER JOIN type "
                + "ON suppliment.brand_idbrand = brand.idbrand AND suppliment.type_idtype = type.idtype "
                + "WHERE idsuppliment = '"+supId+"' ");
    }    
    
    public static ResultSet getSelectedSupplimentID(String suppliment){
        return DB.search("SELECT idsuppliment FROM suppliment INNER JOIN brand INNER JOIN type "
                + "ON suppliment.brand_idbrand = brand.idbrand AND suppliment.type_idtype = type.idtype "
                + "WHERE CONCAT(brand,'-',supplimentname) = '"+suppliment+"' ");
    }
    
    public static boolean saveSuppliment(SupplimentModel supModel){
        return DB.iud("INSERT INTO suppliment (supplimentname, brand_idbrand, type_idtype) "
                + "VALUES ('"+supModel.getSupplimentName()+"','"+supModel.getIdBrand()+"', '"+supModel.getIdType()+"') ");
    }
    
    public static boolean updateSuppliment(SupplimentModel supModel){
        return DB.iud("UPDATE suppliment SET "
                + "supplimentname = '"+supModel.getSupplimentName()+"', "
                        + "brand_idbrand = '"+supModel.getIdBrand()+"', "
                                + "type_idtype = '"+supModel.getIdType()+"' "
                                        + "WHERE idsuppliment='"+supModel.getIdSuppliment()+"'");
    }
    
}
