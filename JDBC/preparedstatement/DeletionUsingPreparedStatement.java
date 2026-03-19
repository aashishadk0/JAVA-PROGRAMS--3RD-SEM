package preparedstatement;

import java.sql.*;

//Program to insert data using PreparedStatement to prevent SQLInjection.
public class DeletionUsingPreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            PreparedStatement pst = conn.prepareStatement("delete from students where id=?");
            pst.setInt(1, 43);

            int result = pst.executeUpdate();
            System.out.println(result + " Row is deleted from database.");
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
