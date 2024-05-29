package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PsqlConnection {

    public Connection  getConnection () throws SQLException, ClassNotFoundException {
        // JDBC URL for PostgreSQL
        String jdbcUrl = "jdbc:postgresql://localhost:5432/database";
        String username = "postgres";
        String password = "postgres";

        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

        connection.prepareStatement("SELECT * FROM users");

       return connection;
    }


}
