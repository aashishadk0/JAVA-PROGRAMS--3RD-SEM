package preparedstatement;

import java.sql.*;

//Program to insert data using PreparedStatement to prevent SQLInjection.
public class PrepraredStatementDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            PreparedStatement pst = conn.prepareStatement("insert into students values(?,?,?)");
            pst.setInt(1, 43);
            pst.setString(2, "Aashish Adhikari");
            pst.setString(3, "Gaindakot");

            int result = pst.executeUpdate();
            System.out.println(result + " Row is added on database.");
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
