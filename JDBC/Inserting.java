import java.sql.*;

public class Inserting {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();
            // int result = st.executeUpdate("INSERT INTO students
            // VALUES(1,'Ram','Chitwan'),(2,'Shyam','Kathmandu'),(3,'Hari','Pokhara'),(4,'Sita','Butwal'),(5,'Gita','Biratnagar')");
            // System.out.println(result + " Rows are inserted.");

            int result = st.executeUpdate("INSERT INTO students VALUES(1,'Aashish','Nawalpur')");
            System.out.println(result + " Row is inserted.");
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
