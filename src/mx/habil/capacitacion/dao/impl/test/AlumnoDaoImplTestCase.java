package mx.habil.capacitacion.dao.impl.test;

import org.apache.log4j.Logger;
import junit.framework.TestCase;
import mx.habil.capacitacion.bs.BoException;
import mx.habil.capacitacion.dao.AlumnoDao;
import mx.habil.capacitacion.dao.impl.AlumnoDaoImpl;

public class AlumnoDaoImplTestCase extends TestCase {

	private AlumnoDao alumnoDao = new AlumnoDaoImpl();
	private static final Logger logger = Logger.getLogger(AlumnoDaoImplTestCase.class);
//
//	public void testInsertar() throws BoException {
//		logger.debug("inicio");
//		String nombre = "Ramon";
//		String ap_paterno = "Diaz";
//		String ap_materno = "Lopez";
//		int telefono = 56378945;
//		int edad = 23;
//		int id_carrera = 2;
//
//		alumnoDao.insertar(nombre, ap_paterno, ap_materno, telefono, edad, id_carrera);
//		logger.info("Registro exitoso.");
//		logger.debug("fin");
//	}
//
//	public void testEliminar() throws BoException {
//		logger.debug("Inicio");
//		int id = 2;
//		alumnoDao.eliminar(id);
//		logger.debug("Registro exitoso");
//		logger.debug("Fin");
//	}
//
//	public void testEditar() throws BoException {
//		logger.debug("Inicio");
//		String nombre = "Rodrigo";
//		String ap_paterno = "Gomez";
//		String ap_materno = "Lopez";
//		int telefono = 56437890;
//		int edad = 24;
//		int id_carrera = 1;
//		int id = 2;
//		alumnoDao.editar(nombre, ap_paterno, ap_materno, telefono, edad, id_carrera, id);
//
//		logger.debug("Fin");
//	}
//
//	public void testRecuperar() {
//		logger.debug("Inicio");
//		alumnoDao.recuperar();
//		logger.debug("Fin");
//	}
//
//	public void testRecuperarPorId() throws BoException {
//		logger.debug("Inicio");
//		int id = 2;
//		alumnoDao.recuperarPorId(id);
//
//		logger.debug("Fin");
//	}
}
