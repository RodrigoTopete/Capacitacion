package mx.habil.capacitacion.dao.impl;

//import java.sql.Statement;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;

//import mx.habil.capacitacion.bs.BoException;
import mx.habil.capacitacion.dao.CarreraDao;
import mx.habil.capacitacion.dao.exception.DaoException;
import mx.habil.capacitacion.dao.hql.CarreraHQLHelper;
import mx.habil.capacitacion.dto.CarreraDto;
//import mx.habil.capacitacion.dto.ConexionBaseDeDatos;

public class CarreraDaoImpl extends CapacitacionDaoImpl implements CarreraDao {

	private static final Logger logger = Logger.getLogger(CarreraDaoImpl.class);
	
	private CarreraHQLHelper ql;

	public CarreraHQLHelper getQl() {
		return ql;
	}

	public void setQl(CarreraHQLHelper ql) {
		this.ql = ql;
	}

	@Override
	public CarreraDto recuperarPorId(final Integer id) throws DaoException {
		logger.debug("inicio");
		CarreraDto carreraDto = null;

		try {

			HibernateTemplate hibernateTemplate = getHibernateTemplate();
			logger.debug("hibernateTemplate.hashCode(): " + hibernateTemplate.hashCode());
			
			carreraDto = hibernateTemplate.execute(new HibernateCallback<CarreraDto>() {

				public CarreraDto doInHibernate(Session session) throws HibernateException {
					logger.debug("inicio");

					CarreraDto carreraDtoAux = null;

					String queryHqlString = ql.getHQL(CarreraHQLHelper.RECUPERAR_POR_ID_CARRERA);
					logger.debug("queryHqlString: " + queryHqlString);
					logger.debug("id: " + id);

					Query queryHql = session.createQuery(queryHqlString);
					queryHql.setParameter("idCarrera", id);

					carreraDtoAux = (CarreraDto) queryHql.uniqueResult();

					logger.debug("fin");
					return carreraDtoAux;
				}

			});

		} catch (Exception ex) {
			logger.error("Ha ocurrido un error");
			throw new DaoException(ex.getMessage(), ex);
		}

		logger.debug("fin");
		return carreraDto;
	}

	// public void insertar(String nombre, String edificio, String jefe_carrera,
	// String laboratorio) {
	// logger.debug("inicio");
	// try {
	// conexion = new ConexionBaseDeDatos();
	// } catch (SQLException e1) {
	// }
	// Connection con = conexion.getConnection();
	// logger.info("con: " + con);
	// Statement st;
	// String sql = "INSERT INTO CARRERA VALUES(NULL,'" + nombre + "','" +
	// edificio + "','" + jefe_carrera + "','"
	// + laboratorio + "',TRUE,NULL,NULL,NULL,NULL)";
	// try {
	// st = con.createStatement();
	// st.executeUpdate(sql);
	// con.close();
	// st.close();
	// logger.debug("Resgistrado con exito");
	// } catch (SQLException e) {
	// }
	// logger.debug("fin");
	// }
	//
	// public void eliminar(int id) {
	// logger.debug("inicio");
	// try {
	// conexion = new ConexionBaseDeDatos();
	// } catch (SQLException e) {
	// }
	// Connection con = conexion.getConnection();
	// logger.info("Conexion" + con);
	// Statement st;
	// String sql = "DELETE FROM CARRERA WHERE ID_CARRERA=" + id;
	// try {
	// st = con.createStatement();
	// st.executeUpdate(sql);
	// logger.debug("ID Alumno: " + id + " Eliminado");
	// con.close();
	// st.close();
	// logger.debug("Fin");
	// } catch (SQLException e) {
	// }
	// }
	//
	// public void editar(String nombre, String edificio, String jefe_carrera,
	// String laboratorio, int id) {
	// logger.debug("Inicio");
	// try {
	// conexion = new ConexionBaseDeDatos();
	// } catch (SQLException e) {
	// }
	// Connection con = conexion.getConnection();
	// logger.debug("Conexion" + con);
	// Statement st = null;
	// String sql = ("UPDATE CARRERA SET NOMBRE_CARRERA='" + nombre +
	// "',EDIFICIO='" + edificio + "',JEFE_CARRERA='"
	// + jefe_carrera + "',LABORATORIO='" + laboratorio + "' WHERE ID_CARRERA="
	// + id + "");
	// try {
	// st = con.createStatement();
	// } catch (SQLException e) {
	// }
	// try {
	// st.executeUpdate(sql);
	// logger.debug("Actualizado con exito");
	// con.close();
	// st.close();
	// } catch (SQLException e) {
	// }
	// }
	//
	// public void recuperar() {
	// logger.debug("Inicio");
	// try {
	// conexion = new ConexionBaseDeDatos();
	// } catch (SQLException e) {
	// }
	// Connection con = conexion.getConnection();
	// logger.debug("Conexion" + con);
	// Statement st;
	// ResultSet rs;
	// String sql = "SELECT * FROM CARRERA";
	// try {
	// st = con.createStatement();
	// rs = st.executeQuery(sql);
	// while (rs.next()) {
	// logger.debug("ID: " + rs.getInt(1));
	// logger.debug("Nombre: " + rs.getString(2));
	// logger.debug("Edificio: " + rs.getString(3));
	// logger.debug("Jefe de Carrera: " + rs.getString(4));
	// logger.debug("Laboratorio: " + rs.getString(5));
	// logger.debug("Activo: " + rs.getBoolean(6));
	// }
	// con.close();
	// st.close();
	// rs.close();
	// logger.debug("Fin");
	// } catch (SQLException e) {
	// }
	// }

