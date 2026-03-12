import java.sql.*;

public class Deleting {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            Statement st = conn.createStatement();
            int result = st.executeUpdate("delete from students where id=1");
            System.out.println(result + " Rows deleted!");
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
