package Database.Tables;

import Database.Beans.SupplimentBrand;
import Database.DB;
import java.sql.ResultSet;

/**
 *
 * @author divsi
 */
public class BrandNameManagement {
    
    public static ResultSet getAllBrand(){
        return DB.search("SELECT * FROM brand");
    }    
    
    
    public static ResultSet getSelectedBrand(String brandName){
        return DB.search("SELECT * FROM brand WHERE brand='"+brandName+"'");
    }    
    
 
    
    
    public static boolean saveBrandName(SupplimentBrand supModel){
        System.out.println(supModel.getBrandName());
        return DB.iud("INSERT INTO brand (brand) VALUES ('"+supModel.getBrandName()+"')");
    }
    
    
    public static boolean updateBrandName(SupplimentBrand supModel){
        System.out.println(supModel.getBrandName());
        return DB.iud("UPDATE brand SET brand='"+supModel.getBrandName()+"'  WHERE idbrand='"+supModel.getBrandId()+"' ");
    }
    
}
