package cl.desafiolatam.productosLimpieza.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

private Connection connection;
	
	public Connection getConexion() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/productos_limpieza?serverTimezone=UTC";
			String usuario="root";
			String clave="Archie.2628";
			connection = DriverManager.getConnection(url, usuario, clave);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return connection;
	}
}
