package learn.note.database;

import java.sql.*;

public class LinkMysql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 用于动态加载包
        // java 6以上不再需要，会自动加载
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "lipeng";
        String password = "lipeng...";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM table");

        int rowAffected = statement.executeUpdate("UPDATE table SET column1 = 'new_value' WHERE id = 1");

        while (resultSet.next()) {
            String columnValue = resultSet.getString("column_name");
        }

        connection.close();
    }
}
