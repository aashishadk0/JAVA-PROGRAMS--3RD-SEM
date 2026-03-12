import java.sql.*;

public class Updating {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            Statement st = conn.createStatement();
            int result = st.executeUpdate("update students set Name='Aashish' where ID=1");
            System.out.println(result + " Rows Updated successfully.");
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}