	// public void recuperarPorId(Integer id) {
	// logger.debug("Inicio");
	// try {
	// conexion = new ConexionBaseDeDatos();
	// } catch (SQLException e) {
	// }
	// Connection con = conexion.getConnection();
	// logger.debug("Conexion" + con);
	// Statement st;
	// ResultSet rs;
	// String sql = "SELECT * FROM CARRERA WHERE ID_CARRERA=" + id;
	// try {
	// st = con.createStatement();
	// rs = st.executeQuery(sql);
	// while (rs.next()) {
	// logger.debug("ID: " + rs.getInt(1));
	// logger.debug("Nombre: " + rs.getString(2));
	// logger.debug("Edificio: " + rs.getString(3));
	// logger.debug("Jefe de Carrera: " + rs.getString(4));
	// logger.debug("Laboratorio: " + rs.getString(5));
	// logger.debug("Activo: " + rs.getBoolean(6));
	//
	// }
	// con.close();
	// st.close();
	// rs.close();
	// logger.debug("Fin");
	// } catch (SQLException e) {
	// }
	// }

	// public void recuperarPorId(Integer id) {
	// logger.debug("Inicio");
	// try {
	// conexion = new ConexionBaseDeDatos();
	// } catch (SQLException e) {
	// }
	// Connection con = conexion.getConnection();
	// logger.debug("Conexion" + con);
	// Statement st;
	// ResultSet rs;
	// String sql = "SELECT * FROM CARRERA WHERE ID_CARRERA=" + id;
	// try {
	// st = con.createStatement();
	// rs = st.executeQuery(sql);
	// while (rs.next()) {
	// logger.debug("ID: " + rs.getInt(1));
	// logger.debug("Nombre: " + rs.getString(2));
	// logger.debug("Edificio: " + rs.getString(3));
	// logger.debug("Jefe de Carrera: " + rs.getString(4));
	// logger.debug("Laboratorio: " + rs.getString(5));
	// logger.debug("Activo: " + rs.getBoolean(6));
	//
	// }
	// con.close();
	// st.close();
	// rs.close();
	// logger.debug("Fin");
	// } catch (SQLException e) {
	// }
	// }
	//

}
