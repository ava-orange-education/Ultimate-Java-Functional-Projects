import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcQueryAndPreparedStatementExample {

    private static final String URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        runStatementExample();
        runPreparedStatementExample();
    }

    // Example 1: Executing a query with Statement
    private static void runStatementExample() {
        System.out.println("=== Statement example ===");
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM users")) {

            while (resultSet.next()) {
                System.out.println("User ID:   " + resultSet.getInt("id"));
                System.out.println("User Name: " + resultSet.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Example 2: Using PreparedStatement for secure SQL queries
    private static void runPreparedStatementExample() {
        System.out.println("=== PreparedStatement example ===");
        String sql = "SELECT * FROM users WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, 1); // Set parameter value
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    System.out.println("User Name: " + resultSet.getString("name"));
                } else {
                    System.out.println("No user found with id = 1");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
