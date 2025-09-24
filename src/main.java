
 import java.sql.*;

public class main {
    public  main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/product_catalog";
        String user = "root"; // Change this to your MySQL username
        String password = ""; // Change this to your MySQL password

        try {
            // Connect to database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to Database!");

            // Fetch products
            String query = "SELECT * FROM products";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("📦 Product Catalog:");
            System.out.println("----------------------------");
            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("product_id") +
                    " | Name: " + rs.getString("product_name") +
                    " | Category: " + rs.getString("category") +
                    " | Price: ₹" + rs.getDouble("price") +
                    " | Stock: " + rs.getInt("stock_quantity")
                );
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("❌ Database Error: " + e.getMessage());
        }
    }
}   

