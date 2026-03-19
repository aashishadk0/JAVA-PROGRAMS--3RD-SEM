package preparedstatement;

import java.sql.*;

public class Deletion {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            PreparedStatement pst = conn.prepareStatement("update students set name = ? where id = ?");

            pst.setString(1, "Hari");
            pst.setInt(2, 43);

            int result = pst.executeUpdate();
            System.out.println(result + " Row is Updated on database.");
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
