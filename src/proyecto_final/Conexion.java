package proyecto_final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/proyectofinal";
    private static final String USUARIO = "root"; 
    private static final String CLAVE = "";      

    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName(CONTROLADOR);
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conexion;
    }
}
