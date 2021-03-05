package pe.edu.peruano.ui;

import pe.edu.peruano.data.ConexionMySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestCliente {
    public static void main(String[] args) {


        try{
            Connection cnn = ConexionMySQL.obtenerConexion();

            //Consultas
            String query = "SELECT * FROM categoria";
            Statement stmt = cnn.createStatement();

            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("id_categoria");
                String nombre = rs.getString("nombre");
                System.out.println("ID: " + id + " - Nombre: " + nombre);
            }

            rs.close();
            stmt.close();
            cnn.close();


        }catch (SQLException e){
            e.printStackTrace();
        }


    }
}
