package Database.Tables;

import Database.Beans.Address;
import Database.Beans.GeneralDetail;
import Database.Beans.MemberModel;
import Database.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import GUI.RegistrationPanel;

public class MemberManagement {

    static int savedAddress = 0;
    static int savedDetails = 0;

    public static boolean isSuccessful = false;

    public static ResultSet allreadyMemberSet;

    public static ResultSet isAlreadyMember(String nic) {

        allreadyMemberSet = DB.search("SELECT * FROM member "
                + "INNER JOIN generaldetail "
                + "INNER JOIN address "
                + "INNER JOIN packagename "
                + "ON "
                + "member.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "member.address_idaddress = address.idaddress "
                + "AND "
                + "member.packagename_idpackagename = packagename.idpackagename "
                + "WHERE (UPPER(nic)) = '" + nic.toUpperCase() + "' ");

        return allreadyMemberSet;

    }

    public static boolean saveMember(Address addressModel, GeneralDetail gdm, MemberModel memberModel) {
        savedAddress = AddressManagement.saveAddress(addressModel);
        savedDetails = GeneralDetailManagement.saveGeneralDetail(gdm);

        if (savedAddress != -1) {
            if (savedDetails != -1) {
                DB.iud("INSERT INTO member (code, address_idaddress, generaldetail_idgeneraldetail, packagename_idpackagename, useraccount_iduseraccount)"
                        + " VALUES ('" + memberModel.getCode() + "', '" + savedAddress + "', '" + savedDetails + "', '" + memberModel.getPackageId() + "', '1') ");
                isSuccessful = true;
        GUI.dashboardPanel.getInstance().setAllMemCount();
            }
            
        }
        return isSuccessful;
    }

    public static boolean updateMember(Address addressModel, GeneralDetail gdm, MemberModel memberModel) {

        AddressManagement.updateAddress(addressModel);
        GeneralDetailManagement.updateGeneralDetail(gdm);
        

        return DB.iud("UPDATE member SET code='" + memberModel.getCode() + "', "
                + "  packagename_idpackagename='" + memberModel.getPackageId() + "'"
                + " WHERE idmember='" + memberModel.getMemberId() + "' ");
    }

    private static ResultSet rs_allCnt;

