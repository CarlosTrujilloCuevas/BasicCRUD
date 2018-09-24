package personas.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conexion {

    private static final String jdbc_driver = "com.mysql.jdbc.Driver";
    private static final String jdbc_url = "jdbc:mysql://localhost:3306/SGA?autoReconnect=true&useSSL=false";
    private static final String jdbc_user = "root";
    private static final String jdbc_pass = "admin";

    public static Connection getConnection() {

        Connection conexion = null;

        try {
            Class.forName(jdbc_driver);
            conexion = DriverManager.getConnection(jdbc_url, jdbc_user, jdbc_pass);
            System.out.println("Conexion exitosa !");

        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
        return conexion;
    }

    public static void close(Connection conexion) {
        try {
            conexion.close();
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }

    public void close(PreparedStatement preparedStatement) {
        try {
            preparedStatement.close();
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }

    public void close(ResultSet resultSet) {
        try {
            resultSet.close();
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
    }
}
