package pe.edu.peruano.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
    //Java database connector
    public static String JDBC_DRIVER = "com.mysql.jdbc.Driver";//5
    public  static String URL = "jdbc:mysql://localhost:3306/java_fundamentals";

    //Credenciales
    public static String USERNAME = "root";
    public static String PASSWORD = "";

    public static Connection obtenerConexion(){

        Connection cnn = null;

        try {
            Class.forName(JDBC_DRIVER);
            cnn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        }catch (ClassNotFoundException e1){
            e1.printStackTrace();
        }catch (SQLException e2){
            e2.printStackTrace();
        }

        return cnn;
    }
}
