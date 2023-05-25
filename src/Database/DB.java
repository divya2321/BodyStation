package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class DB {

    private static Connection c;

    public static synchronized Connection getConnection() throws Exception {
        if (c == null) {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root", "1234");
        }
        return c;
    }

    public static boolean iud(String query) {
        try {
            getConnection().createStatement().executeUpdate(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static ResultSet search(String query) {
        try {
            return getConnection().createStatement().executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int iudReturnId(String query) {
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.executeUpdate();
            ResultSet generateKeys = preparedStatement.getGeneratedKeys();

            if (generateKeys.next()) {
                System.out.println(generateKeys.getInt(1));
                return generateKeys.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