    public static int getAllMemCount() {
        int i = 0;
        try {
            rs_allCnt = DB.search("SELECT COUNT(idmember) FROM member INNER JOIN generaldetail ON member.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail");
            if (rs_allCnt.next()) {
                i = rs_allCnt.getInt("COUNT(idmember)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MemberManagement.class.getName()).log(Level.SEVERE, null, ex);
        }

        return i;
    }
    
    private static ResultSet rs_allActCnt;

    public static int getAllActMemCount() {
        int i = 0;
        try {
            rs_allActCnt = DB.search("SELECT COUNT(idmember) FROM member INNER JOIN generaldetail ON member.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail"
                    + " WHERE status='1'");
            if (rs_allActCnt.next()) {
                i = rs_allActCnt.getInt("COUNT(idmember)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MemberManagement.class.getName()).log(Level.SEVERE, null, ex);
        }

        return i;
    }
    
    private static ResultSet rs_allDeactCnt;

    public static int getAllDeactMemCount() {
        int i = 0;
        try {
            rs_allDeactCnt = DB.search("SELECT COUNT(idmember) FROM member INNER JOIN generaldetail ON member.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail"
                    + " WHERE status='0'");
            if (rs_allDeactCnt.next()) {
                i = rs_allDeactCnt.getInt("COUNT(idmember)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MemberManagement.class.getName()).log(Level.SEVERE, null, ex);
        }

        return i;
    }
    
    
    private static int currentCount = 0;
    private static ResultSet memberMax;

    public static int getMemberCount() {
        try {
            memberMax = DB.search("SELECT MAX(idmember) FROM member");

            while (memberMax.next()) {
                if (memberMax.getString("MAX(idmember)") != null) {
                    currentCount = Integer.parseInt(memberMax.getString("MAX(idmember)"));
                } else {
                    currentCount = 0;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffManagement.class.getName()).log(Level.SEVERE, null, ex);
        }

        return currentCount + 1;
    }

    public static ResultSet getAllMember() {
        return DB.search("SELECT *, CONCAT(generaldetail.fname,' ',generaldetail.mname,' ',generaldetail.lname,' ') AS fullname FROM member INNER JOIN address "
                + "INNER JOIN generaldetail INNER JOIN packagename "
                + "INNER JOIN useraccount ON member.address_idaddress=address.idaddress "
                + "AND member.generaldetail_idgeneraldetail=generaldetail.idgeneraldetail "
                + "AND member.packagename_idpackagename=packagename.idpackagename "
                + "AND member.useraccount_iduseraccount=useraccount.iduseraccount "
                + "ORDER BY idmember");
    }

    public static ResultSet getSelectedMember(String memid) {
        return DB.search("SELECT *, CONCAT(fname,' ',mname,' ',lname,' ') AS fullname FROM member INNER JOIN address INNER JOIN generaldetail "
                + "INNER JOIN useraccount ON member.address_idaddress=address.idaddress "
                + "AND member.generaldetail_idgeneraldetail=generaldetail.idgeneraldetail "
                + "AND member.useraccount_iduseraccount=useraccount.iduseraccount WHERE idmember='" + memid + "'");
    }

    public static ResultSet getAllActivatedMember() {
        return DB.search("SELECT * FROM member  "
                + "INNER JOIN generaldetail "
                + "INNER JOIN packagename "
                + "ON "
                + "member.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "member.packagename_idpackagename = packagename.idpackagename "
                + "WHERE generaldetail.status='1'");
    }

    public static ResultSet getAllDeactivatedMember() {
        return DB.search("SELECT * FROM member "
                + "INNER JOIN generaldetail "
                + "INNER JOIN packagename "
                + "ON "
                + "member.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "member.packagename_idpackagename = packagename.idpackagename "
                + "WHERE generaldetail.status='0'");
    }

    public static ResultSet getSelectedAllMemberNic(String memberNic) {
        return DB.search("SELECT *, CONCAT(generaldetail.fname,' ',generaldetail.mname,' ',generaldetail.lname) AS fullname FROM member "
                + "INNER JOIN address "
                + "INNER JOIN generaldetail "
                + "INNER JOIN packagename "
                + "ON "
                + "member.address_idaddress = address.idaddress "
                + "AND "
                + "member.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "member.packagename_idpackagename = packagename.idpackagename "
                + "WHERE "
                + "LOWER(nic) LIKE '%" + memberNic + "%' ");
    }

    public static ResultSet getSelectedMemberByName(String memberName) {
        return DB.search("SELECT * FROM member "
                + "INNER JOIN address "
                + "INNER JOIN generaldetail "
                + "INNER JOIN packagename "
                + "ON "
                + "member.address_idaddress = address.idaddress "
                + "AND "
                + "member.address_idaddress = address.idaddress "
                + "AND "
                + "member.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "member.packagename_idpackagename = packagename.idpackagename "
                + "WHERE "
                + "CONCAT(fname,' ', mname, ' ', lname) LIKE '%" + memberName + "%' ");
    }

    public static ResultSet getMemberSortName() {
        return DB.search("SELECT *, CONCAT(fname,' ',mname,' ',lname) AS fullname FROM member "
                + "INNER JOIN address "
                + "INNER JOIN generaldetail "
                + "INNER JOIN packagename "
                + "ON "
                + "member.address_idaddress = address.idaddress "
                + "AND "
                + "member.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "member.packagename_idpackagename = packagename.idpackagename "
                + "ORDER BY "
                + "fname ");
    }

    public static ResultSet getMemberSortNo() {
        return DB.search("SELECT *,CONCAT(fname,' ',mname,' ',lname) AS fullname FROM member "
                + "INNER JOIN address "
                + "INNER JOIN generaldetail "
                + "INNER JOIN packagename "
                + "ON "
                + "member.address_idaddress = address.idaddress "
                + "AND "
                + "member.generaldetail_idgeneraldetail = generaldetail.idgeneraldetail "
                + "AND "
                + "member.packagename_idpackagename = packagename.idpackagename "
                + "ORDER BY "
                + "idmember ");
    }

    public static boolean isMemberActive(String memberId) {
        ResultSet result = DB.search("SELECT status FROM generaldetail INNER JOIN member ON member.generaldetail_idgeneraldetail ="
                + " generaldetail.idgeneraldetail WHERE member.idmember = '" + memberId + "' ");

        try {
            if (result.next()) {
                if (result.getString("status").equals("1")) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
