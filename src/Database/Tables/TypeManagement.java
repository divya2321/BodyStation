package Database.Tables;

import Database.Beans.SupplimentBrand;
import Database.Beans.TypeModel;
import Database.DB;
import java.sql.ResultSet;

/**
 *
 * @author divsi
 */
public class TypeManagement {
    
    public static ResultSet getAllType(){
        return DB.search("SELECT * FROM type");
    }    
    
    
    public static ResultSet getSelectedType(String typeName){
        return DB.search("SELECT * FROM type WHERE type='"+typeName+"'");
    }    
    
    
    public static boolean saveTypeName(TypeModel typeModel){
        return DB.iud("INSERT INTO type (type) VALUES ('"+typeModel.getTypeName()+"')");
    }
    
    
    public static boolean updateTypeName(TypeModel typeModel){
        return DB.iud("UPDATE type SET type='"+typeModel.getTypeName()+"'  WHERE idtype='"+typeModel.getTypeId()+"' ");
    }
    
}
