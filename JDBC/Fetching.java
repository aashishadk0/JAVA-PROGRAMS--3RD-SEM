import java.sql.*;

public class Fetching {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from students");
            System.out.println(rs.getInt(0) + "\t" + rs.getString(0) + "\t" + rs.getString(0));
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(1) + "\t" + rs.getString(1));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
