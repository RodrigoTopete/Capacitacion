package mx.habil.capacitacion.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import mx.habil.capacitacion.dao.AlumnoDao;
import mx.habil.capacitacion.dao.exception.DaoException;
import mx.habil.capacitacion.dao.hql.AlumnoHQLHelper;


public class AlumnoDaoImpl extends HibernateDaoSupport implements AlumnoDao {

	private static final Logger logger = Logger.getLogger(AlumnoDaoImpl.class);
//	private static ConexionBaseDeDatos conexion;
	
	private AlumnoHQLHelper ql;

//	public void insertar(String nombre, String ap_paterno, String ap_materno, int telefono, int edad, int id_carrera) {
//		logger.debug("inicio");
//		try {
//			conexion = new ConexionBaseDeDatos();
//		} catch (SQLException e1) {
//			logger.debug("error conectar");
//		}
//		Connection con = conexion.getConnection();
//		logger.info("con: " + con);
//		Statement st;
//		String sql = "INSERT INTO ALUMNO VALUES(NULL,'" + nombre + "','" + ap_paterno + "','" + ap_materno + "','"
//				+ telefono + "','" + edad + "','" + id_carrera + "',TRUE,NULL,NULL,NULL,NULL)";
//		try {
//			st = con.createStatement();
//			st.executeUpdate(sql);
//			logger.debug("Resgistrado con exito");
//			con.close();
//			st.close();
//		} catch (SQLException e) {
//		}
//		logger.debug("fin");
//	}
//
//	public void eliminar(int id) {
//		logger.debug("inicio");
//		try {
//			conexion = new ConexionBaseDeDatos();
//		} catch (SQLException e) {
//
//		}
//		Connection con = conexion.getConnection();
//		logger.info("Conexion" + con);
//		Statement st;
//		String sql = "DELETE FROM ALUMNO WHERE ID_ALUMNO=" + id;
//		try {
//			st = con.createStatement();
//			st.executeUpdate(sql);
//			logger.debug("ID Alumno: " + id + " Eliminado");
//
//			con.close();
//			st.close();
//			logger.debug("Fin");
//		} catch (SQLException e) {
//		}
//	}
//
//	public void editar(String nombre, String ap_paterno, String ap_materno, int telefono, int edad, int id_Carrera,
//			int id) {
//		logger.debug("Inicio");
//		try {
//			conexion = new ConexionBaseDeDatos();
//		} catch (SQLException e) {
//		}
//		Connection con = conexion.getConnection();
//		logger.debug("Conexion" + con);
//		Statement st = null;
//		String sql = ("UPDATE ALUMNO SET NOMBRE='" + nombre + "',APELLIDO_PATERNO='" + ap_paterno
//				+ "',APELLIDO_MATERNO='" + ap_materno + "',TELEFONO='" + telefono + "',EDAD='" + edad + "',ID_CARRERA='"
//				+ id_Carrera + "' WHERE ID_ALUMNO=" + id + "");
//		try {
//			st = con.createStatement();
//		} catch (SQLException e) {
//		}
//		try {
//			st.executeUpdate(sql);
//			logger.debug("Actualizado con exito");
//			con.close();
//			st.close();
//		} catch (SQLException e) {
//		}
//	}
//
//	public void recuperar() {
//		logger.debug("Inicio");
//		try {
//			conexion = new ConexionBaseDeDatos();
//		} catch (SQLException e) {
//		}
//		Connection con = conexion.getConnection();
//		logger.debug("Conexion" + con);
//		Statement st;
//		ResultSet rs;
//		String sql = "SELECT * FROM Alumno";
//		try {
//			st = con.createStatement();
//			rs = st.executeQuery(sql);
//			while (rs.next()) {
//				logger.debug("ID: " + rs.getInt(1));
//				logger.debug("Nombre: " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
//				logger.debug("Telefono: " + rs.getInt(5));
//				logger.debug("Edad: " + rs.getInt(6));
//				logger.debug("ID_Carrera: " + rs.getInt(7));
//				logger.debug("Activo: " + rs.getBoolean(8));
//			}
//			con.close();
//			st.close();
//			rs.close();
//			logger.debug("Fin");
//		} catch (SQLException e) {
//		}
//	}

	public void recuperarPorId(Integer id) throws DaoException {
		logger.debug("Inicio");
//		try {
//			conexion = new ConexionBaseDeDatos();
//		} catch (SQLException e) {
//		}
//		Connection con = conexion.getConnection();
//		logger.debug("Conexion" + con);
//		Statement st;
//		ResultSet rs;
//		String sql = "SELECT * FROM ALUMNO WHERE ID_ALUMNO=" + id;
//		try {
//			st = con.createStatement();
//			rs = st.executeQuery(sql);
//			while (rs.next()) {
//				logger.debug("ID: " + rs.getInt(1));
//				logger.debug("Nombre: " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
//				logger.debug("Telefono: " + rs.getInt(5));
//				logger.debug("Edad: " + rs.getInt(6));
//				logger.debug("ID_Carrera: " + rs.getInt(7));
//				logger.debug("Activo: " + rs.getBoolean(8));
//			}
//			con.close();
//			st.close();
//			rs.close();
//			logger.debug("Fin");
//		} catch (SQLException e) {
//		}
	}

	public AlumnoHQLHelper getQl() {
		return ql;
		
	
	}

	public void setQl(AlumnoHQLHelper ql) {
		this.ql = ql;
	}
}
