
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author juliano
 */
public class ConnectionFactory {

    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/taskapp";
    public static final String USER = "root";
    public static final String PASS = "";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            throw new RuntimeException("Erro na conexão com o banco de dados", ex);
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement resultSet) {
        try {
            if (connection != null) {
                connection.close();
            }

            if (resultSet != null) {
                connection.close();
            }

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar a conex�o com o banco de dados", ex);
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet) {

        try {

            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }

            if (resultSet != null) {
                connection.close();
            }

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar a conex?o com o banco de dados", ex);
        }

    }

}
