package mx.habil.capacitacion.dao.impl.test;

import org.apache.log4j.Logger;
<<<<<<< HEAD

=======
import org.springframework.transaction.annotation.Transactional;
>>>>>>> 8f1b663c11714ac922280ab7f130b4c2799c3c63

import junit.framework.TestCase;
import mx.habil.capacitacion.dao.CarreraDao;
import mx.habil.capacitacion.dao.exception.DaoException;
import mx.habil.capacitacion.dto.CarreraDto;
import mx.habil.capacitacion.factory.CapacitacionBeanFactory;

public class CarreraDaoImplTestCase extends TestCase {

	private static final Logger logger = Logger.getLogger(CarreraDaoImplTestCase.class);

	private CarreraDao carreraDao = (CarreraDao) CapacitacionBeanFactory.getInstance().getBean("CarreraDao");

	
	public void testRecuperaPorId() {
		logger.debug("inicio");

		Integer id = 1;
		CarreraDto carreraDto = null;
		
		logger.debug("ejecutando prueba unitaria");
		
		try {
			
			carreraDto = carreraDao.recuperarPorId(id);
			
			if( (carreraDto == null) ) {
				logger.debug("No existe una carrera con identificador: " + id + ", en "
						+ "el catalogo de carreras de la universidad.");
			} 
			
			logger.debug("carreraDto.getNombre(): " + carreraDto.getNombre());
			logger.debug("carreraDto.getEdificio(): " + carreraDto.getEdificio());
			logger.debug("carreraDto.toString(): " + carreraDto.toString());
			
		} catch (DaoException daoEx) {
			logger.error(daoEx.getMessage(), daoEx);
		}

		logger.debug("fin");
	}
	
	
	public void testSave(){
		logger.debug("inicio");
		CarreraDto carreraDto= new CarreraDto();
		String nombre = "Administracion";
		String edificio= "A";
		String jefeCarrera="Roberto";
		String laboratorio="A1";
		
		carreraDto.setNombre(nombre);		
		carreraDto.setEdificio(edificio);
		carreraDto.setJefeCarrera(jefeCarrera);
		carreraDto.setLaboratorio(laboratorio);
		

		try {
			carreraDao.save(carreraDto);
		} catch (DaoException e) {
			
		}
		
		
		logger.debug("fin");
	}

	// public void testInsertar() throws BoException {
	// logger.debug("Inicio");
	//
	// String nombre = "Ingenieria Materiales";
	// String edificio = "E";
	// String jefe_carrera = "Diana Marisol";
	// String laboratorio = "A1";
	// carreraDao.insertar(nombre, edificio, jefe_carrera, laboratorio);
	//
	// logger.debug("Registro exitoso");
	// logger.debug("Fin");
	//
	// }
	//
	// public void testEliminar() throws BoException {
	// logger.debug("Inicio");
	// int id = 3;
	//
	// carreraDao.eliminar(id);
	// logger.debug("Registro exitoso");
	// logger.debug("Fin");
	// }
	//
	// public void testEditar() throws BoException {
	// logger.debug("Inicio");
	//
	// String nombre = "Ingenieria ambiental";
	// String edificio = "AS";
	// String jefe_carrera = "Roberto Ramirez";
	// String laboratorio = "A";
	// int id = 0;
	//
	// carreraDao.editar(nombre, edificio, jefe_carrera, laboratorio, id);
	// logger.info("Registro exitoso");
	//
	// logger.debug("Fin");
	// }
	//
	// public void testRecuperar() {
	// logger.debug("Inicio");
	//
	// carreraDao.recuperar();
	// logger.debug("Fin");
	// }
	//
	// public void testRecuperarPorId() throws BoException {
	// logger.debug("Inicio");
	// int id = 1;
	// carreraDao.recuperarPorId(id);
	// logger.debug("Registro exitoso");
	// logger.debug("Fin");
	// }
	
	
}
