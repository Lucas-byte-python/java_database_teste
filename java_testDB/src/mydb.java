import java.sql.*;

public class mydb {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    ""
            );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from login");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("email"));
                System.out.println(resultSet.getString("senha"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
