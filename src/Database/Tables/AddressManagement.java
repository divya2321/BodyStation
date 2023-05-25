package Database.Tables;

import Database.Beans.Address;
import Database.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddressManagement {
    
    public static String selectedAddressId;
    public static ResultSet lastAddressSet;
    public static int lastAddressId;
    
    public static int saveAddress(Address addressModel){        
        
         return DB.iudReturnId("INSERT INTO address (no, street1, street2, city) VALUES ('"+addressModel.getNo()+"','"+addressModel.getStreet1()+"','"+addressModel.getStreet2()+"','"+addressModel.getCity()+"')");
   
    }
    
    public static boolean updateAddress(Address addressModel){
        System.out.println(addressModel.getNo());
        System.out.println(addressModel.getStreet1());
        System.out.println(addressModel.getStreet2());
        System.out.println(addressModel.getCity());
        System.out.println(addressModel.getAddressId());
        return DB.iud("UPDATE address SET no='"+addressModel.getNo()+"', street1='"+addressModel.getStreet1()+"', street2='"+addressModel.getStreet2()+"',"
                + "  city='"+addressModel.getCity()+"' "
                                + "WHERE idAddress='"+addressModel.getAddressId()+"' ");
        
    }
    
    public static ResultSet getSelectedAddress(){
        return DB.search("SELECT * FROM address WHERE nic='"+selectedAddressId+"' ");
    }
    
    public static ResultSet getAllAddress(){
        return DB.search("SELECT * FROM address");
    }
    
    
}
