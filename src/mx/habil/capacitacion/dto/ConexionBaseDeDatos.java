package mx.habil.capacitacion.dto;

import java.sql.*;

public class ConexionBaseDeDatos {

	private static String servidor = "jdbc:mysql://localhost/universidad";
	private static String user = "universidadusr";
	private static String pass = "1234";
	Connection conexion;

	public ConexionBaseDeDatos() throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(servidor, user, pass);

		} catch (ClassNotFoundException ex) {
		}
	}

	public Connection getConnection() {
		return conexion;
	}

}
